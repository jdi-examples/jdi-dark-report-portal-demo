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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for WidgetControllerApi
 */
public class WidgetControllerApiTest extends InitTests {

    @BeforeClass
    public void before() {
        init(WidgetControllerApi.class, spec);
    }


    /**
     * Create a new widget
     */
    @Ignore
    @Test
    public void createWidgetUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.createWidgetUsingPOST.call();
        resp.isOk();
    }

    /**
     * Load shared widgets
     */
    @Ignore
    @Test
    public void getSharedUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.getSharedUsingGET.call();
        resp.isOk();
    }

    /**
     * Load all widget names which belong to a user
     */
    @Ignore
    @Test
    public void getWidgetNamesUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.getWidgetNamesUsingGET.call();
        resp.isOk();
    }

    /**
     * Get widget preview
     */
    @Ignore
    @Test
    public void getWidgetPreviewUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.getWidgetPreviewUsingPOST.call();
        resp.isOk();
    }

    /**
     * Get multilevel widget by ID
     */
    @Ignore
    @Test
    public void getWidgetUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.getWidgetUsingGET.call();
        resp.isOk();
    }

    /**
     * Get widget by ID
     */
    @Ignore
    @Test
    public void getWidgetUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.getWidgetUsingGET1.call();
        resp.isOk();
    }

    /**
     * Search shared widgets by name
     */
    @Ignore
    @Test
    public void searchSharedUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.searchSharedUsingGET.call();
        resp.isOk();
    }

    /**
     * Update specified widget
     */
    @Ignore
    @Test
    public void updateWidgetUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = WidgetControllerApi.updateWidgetUsingPUT.call();
        resp.isOk();
    }

}
