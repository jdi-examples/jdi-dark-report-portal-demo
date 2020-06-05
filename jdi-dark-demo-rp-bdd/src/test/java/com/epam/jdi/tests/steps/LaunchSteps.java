package com.epam.jdi.tests.steps;

import com.epam.http.requests.ServiceInit;
import com.epam.jdi.api.LaunchControllerApi;
import com.epam.jdi.enums.LaunchStatus;
import com.epam.jdi.model.DeleteBulkRQ;
import com.epam.jdi.model.DeleteBulkRS;
import com.epam.jdi.model.FinishExecutionRQ;
import com.epam.jdi.model.FinishLaunchRS;
import com.epam.jdi.model.IterableLaunchResource;
import com.epam.jdi.model.LaunchResource;
import com.epam.jdi.model.OperationCompletionRS;
import com.epam.jdi.model.StartLaunchRQ;
import com.epam.jdi.model.StartLaunchRS;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Steps for UserControllerApi
 */
public class LaunchSteps extends GlobalVariables {

    private int launchId;
    private String launchUUId;
    private int debugLaunchId;

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

    @BeforeClass
    public void initServices() {
        ServiceInit.init(LaunchControllerApi.class, spec);
    }

    @Test(priority = 0)
    public void startLaunchTest() {
        StartLaunchRQ startLaunchRQ = new StartLaunchRQ().setName(launchName).setStartTime(now());
        String json = gson.toJson(startLaunchRQ);
        StartLaunchRS startLaunchRS = LaunchControllerApi.startLaunch.pathParams(testProject).body(json).callAsData();
        Assertions.assertThat(startLaunchRS.getId())
                .describedAs("Launch id is empty").isNotEmpty();
        Assertions.assertThat(startLaunchRS.getNumber())
                .describedAs("Launch number is empty").isGreaterThan(0);
        launchUUId = startLaunchRS.getId();
        launchId = getLaunchId(testProject, launchUUId);
        checkLaunchStatus(testProject, launchId, LaunchStatus.IN_PROGRESS);
    }

    @Test(priority = 10)
    public void startDebugLaunchTest() {
        StartLaunchRQ startLaunchRQ = new StartLaunchRQ()
                .setName(launchName).setMode(StartLaunchRQ.ModeEnum.DEBUG).setStartTime(now());
        String json = gson.toJson(startLaunchRQ);
        StartLaunchRS startLaunchRS = LaunchControllerApi.startLaunch.pathParams(testProject).body(json).callAsData();
        Assertions.assertThat(startLaunchRS.getId())
                .describedAs("Launch id is empty").isNotEmpty();
        Assertions.assertThat(startLaunchRS.getNumber())
                .describedAs("Launch number is empty").isGreaterThan(0);
        String debugLaunchUUId = startLaunchRS.getId();
        debugLaunchId = getLaunchId(testProject, debugLaunchUUId);
        checkLaunchStatus(testProject, debugLaunchId, LaunchStatus.IN_PROGRESS);
    }

    @Test(priority = 20)
    public void getAllLaunchNamesTest() {
        String[] names = LaunchControllerApi.getAllLaunchNames.pathParams(testProject)
                .queryParams("filter.cnt.name=" + launchName).callAsData();
        Assertions.assertThat(names).describedAs("There is no launches found").isNotEmpty();
        Assertions.assertThat(names).describedAs("Wrong launch name").allMatch(n -> n.contains(launchName));
    }

    @Test(priority = 30)
    public void getDebugLaunchesTest() {
        IterableLaunchResource resource = LaunchControllerApi.getDebugLaunches.pathParams(testProject).callAsData();
        Assertions.assertThat(resource.getContent()).describedAs("Wrong debug launch mode")
                .allMatch(l -> l.getMode().equals(LaunchResource.ModeEnum.DEBUG));
    }

    @Test(priority = 40)
    public void finishLaunchUsingPUT1Test() {
        FinishExecutionRQ finishExecutionRQ = new FinishExecutionRQ().setEndTime(now());
        String json = gson.toJson(finishExecutionRQ);
        FinishLaunchRS finishLaunchRS = LaunchControllerApi.finishLaunchUsingPUT1.pathParams(testProject, launchUUId)
                .body(json).callAsData();
        Assertions.assertThat(finishLaunchRS.getId())
                .describedAs("Wrong launch id").isEqualTo(launchUUId);
        checkLaunchStatus(testProject, launchId, LaunchStatus.PASSED);
    }

    @Test(priority = 50)
    public void forceFinishLaunchUsingPUTTest() {
        FinishExecutionRQ finishExecutionRQ = new FinishExecutionRQ().setEndTime(now());
        String json = gson.toJson(finishExecutionRQ);
        OperationCompletionRS operationCompletionRS = LaunchControllerApi.forceFinishLaunchUsingPUT
                .pathParams(testProject, debugLaunchId).body(json).callAsData();
        Assertions.assertThat(operationCompletionRS.getMessage())
                .describedAs("Wrong completion message")
                .isEqualTo(String.format("Launch with ID = '%s' successfully stopped.", debugLaunchId));
        checkLaunchStatus(testProject, debugLaunchId, LaunchStatus.STOPPED);
    }

    @Test(priority = 60)
    public void deleteLaunchUsingDELETETest() {
        OperationCompletionRS operationCompletionRS = LaunchControllerApi.deleteLaunchUsingDELETE
                .pathParams(testProject, launchId).callAsData();
        Assertions.assertThat(operationCompletionRS.getMessage())
                .describedAs("Wrong completion message")
                .isEqualTo(String.format("Launch with ID = '%s' successfully deleted.", launchId));
        checkLaunchStatus(testProject, launchId, LaunchStatus.DELETED);
    }

    @Test(priority = 70)
    public void deleteLaunchesUsingDELETETest() {
        int[] toDeleteIds = new int[]{debugLaunchId};
        DeleteBulkRQ deleteBulkRQ = new DeleteBulkRQ().setIds(toDeleteIds);
        DeleteBulkRS deleteBulkRS = LaunchControllerApi.deleteLaunchesUsingDELETE
                .pathParams(testProject).body(deleteBulkRQ).callAsData();
        Assertions.assertThat(deleteBulkRS.getSuccessfullyDeleted())
                .describedAs("Ids not deleted").contains(toDeleteIds);
        checkLaunchStatus(testProject, debugLaunchId, LaunchStatus.DELETED);
    }

}