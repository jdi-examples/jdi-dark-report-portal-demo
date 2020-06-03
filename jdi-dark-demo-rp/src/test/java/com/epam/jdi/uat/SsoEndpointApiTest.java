/*
 * Report Portal
 * Report Portal UAT documentation
 *
 * OpenAPI spec version: 5.3.0-SNAPSHOT-BUILD-339
 * Contact: Support EPMC-TST Report Portal <SupportEPMC-TSTReportPortal@epam.com>
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.epam.jdi.uat;

import com.epam.http.response.RestResponse;
import com.epam.jdi.InitTests;
import com.epam.jdi.uat.SsoEndpointApi;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for SsoEndpointApi
 */
public class SsoEndpointApiTest extends InitTests {

    @BeforeClass
    public void before() { init(SsoEndpointApi.class, spec); }

    
    /**
     * Create api token
     * 
     */
    @Ignore
    @Test
    public void createApiTokenUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.createApiTokenUsingPOSTJSON.call();
        resp.isOk();
    }
    
    /**
     * Get api token
     * 
     */
    @Test
    public void getApiTokenUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.getApiTokenUsingGET.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingDELETE.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingDELETE1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingDELETE1.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingGET.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingGET1.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingHEADJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingHEADJSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingHEAD1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingHEAD1JSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingOPTIONSJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingOPTIONSJSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingOPTIONS1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingOPTIONS1JSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingPATCHJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingPATCHJSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingPATCH1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingPATCH1JSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingPOSTJSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingPOST1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingPOST1JSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingPUTJSON.call();
        resp.isOk();
    }
    
    /**
     * user
     * 
     */
    @Test
    public void userUsingPUT1JSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = SsoEndpointApi.userUsingPUT1JSON.call();
        resp.isOk();
    }
    
}
