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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for TestItemControllerApi
 */
public class TestItemControllerApiTest {

    @BeforeClass
    public void before() {
        init(TestItemControllerApi.class);
    }


    /**
     * Bulk update attributes and description
     */
    @Ignore
    @Test
    public void bulkUpdateUsingPUT1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.bulkUpdateUsingPUT1JSON.call();
        resp.isOk();
    }

    /**
     * Update issues of specified test items
     */
    @Ignore
    @Test
    public void defineTestItemIssueTypeUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.defineTestItemIssueTypeUsingPUTJSON.call();
        resp.isOk();
    }

    /**
     * Delete test item
     */
    @Ignore
    @Test
    public void deleteTestItemUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.deleteTestItemUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Delete test items by specified ids
     */
    @Ignore
    @Test
    public void deleteTestItemsUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.deleteTestItemsUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Finish test item
     */
    @Ignore
    @Test
    public void finishTestItemUsingPUT1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.finishTestItemUsingPUT1JSON.call();
        resp.isOk();
    }

    /**
     * Get all unique attribute keys of specified launch
     */
    @Ignore
    @Test
    public void getAttributeKeysForProjectUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getAttributeKeysForProjectUsingGET.call();
        resp.isOk();
    }

    /**
     * Get all unique attribute keys of specified launch
     */
    @Ignore
    @Test
    public void getAttributeKeysUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getAttributeKeysUsingGET1.call();
        resp.isOk();
    }

    /**
     * Get all unique attribute values of specified launch
     */
    @Ignore
    @Test
    public void getAttributeValuesUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getAttributeValuesUsingGET1.call();
        resp.isOk();
    }

    /**
     * Load history of test items
     */
    @Ignore
    @Test
    public void getItemsHistoryUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getItemsHistoryUsingGET.call();
        resp.isOk();
    }

    /**
     * Find test item by UUID
     */
    @Ignore
    @Test
    public void getTestItemByUuidUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getTestItemByUuidUsingGET.call();
        resp.isOk();
    }

    /**
     * Find test item by ID
     */
    @Ignore
    @Test
    public void getTestItemUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getTestItemUsingGET.call();
        resp.isOk();
    }

    /**
     * Get test items by specified ids
     */
    @Ignore
    @Test
    public void getTestItemsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getTestItemsUsingGET.call();
        resp.isOk();
    }

    /**
     * Find test items by specified filter
     */
    @Ignore
    @Test
    public void getTestItemsUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getTestItemsUsingGET1.call();
        resp.isOk();
    }

    /**
     * Get tickets that contains a term as a part inside for specified launch
     */
    @Ignore
    @Test
    public void getTicketIdsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.getTicketIdsUsingGET.call();
        resp.isOk();
    }

    /**
     * Attach external issue for specified test items
     */
    @Ignore
    @Test
    public void linkExternalIssuesUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.linkExternalIssuesUsingPUTJSON.call();
        resp.isOk();
    }

    /**
     * Start a child test item
     */
    @Ignore
    @Test
    public void startChildItemUsingPOST1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.startChildItemUsingPOST1JSON.call();
        resp.isOk();
    }

    /**
     * Start a root test item
     */
    @Ignore
    @Test
    public void startRootItemUsingPOST1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.startRootItemUsingPOST1JSON.call();
        resp.isOk();
    }

    /**
     * Unlink external issue for specified test items
     */
    @Ignore
    @Test
    public void unlinkExternalIssuesUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.unlinkExternalIssuesUsingPUTJSON.call();
        resp.isOk();
    }

    /**
     * Update test item
     */
    @Ignore
    @Test
    public void updateTestItemUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemControllerApi.updateTestItemUsingPUTJSON.call();
        resp.isOk();
    }

}
