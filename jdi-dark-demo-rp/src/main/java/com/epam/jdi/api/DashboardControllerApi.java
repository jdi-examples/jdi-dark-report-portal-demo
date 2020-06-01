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

import com.epam.http.annotations.*;
import com.epam.http.requests.DataMethod;
import com.epam.jdi.model.*;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("${api}")
public class DashboardControllerApi {

    /**
     * Add widget to specified dashboard
     *
     * @param dashboardId /path/ dashboardId (required)
     * @param projectName /path/ projectName (required)
     * @param addWidgetRq(AddWidgetRq) /body/ addWidgetRq (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/dashboard/{dashboardId}/add")
    public static DataMethod<OperationCompletionRS> addWidgetUsingPUTJSON;

    /**
     * Create dashboard for specified project
     *
     * @param projectName /path/ projectName (required)
     * @param createRQ(CreateDashboardRQ) /body/ createRQ (required)
     * @return EntryCreatedRS
     */
    @ContentType(JSON)
    @POST("/v1/{projectName}/dashboard")
    public static DataMethod<EntryCreatedRS> createDashboardUsingPOSTJSON;

    /**
     * Delete specified dashboard by ID for specified project
     *
     * @param dashboardId /path/ dashboardId (required)
     * @param projectName /path/ projectName (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/{projectName}/dashboard/{dashboardId}")
    public static DataMethod<OperationCompletionRS> deleteDashboardUsingDELETE;

    /**
     * Get all permitted dashboard resources for specified project
     *
     * @param projectName /path/ projectName (required)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqName /query/ Filters by 'name' (optional)
     * @param filterEqOwner /query/ Filters by 'owner' (optional)
     * @param filterEqProjectId /query/ Filters by 'projectId' (optional)
     * @param filterEqShared /query/ Filters by 'shared' (optional)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return IterableDashboardResource
     */
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqName", value = "filterEqName_example")
    @QueryParameter(name = "filterEqOwner", value = "filterEqOwner_example")
    @QueryParameter(name = "filterEqProjectId", value = "789")
    @QueryParameter(name = "filterEqShared", value = "true")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @GET("/v1/{projectName}/dashboard")
    public static DataMethod<IterableDashboardResource> getAllDashboardsUsingGET;

    /**
     * Get specified dashboard by ID for specified project
     *
     * @param dashboardId /path/ dashboardId (required)
     * @param projectName /path/ projectName (required)
     * @return DashboardResource
     */
    @GET("/v1/{projectName}/dashboard/{dashboardId}")
    public static DataMethod<DashboardResource> getDashboardUsingGET;

    /**
     * Get names of shared dashboards from specified project
     *
     * @param projectName /path/ projectName (required)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqName /query/ Filters by 'name' (optional)
     * @param filterEqOwner /query/ Filters by 'owner' (optional)
     * @param filterEqProjectId /query/ Filters by 'projectId' (optional)
     * @param filterEqShared /query/ Filters by 'shared' (optional)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return IterableSharedEntity
     */
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqName", value = "filterEqName_example")
    @QueryParameter(name = "filterEqOwner", value = "filterEqOwner_example")
    @QueryParameter(name = "filterEqProjectId", value = "789")
    @QueryParameter(name = "filterEqShared", value = "true")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @GET("/v1/{projectName}/dashboard/shared")
    public static DataMethod<IterableSharedEntity> getSharedDashboardsNamesUsingGET;

    /**
     * Remove widget from specified dashboard
     *
     * @param dashboardId /path/ dashboardId (required)
     * @param projectName /path/ projectName (required)
     * @param widgetId /path/ widgetId (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/{projectName}/dashboard/{dashboardId}/{widgetId}")
    public static DataMethod<OperationCompletionRS> removeWidgetUsingDELETE;

    /**
     * Update specified dashboard for specified project
     *
     * @param dashboardId /path/ dashboardId (required)
     * @param projectName /path/ projectName (required)
     * @param updateRQ(UpdateDashboardRQ) /body/ updateRQ (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/dashboard/{dashboardId}")
    public static DataMethod<OperationCompletionRS> updateDashboardUsingPUTJSON;
}
