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
 * API tests for LogControllerApi
 */
public class LogControllerApiTest {

    private LogControllerApi service;

    @BeforeClass
    public void before() { service = init(LogControllerApi.class); }

    
    /**
     * Create log
     * 
     */
    @Test
    public void createLogUsingPOST3JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.createLogUsingPOST3JSON.call();
        resp.isOk();
    }
    
    /**
     * Delete log
     * 
     */
    @Test
    public void deleteLogUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.deleteLogUsingDELETE.call();
        resp.isOk();
    }
    
    /**
     * Get log by UUID
     * 
     */
    @Test
    public void getLogByUuidUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.getLogByUuidUsingGET.call();
        resp.isOk();
    }
    
    /**
     * Get log by ID
     * 
     */
    @Test
    public void getLogUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.getLogUsingGET.call();
        resp.isOk();
    }
    
    /**
     * Get logs by filter
     * 
     */
    @Test
    public void getLogsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.getLogsUsingGET.call();
        resp.isOk();
    }
    
    /**
     * Get nested steps with logs for the parent Test Item
     * 
     */
    @Test
    public void getNestedItemsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.getNestedItemsUsingGET.call();
        resp.isOk();
    }
    
    /**
     * Get logs by filter
     * 
     */
    @Test
    public void getPageNumberUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.getPageNumberUsingGET.call();
        resp.isOk();
    }
    
    /**
     * Search test items with similar error logs
     * 
     */
    @Test
    public void searchLogsUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogControllerApi.searchLogsUsingPOSTJSON.call();
        resp.isOk();
    }
    
}
