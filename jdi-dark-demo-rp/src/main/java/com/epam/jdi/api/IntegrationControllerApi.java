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

import com.epam.http.annotations.ContentType;
import com.epam.http.annotations.DELETE;
import com.epam.http.annotations.GET;
import com.epam.http.annotations.POST;
import com.epam.http.annotations.PUT;
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.DataMethod;
import com.epam.jdi.model.EntryCreatedRS;
import com.epam.jdi.model.IntegrationResource;
import com.epam.jdi.model.OperationCompletionRS;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("${domain}")
public class IntegrationControllerApi {

    /**
     * Create global Report Portal integration instance
     *
     * @param pluginName /path/ pluginName (required)
     * @param createRequest(IntegrationRQ) /body/ createRequest (required)
     * @return EntryCreatedRS
     */
    @ContentType(JSON)
    @POST("/v1/integration/{pluginName}")
    public static DataMethod<EntryCreatedRS> createGlobalIntegrationUsingPOSTJSON;

    /**
     * Create project Report Portal integration instance
     *
     * @param pluginName /path/ pluginName (required)
     * @param projectName /path/ projectName (required)
     * @param createRequest(IntegrationRQ) /body/ createRequest (required)
     * @return EntryCreatedRS
     */
    @ContentType(JSON)
    @POST("/v1/integration/{projectName}/{pluginName}")
    public static DataMethod<EntryCreatedRS> createProjectIntegrationUsingPOSTJSON;

    /**
     * Delete all global integrations by type
     *
     * @param type /path/ type (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/integration/all/{type}")
    public static DataMethod<OperationCompletionRS> deleteAllIntegrationsUsingDELETE;

    /**
     * Delete all integrations assigned to specified project
     *
     * @param projectName /path/ projectName (required)
     * @param type /path/ type (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/integration/{projectName}/all/{type}")
    public static DataMethod<OperationCompletionRS> deleteAllProjectIntegrationsUsingDELETE;

    /**
     * Delete global integration instance
     *
     * @param integrationId /path/ integrationId (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/integration/{integrationId}")
    public static DataMethod<OperationCompletionRS> deleteGlobalIntegrationUsingDELETE;

    /**
     * Delete project integration instance
     *
     * @param integrationId /path/ integrationId (required)
     * @param projectName /path/ projectName (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/integration/{projectName}/{integrationId}")
    public static DataMethod<OperationCompletionRS> deleteProjectIntegrationUsingDELETE;

    /**
     * Execute command to the integration instance
     *
     * @param command /path/ command (required)
     * @param integrationId /path/ integrationId (required)
     * @param projectName /path/ projectName (required)
     * @param executionParams(Object) /body/ executionParams (required)
     * @return Object
     */
    @ContentType(JSON)
    @PUT("/v1/integration/{projectName}/{integrationId}/{command}")
    public static DataMethod<Object> executeIntegrationCommandUsingPUTJSON;

    /**
     * Get global Report Portal integration instance
     *
     * @param integrationId /path/ integrationId (required)
     * @return IntegrationResource
     */
    @GET("/v1/integration/{integrationId}")
    public static DataMethod<IntegrationResource> getGlobalIntegrationUsingGET;

    /**
     * Get available global integrations for plugin
     *
     * @param pluginName /path/ pluginName (required)
     * @return IntegrationResource[]
     */
    @GET("/v1/integration/global/all/{pluginName}")
    public static DataMethod<IntegrationResource[]> getGlobalIntegrationsUsingGET;

    /**
     * Get available global integrations
     *
     * @return IntegrationResource[]
     */
    @GET("/v1/integration/global/all")
    public static DataMethod<IntegrationResource[]> getGlobalIntegrationsUsingGET1;

    /**
     * Get integration instance
     *
     * @param integrationId /path/ integrationId (required)
     * @param projectName /path/ projectName (required)
     * @return IntegrationResource
     */
    @GET("/v1/integration/{projectName}/{integrationId}")
    public static DataMethod<IntegrationResource> getProjectIntegrationUsingGET;

    /**
     * Get available project integrations for plugin
     *
     * @param pluginName /path/ pluginName (required)
     * @param projectName /path/ projectName (required)
     * @return IntegrationResource[]
     */
    @GET("/v1/integration/project/{projectName}/all/{pluginName}")
    public static DataMethod<IntegrationResource[]> getProjectIntegrationsUsingGET;

    /**
     * Get available project integrations
     *
     * @param projectName /path/ projectName (required)
     * @return IntegrationResource[]
     */
    @GET("/v1/integration/project/{projectName}/all")
    public static DataMethod<IntegrationResource[]> getProjectIntegrationsUsingGET1;

    /**
     * Test connection to the global integration
     *
     * @param integrationId /path/ integrationId (required)
     * @return Boolean
     */
    @GET("/v1/integration/{integrationId}/connection/test")
    public static DataMethod<Boolean> testIntegrationConnectionUsingGET;

    /**
     * Test connection to the integration through the project config
     *
     * @param integrationId /path/ integrationId (required)
     * @param projectName /path/ projectName (required)
     * @return Boolean
     */
    @GET("/v1/integration/{projectName}/{integrationId}/connection/test")
    public static DataMethod<Boolean> testIntegrationConnectionUsingGET1;

    /**
     * Update global Report Portal integration instance
     *
     * @param integrationId /path/ integrationId (required)
     * @param updateRequest(IntegrationRQ) /body/ updateRequest (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/integration/{integrationId}")
    public static DataMethod<OperationCompletionRS> updateGlobalIntegrationUsingPUTJSON;

    /**
     * Update project integration instance
     *
     * @param integrationId /path/ integrationId (required)
     * @param projectName /path/ projectName (required)
     * @param updateRequest(IntegrationRQ) /body/ updateRequest (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/integration/{projectName}/{integrationId}")
    public static DataMethod<OperationCompletionRS> updateProjectIntegrationUsingPUTJSON;
}
