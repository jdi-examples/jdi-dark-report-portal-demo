package com.epam.jdi.tests.steps;

import com.epam.jdi.api.LaunchControllerApi;
import com.epam.jdi.enums.LaunchStatus;
import com.epam.jdi.model.DeleteBulkRQ;
import com.epam.jdi.model.DeleteBulkRS;
import com.epam.jdi.model.FinishExecutionRQ;
import com.epam.jdi.model.FinishLaunchRS;
import com.epam.jdi.model.LaunchResource;
import com.epam.jdi.model.StartLaunchRQ;
import com.epam.jdi.model.StartLaunchRS;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Steps for UserControllerApi
 */
public class LaunchSteps extends GlobalVariables {

    public void checkLaunchStatus(String project, int launchId, LaunchStatus expectedStatus) {
        if (expectedStatus.equals(LaunchStatus.DELETED)) {
            LaunchControllerApi.getLaunchUsingGET.pathParams(project, launchId).call()
                    .assertThat().statusCode(404)
                    .assertThat().body("message", equalTo(
                    String.format("Launch '%d' not found. Did you use correct Launch ID?", launchId)));
            return;
        }
        LaunchResource launchResource = LaunchControllerApi.getLaunchUsingGET.pathParams(project, launchId).callAsData();
        Assertions.assertThat(launchResource.getStatus())
                .describedAs("Wrong launch status")
                .isEqualTo(expectedStatus.name());
    }

    public int getLaunchId(String project, String uuid) {
        return LaunchControllerApi.getLaunchByUuidUsingGET.pathParams(project, uuid).call()
                .getRaResponse().jsonPath().getInt("id");
    }

    @When("start launch {string} in mode {}")
    public void startLaunchTest(String launchName, StartLaunchRQ.ModeEnum mode) {
        StartLaunchRQ startLaunchRQ = new StartLaunchRQ().setName(launchName)
                .setMode(mode).setStartTime(now());
        String json = gson.toJson(startLaunchRQ);
        StartLaunchRS startLaunchRS = LaunchControllerApi.startLaunch.pathParams(testProject).body(json).callAsData();
        Assertions.assertThat(startLaunchRS.getId())
                .describedAs("Launch id is empty").isNotEmpty();
        Assertions.assertThat(startLaunchRS.getNumber())
                .describedAs("Launch number is empty").isGreaterThan(0);
        if (mode.equals(StartLaunchRQ.ModeEnum.DEBUG)) {
            debugLaunchId = getLaunchId(testProject, startLaunchRS.getId());
        } else {
            launchUUId = startLaunchRS.getId();
            launchId = getLaunchId(testProject, launchUUId);
        }
    }

    @Then("{} launch status is {}")
    public void launchStatusIs(String launchType, LaunchStatus launchStatus) {
        checkLaunchStatus(testProject, "debug".equalsIgnoreCase(launchType) ? debugLaunchId : launchId, launchStatus);
    }

    @When("get all launch names using filter:")
    public void getAllLaunchNamesTest(DataTable table) {
        names = LaunchControllerApi.getAllLaunchNames.pathParams(testProject)
                .queryParams(String.join("&", table.asList())).callAsData();
    }

    @Then("all launch names contain {string}")
    public void allLaunchNamesContain(String launchName) {
        Assertions.assertThat(names).describedAs("There is no launches found").isNotEmpty();
        Assertions.assertThat(names).describedAs("Wrong launch name").allMatch(n -> n.contains(launchName));
    }

    @When("get all debug launches")
    public void getDebugLaunches() {
        resources = LaunchControllerApi.getDebugLaunches.pathParams(testProject).callAsData();
    }

    @Then("all debug launches has mode {}")
    public void checkDebugLaunches(LaunchResource.ModeEnum modeEnum) {
        Assertions.assertThat(resources.getContent()).describedAs("Wrong debug launch mode")
                .allMatch(l -> l.getMode().equals(modeEnum));
    }

    @When("finish launch by launch UUId")
    public void finishLaunch() {
        FinishExecutionRQ finishExecutionRQ = new FinishExecutionRQ().setEndTime(now());
        String json = gson.toJson(finishExecutionRQ);
        FinishLaunchRS finishLaunchRS = LaunchControllerApi.finishLaunchUsingPUT1.pathParams(testProject, launchUUId)
                .body(json).callAsData();
        Assertions.assertThat(finishLaunchRS.getId())
                .describedAs("Wrong launch id").isEqualTo(launchUUId);
    }

    @When("force finish debug launch by Id")
    public void forceFinishLaunch() {
        FinishExecutionRQ finishExecutionRQ = new FinishExecutionRQ().setEndTime(now());
        String json = gson.toJson(finishExecutionRQ);
        operationCompletionRS = LaunchControllerApi.forceFinishLaunchUsingPUT
                .pathParams(testProject, debugLaunchId).body(json).callAsData();
    }

    @Then("check completion message for {} launch:")
    public void checkCompletionMessage(String launchType, String msg) {
        Assertions.assertThat(operationCompletionRS.getMessage())
                .describedAs("Wrong completion message")
                .isEqualTo(String.format(msg, "debug".equals(launchType) ? debugLaunchId : launchId));
    }

    @When("delete launch by Id")
    public void deleteLaunch() {
        operationCompletionRS = LaunchControllerApi.deleteLaunchUsingDELETE
                .pathParams(testProject, launchId).callAsData();
    }

    @When("delete launches by Ids")
    public void deleteLaunches() {
        int[] toDeleteIds = new int[]{debugLaunchId};
        DeleteBulkRQ deleteBulkRQ = new DeleteBulkRQ().setIds(toDeleteIds);
        DeleteBulkRS deleteBulkRS = LaunchControllerApi.deleteLaunchesUsingDELETE
                .pathParams(testProject).body(deleteBulkRQ).callAsData();
        Assertions.assertThat(deleteBulkRS.getSuccessfullyDeleted())
                .describedAs("Ids not deleted").contains(toDeleteIds);
    }

}
