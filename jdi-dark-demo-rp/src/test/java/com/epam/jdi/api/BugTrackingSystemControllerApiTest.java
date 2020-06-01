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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for BugTrackingSystemControllerApi
 */
public class BugTrackingSystemControllerApiTest {

    @BeforeClass
    public void before() {
        init(BugTrackingSystemControllerApi.class);
    }


    /**
     * Post ticket to the bts integration
     */
    @Test
    public void createIssueUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = BugTrackingSystemControllerApi.createIssueUsingPOSTJSON.call();
        resp.isOk();
    }

    /**
     * Get list of fields required for posting ticket
     */
    @Test
    public void getAllowableIssueTypesUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = BugTrackingSystemControllerApi.getAllowableIssueTypesUsingGET.call();
        resp.isOk();
    }

    /**
     * Get list of allowable issue types for bug tracking system
     */
    @Test
    public void getAllowableIssueTypesUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = BugTrackingSystemControllerApi.getAllowableIssueTypesUsingGET1.call();
        resp.isOk();
    }

    /**
     * Get list of fields required for posting ticket
     */
    @Test
    public void getSetOfIntegrationSystemFieldsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = BugTrackingSystemControllerApi.getSetOfIntegrationSystemFieldsUsingGET.call();
        resp.isOk();
    }

    /**
     * Get list of fields required for posting ticket
     */
    @Test
    public void getSetOfIntegrationSystemFieldsUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = BugTrackingSystemControllerApi.getSetOfIntegrationSystemFieldsUsingGET1.call();
        resp.isOk();
    }

    /**
     * Get ticket from the bts integration
     */
    @Test
    public void getTicketUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = BugTrackingSystemControllerApi.getTicketUsingGET.call();
        resp.isOk();
    }

}
