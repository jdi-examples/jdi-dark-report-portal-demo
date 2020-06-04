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

import com.epam.http.annotations.ContentType;
import com.epam.http.annotations.DELETE;
import com.epam.http.annotations.GET;
import com.epam.http.annotations.POST;
import com.epam.http.annotations.PUT;
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.RestDataMethod;
import com.epam.jdi.model.AbstractAuthResource;
import com.epam.jdi.model.OperationCompletionRS;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("${uat}")
public class AuthConfigurationEndpointApi {

    /**
     * Retrieves auth settings
     *
     * @param integrationId /path/ integrationId (required)
     * @return OperationCompletionRS
     */
    @DELETE("/settings/auth/{integrationId}")
    public static RestDataMethod<OperationCompletionRS> deleteSettingsUsingDELETE;

    /**
     * Retrieves auth settings
     *
     * @param authType /path/ authType (required)
     * @return AbstractAuthResource
     */
    @GET("/settings/auth/{authType}")
    public static RestDataMethod<AbstractAuthResource> getSettingsUsingGET;

    /**
     * Updates LDAP auth settings
     *
     * @param authType /path/ authType (required)
     * @param request(UpdateAuthRQ) /body/ request (required)
     * @return AbstractAuthResource
     */
    @ContentType(JSON)
    @POST("/settings/auth/{authType}")
    public static RestDataMethod<AbstractAuthResource> updateLdapSettingsUsingPOST;

    /**
     * Updates LDAP auth settings
     *
     * @param authType /path/ authType (required)
     * @param request(UpdateAuthRQ) /body/ request (required)
     * @return AbstractAuthResource
     */
    @ContentType(JSON)
    @PUT("/settings/auth/{authType}")
    public static RestDataMethod<AbstractAuthResource> updateLdapSettingsUsingPUTJSON;
}
