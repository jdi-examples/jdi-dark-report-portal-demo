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
 * API tests for LogAsyncControllerApi
 */
public class LogAsyncControllerApiTest extends InitTests {

    @BeforeClass
    public void before() {
        init(LogAsyncControllerApi.class, spec);
    }


    /**
     * Create log
     */
    @Ignore
    @Test
    public void createLogUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = LogAsyncControllerApi.createLogUsingPOST.call();
        resp.isOk();
    }

}
