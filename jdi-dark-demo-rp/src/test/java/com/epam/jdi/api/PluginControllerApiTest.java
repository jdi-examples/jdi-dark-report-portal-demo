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
 * API tests for PluginControllerApi
 */
public class PluginControllerApiTest {

    @BeforeClass
    public void before() {
        init(PluginControllerApi.class);
    }


    /**
     * Delete plugin by id
     */
    @Test
    public void deletePluginUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = PluginControllerApi.deletePluginUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Get all available plugins
     */
    @Test
    public void getPluginsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = PluginControllerApi.getPluginsUsingGET.call();
        resp.isOk();
    }

    /**
     * Update Report Portal plugin state
     */
    @Test
    public void updatePluginStateUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = PluginControllerApi.updatePluginStateUsingPUTJSON.call();
        resp.isOk();
    }

    /**
     * Upload new Report Portal plugin
     */
    @Test
    public void uploadPluginUsingPOSTANYTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = PluginControllerApi.uploadPluginUsingPOSTANY.call();
        resp.isOk();
    }

}
