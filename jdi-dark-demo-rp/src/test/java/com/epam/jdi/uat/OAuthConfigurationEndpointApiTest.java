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
import com.epam.jdi.uat.OAuthConfigurationEndpointApi;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for OAuthConfigurationEndpointApi
 */
public class OAuthConfigurationEndpointApiTest extends InitTests {

    @BeforeClass
    public void before() { init(OAuthConfigurationEndpointApi.class, spec); }

    
    /**
     * Deletes OAuth Integration Settings
     * 
     */
    @Ignore
    @Test
    public void deleteOAuthSettingUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = OAuthConfigurationEndpointApi.deleteOAuthSettingUsingDELETE.call();
        resp.isOk();
    }
    
    /**
     * Returns OAuth Server Settings
     * 
     */
    @Test
    public void getOAuthSettingsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = OAuthConfigurationEndpointApi.getOAuthSettingsUsingGET.call();
        resp.isOk();
    }
    
    /**
     * Returns OAuth Server Settings
     * 
     */
    @Test
    public void getOAuthSettingsUsingGET1Test() {
        // TODO: add call parameters and test validations
        RestResponse resp = OAuthConfigurationEndpointApi.getOAuthSettingsUsingGET1.call();
        resp.isOk();
    }
    
    /**
     * Creates/Updates OAuth Integration Settings
     * 
     */
    @Test
    public void updateOAuthSettingsUsingPOSTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = OAuthConfigurationEndpointApi.updateOAuthSettingsUsingPOSTJSON.call();
        resp.isOk();
    }
    
    /**
     * Creates/Updates OAuth Integration Settings
     * 
     */
    @Test
    public void updateOAuthSettingsUsingPUTJSONTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = OAuthConfigurationEndpointApi.updateOAuthSettingsUsingPUTJSON.call();
        resp.isOk();
    }
    
}