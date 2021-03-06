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
 * API tests for DashboardControllerApi
 */
public class DashboardControllerApiTest extends InitTests {

    @BeforeClass
    public void before() {
        init(DashboardControllerApi.class, spec);
    }


    /**
     * Add widget to specified dashboard
     */
    @Ignore
    @Test
    public void addWidgetUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.addWidgetUsingPUT.call();
        resp.isOk();
    }

    /**
     * Create dashboard for specified project
     */
    @Ignore
    @Test
    public void createDashboardUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.createDashboardUsingPOST.call();
        resp.isOk();
    }

    /**
     * Delete specified dashboard by ID for specified project
     */
    @Ignore
    @Test
    public void deleteDashboardUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.deleteDashboardUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Get all permitted dashboard resources for specified project
     */
    @Ignore
    @Test
    public void getAllDashboardsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.getAllDashboardsUsingGET.call();
        resp.isOk();
    }

    /**
     * Get specified dashboard by ID for specified project
     */
    @Ignore
    @Test
    public void getDashboardUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.getDashboardUsingGET.call();
        resp.isOk();
    }

    /**
     * Get names of shared dashboards from specified project
     */
    @Ignore
    @Test
    public void getSharedDashboardsNamesUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.getSharedDashboardsNamesUsingGET.call();
        resp.isOk();
    }

    /**
     * Remove widget from specified dashboard
     */
    @Ignore
    @Test
    public void removeWidgetUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.removeWidgetUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Update specified dashboard for specified project
     */
    @Ignore
    @Test
    public void updateDashboardUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = DashboardControllerApi.updateDashboardUsingPUT.call();
        resp.isOk();
    }

}
