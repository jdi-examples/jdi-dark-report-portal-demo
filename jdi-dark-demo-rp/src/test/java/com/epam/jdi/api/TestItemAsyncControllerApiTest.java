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
 * API tests for TestItemAsyncControllerApi
 */
public class TestItemAsyncControllerApiTest {

    private TestItemAsyncControllerApi service;

    @BeforeClass
    public void before() { service = init(TestItemAsyncControllerApi.class); }

    
    /**
     * Finish test item
     * 
     */
    @Test
    public void finishTestItemUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemAsyncControllerApi.finishTestItemUsingPUTJSON.call();
        resp.isOk();
    }
    
    /**
     * Start a child test item
     * 
     */
    @Test
    public void startChildItemUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemAsyncControllerApi.startChildItemUsingPOSTJSON.call();
        resp.isOk();
    }
    
    /**
     * Start a root test item
     * 
     */
    @Test
    public void startRootItemUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = TestItemAsyncControllerApi.startRootItemUsingPOSTJSON.call();
        resp.isOk();
    }
    
}
