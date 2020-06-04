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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for AuthConfigurationEndpointApi
 */
public class AuthConfigurationEndpointApiTest extends InitTests {

    @BeforeClass
    public void before() {
        init(AuthConfigurationEndpointApi.class, spec);
    }


    /**
     * Retrieves auth settings
     */
    @Ignore
    @Test
    public void deleteSettingsUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = AuthConfigurationEndpointApi.deleteSettingsUsingDELETE.call();
        resp.isOk();
    }

    /**
     * Retrieves auth settings
     */
    @Test
    public void getSettingsUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = AuthConfigurationEndpointApi.getSettingsUsingGET.call();
        resp.isOk();
    }

    /**
     * Updates LDAP auth settings
     */
    @Test
    public void updateLdapSettingsUsingPOSTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = AuthConfigurationEndpointApi.updateLdapSettingsUsingPOST.call();
        resp.isOk();
    }

    /**
     * Updates LDAP auth settings
     */
    @Test
    public void updateLdapSettingsUsingPUTTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = AuthConfigurationEndpointApi.updateLdapSettingsUsingPUT.call();
        resp.isOk();
    }

}
