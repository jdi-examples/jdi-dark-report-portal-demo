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
 * API tests for IntegrationControllerApi
 */
public class IntegrationControllerApiTest extends InitTests {

    @BeforeClass
    public void before() {
        init(IntegrationControllerApi.class, spec);
    }


    /**
     * Create global Report Portal integration instance
     */
    @Ignore
    @Test
    public void createGlobalIntegrationUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.createGlobalIntegrationUsingPOST.call();
        resp.isOk();
    }

    /**
     * Create project Report Portal integration instance
     */
    @Ignore
    @Test
    public void createProjectIntegrationUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.createProjectIntegrationUsingPOST.call();
        resp.isOk();
    }

    /**
     * Delete all global integrations by type
     */
    @Ignore
    @Test
    public void deleteAllIntegrationsUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.deleteAllIntegrationsUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Delete all integrations assigned to specified project
     */
    @Ignore
    @Test
    public void deleteAllProjectIntegrationsUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.deleteAllProjectIntegrationsUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Delete global integration instance
     */
    @Ignore
    @Test
    public void deleteGlobalIntegrationUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.deleteGlobalIntegrationUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Delete project integration instance
     */
    @Ignore
    @Test
    public void deleteProjectIntegrationUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.deleteProjectIntegrationUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Execute command to the integration instance
     */
    @Ignore
    @Test
    public void executeIntegrationCommandUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.executeIntegrationCommandUsingPUT.call();
        resp.isOk();
    }

    /**
     * Get global Report Portal integration instance
     */
    @Ignore
    @Test
    public void getGlobalIntegrationUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.getGlobalIntegrationUsingGET.call();
        resp.isOk();
    }

    /**
     * Get available global integrations for plugin
     */
    @Ignore
    @Test
    public void getGlobalIntegrationsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.getGlobalIntegrationsUsingGET.call();
        resp.isOk();
    }

    /**
     * Get available global integrations
     */
    @Ignore
    @Test
    public void getGlobalIntegrationsUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.getGlobalIntegrationsUsingGET1.call();
        resp.isOk();
    }

    /**
     * Get integration instance
     */
    @Ignore
    @Test
    public void getProjectIntegrationUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.getProjectIntegrationUsingGET.call();
        resp.isOk();
    }

    /**
     * Get available project integrations for plugin
     */
    @Ignore
    @Test
    public void getProjectIntegrationsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.getProjectIntegrationsUsingGET.call();
        resp.isOk();
    }

    /**
     * Get available project integrations
     */
    @Ignore
    @Test
    public void getProjectIntegrationsUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.getProjectIntegrationsUsingGET1.call();
        resp.isOk();
    }

    /**
     * Test connection to the global integration
     */
    @Ignore
    @Test
    public void testIntegrationConnectionUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.testIntegrationConnectionUsingGET.call();
        resp.isOk();
    }

    /**
     * Test connection to the integration through the project config
     */
    @Ignore
    @Test
    public void testIntegrationConnectionUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.testIntegrationConnectionUsingGET1.call();
        resp.isOk();
    }

    /**
     * Update global Report Portal integration instance
     */
    @Ignore
    @Test
    public void updateGlobalIntegrationUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.updateGlobalIntegrationUsingPUT.call();
        resp.isOk();
    }

    /**
     * Update project integration instance
     */
    @Ignore
    @Test
    public void updateProjectIntegrationUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = IntegrationControllerApi.updateProjectIntegrationUsingPUT.call();
        resp.isOk();
    }

}
