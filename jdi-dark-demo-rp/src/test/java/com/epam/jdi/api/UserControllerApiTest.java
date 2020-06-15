/*
 * Report Portal
 * Report Portal API documentation
 *
 * OpenAPI spec version: 5.2.0
 * Contact: Support EPMC-TST Report Portal <SupportEPMC-TSTReportPortal@epam.com>
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.epam.jdi.api;

import com.epam.http.response.RestResponse;
import com.epam.jdi.InitTests;
import com.epam.jdi.model.ChangePasswordRQ;
import com.epam.jdi.model.CreateUserRQ;
import com.epam.reportportal.annotations.Tags;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;
import static com.epam.jdi.api.UserControllerApi.changePasswordUsingPOST;
import static com.epam.jdi.api.UserControllerApi.createUserBidUsingPOST;
import static org.hamcrest.Matchers.equalTo;

/**
 * API tests for UserControllerApi
 */
@Tags("user")
public class UserControllerApiTest extends InitTests {

    @BeforeClass
    public void before() {
        init(UserControllerApi.class, spec);
    }


    /**
     * Change own password
     */
    @Test(description = "Check error messages for change password")
    public void changePasswordUsingPOSTTest() {
        changePasswordUsingPOST
                .post(new ChangePasswordRQ().setOldPassword("wrong")
                        .setNewPassword("new"))
                .assertThat()
                .statusCode(400)
                .body("errorCode", equalTo(4001))
                .body("message",
                        equalTo("Incorrect Request. [Field 'newPassword' should have size from '4' to '256'.] "));

        changePasswordUsingPOST
                .post(new ChangePasswordRQ().setOldPassword("wrong")
                        .setNewPassword("newPassword"))
                .assertThat()
                .statusCode(400)
                .body("errorCode", equalTo(40010))
                .body("message",
                        equalTo("Forbidden operation. Old password not match with stored."));
    }

    /**
     * Register invitation for user who will be created
     */
    @Test(description = "Check role error message for create user")
    public void createUserBidUsingPOSTTest() {
        createUserBidUsingPOST.post(new CreateUserRQ()
                .setDefaultProject("wrongProject")
                .setEmail("test@test.com"))
                .assertThat()
                .statusCode(400)
                .body("errorCode", equalTo(4001))
                .body("message",
                        equalTo("Incorrect Request. [Field 'role' should not contain only white spaces and shouldn't be empty.] "));
    }

    /**
     * Create specified user
     * Allowable only for users with administrator role
     */
    @Ignore
    @Test
    public void createUserByAdminUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.createUserByAdminUsingPOST.call();
        resp.isOk();
    }

    /**
     * Activate invitation and create user in system
     */
    @Ignore
    @Test
    public void createUserUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.createUserUsingPOST.call();
        resp.isOk();
    }

    /**
     * Delete specified user
     * Allowable only for users with administrator role
     */
    @Ignore
    @Test
    public void deleteUserUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.deleteUserUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Delete specified users by ids
     */
    @Ignore
    @Test
    public void deleteUsersUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.deleteUsersUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Edit specified user
     * Only for administrators and profile&#39;s owner
     */
    @Ignore
    @Test
    public void editUserUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.editUserUsingPUT.call();
        resp.isOk();
    }

    /**
     * Exports information about all users
     * Allowable only for users with administrator role
     */
    @Ignore
    @Test
    public void exportUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.exportUsingGET.call();
        resp.isOk();
    }

    /**
     * findUsers
     */
    @Ignore
    @Test
    public void findUsersUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.findUsersUsingGET.call();
        resp.isOk();
    }

    /**
     * Return information about current logged-in user
     */
    @Ignore
    @Test
    public void getMyselfUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.getMyselfUsingGET.call();
        resp.isOk();
    }

    /**
     * Return information about current logged-in user
     */
    @Ignore
    @Test
    public void getMyselfUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.getMyselfUsingGET1.call();
        resp.isOk();
    }

    /**
     * getUserBidInfo
     */
    @Ignore
    @Test
    public void getUserBidInfoUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.getUserBidInfoUsingGET.call();
        resp.isOk();
    }

    /**
     * getUserProjects
     */
    @Ignore
    @Test
    public void getUserProjectsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.getUserProjectsUsingGET.pathParams("test-user").call();
        resp.isOk();
    }

    /**
     * Return information about specified user
     * Only for administrators and profile&#39;s owner
     */
    @Ignore
    @Test
    public void getUserUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.getUserUsingGET.call();
        resp.isOk();
    }

    /**
     * Return information about all users
     * Allowable only for users with administrator role
     */
    @Ignore
    @Test
    public void getUsersUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.getUsersUsingGET.call();
        resp.isOk();
    }

    /**
     * Check if a restore password bid exists
     */
    @Ignore
    @Test
    public void isRestorePasswordBidExistUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.isRestorePasswordBidExistUsingGET.call();
        resp.isOk();
    }

    /**
     * Reset password
     */
    @Ignore
    @Test
    public void resetPasswordUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.resetPasswordUsingPOST.call();
        resp.isOk();
    }

    /**
     * Create a restore password request
     */
    @Ignore
    @Test
    public void restorePasswordUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.restorePasswordUsingPOST.call();
        resp.isOk();
    }

    /**
     * validateInfo
     */
    @Ignore
    @Test
    public void validateInfoUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = UserControllerApi.validateInfoUsingGET.call();
        resp.isOk();
    }

}
