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
import com.epam.http.annotations.QueryParameter;
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.DataMethod;
import com.epam.jdi.model.EntryCreatedAsyncRS;
import com.epam.jdi.model.IterableLogResource;
import com.epam.jdi.model.IterableSearchLogRs;
import com.epam.jdi.model.Iterableobject;
import com.epam.jdi.model.LogResource;
import com.epam.jdi.model.OperationCompletionRS;
import com.epam.jdi.model.Serializable;

import java.util.Map;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("${domain}")
public class LogControllerApi {

    /**
     * Create log
     *
     * @param projectName /path/ projectName (required)
     * @param createLogRQ(SaveLogRQ) /body/ createLogRQ (required)
     * @return EntryCreatedAsyncRS
     */
    @ContentType(JSON)
    @POST("/v1/{projectName}/log")
    public static DataMethod<EntryCreatedAsyncRS> createLogUsingPOST3JSON;

    /**
     * Delete log
     *
     * @param logId /path/ logId (required)
     * @param projectName /path/ projectName (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/{projectName}/log/{logId}")
    public static DataMethod<OperationCompletionRS> deleteLogUsingDELETE;

    /**
     * Get log by UUID
     *
     * @param logId /path/ logId (required)
     * @param projectName /path/ projectName (required)
     * @return LogResource
     */
    @GET("/v1/{projectName}/log/uuid/{logId}")
    public static DataMethod<LogResource> getLogByUuidUsingGET;

    /**
     * Get log by ID
     *
     * @param logId /path/ logId (required)
     * @param projectName /path/ projectName (required)
     * @return LogResource
     */
    @GET("/v1/{projectName}/log/{logId}")
    public static DataMethod<LogResource> getLogUsingGET;

    /**
     * Get logs by filter
     *
     * @param projectName /path/ projectName (required)
     * @param filterEqAutoAnalyzed /query/ Filters by 'autoAnalyzed' (optional)
     * @param filterEqBinaryContent /query/ Filters by 'binaryContent' (optional)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqItem /query/ Filters by 'item' (optional)
     * @param filterEqLastModified /query/ Filters by 'lastModified' (optional)
     * @param filterEqLaunch /query/ Filters by 'launch' (optional)
     * @param filterEqLaunchId /query/ Filters by 'launchId' (optional)
     * @param filterEqLevel /query/ Filters by 'level' (optional)
     * @param filterEqLogId /query/ Filters by 'logId' (optional)
     * @param filterEqLogTime /query/ Filters by 'logTime' (optional)
     * @param filterEqMessage /query/ Filters by 'message' (optional)
     * @param filterEqPath /query/ Filters by 'path' (optional)
     * @param filterEqRetryParentId /query/ Filters by 'retryParentId' (optional)
     * @param filterEqStatus /query/ Filters by 'status' (optional)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return IterableLogResource
     */
    @QueryParameter(name = "filterEqAutoAnalyzed", value = "true")
    @QueryParameter(name = "filterEqBinaryContent", value = "filterEqBinaryContent_example")
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqItem", value = "789")
    @QueryParameter(name = "filterEqLastModified", value = "new Date()")
    @QueryParameter(name = "filterEqLaunch", value = "789")
    @QueryParameter(name = "filterEqLaunchId", value = "789")
    @QueryParameter(name = "filterEqLevel", value = "filterEqLevel_example")
    @QueryParameter(name = "filterEqLogId", value = "789")
    @QueryParameter(name = "filterEqLogTime", value = "new Date()")
    @QueryParameter(name = "filterEqMessage", value = "filterEqMessage_example")
    @QueryParameter(name = "filterEqPath", value = "filterEqPath_example")
    @QueryParameter(name = "filterEqRetryParentId", value = "789")
    @QueryParameter(name = "filterEqStatus", value = "filterEqStatus_example")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @GET("/v1/{projectName}/log")
    public static DataMethod<IterableLogResource> getLogsUsingGET;

    /**
     * Get nested steps with logs for the parent Test Item
     *
     * @param parentId /path/ parentId (required)
     * @param projectName /path/ projectName (required)
     * @param filterEqAutoAnalyzed /query/ Filters by 'autoAnalyzed' (optional)
     * @param filterEqBinaryContent /query/ Filters by 'binaryContent' (optional)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqItem /query/ Filters by 'item' (optional)
     * @param filterEqLastModified /query/ Filters by 'lastModified' (optional)
     * @param filterEqLaunch /query/ Filters by 'launch' (optional)
     * @param filterEqLaunchId /query/ Filters by 'launchId' (optional)
     * @param filterEqLevel /query/ Filters by 'level' (optional)
     * @param filterEqLogId /query/ Filters by 'logId' (optional)
     * @param filterEqLogTime /query/ Filters by 'logTime' (optional)
     * @param filterEqMessage /query/ Filters by 'message' (optional)
     * @param filterEqPath /query/ Filters by 'path' (optional)
     * @param filterEqRetryParentId /query/ Filters by 'retryParentId' (optional)
     * @param filterEqStatus /query/ Filters by 'status' (optional)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param params /query/ params (optional)
     * @return Iterableobject
     */
    @QueryParameter(name = "filterEqAutoAnalyzed", value = "true")
    @QueryParameter(name = "filterEqBinaryContent", value = "filterEqBinaryContent_example")
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqItem", value = "789")
    @QueryParameter(name = "filterEqLastModified", value = "new Date()")
    @QueryParameter(name = "filterEqLaunch", value = "789")
    @QueryParameter(name = "filterEqLaunchId", value = "789")
    @QueryParameter(name = "filterEqLevel", value = "filterEqLevel_example")
    @QueryParameter(name = "filterEqLogId", value = "789")
    @QueryParameter(name = "filterEqLogTime", value = "new Date()")
    @QueryParameter(name = "filterEqMessage", value = "filterEqMessage_example")
    @QueryParameter(name = "filterEqPath", value = "filterEqPath_example")
    @QueryParameter(name = "filterEqRetryParentId", value = "789")
    @QueryParameter(name = "filterEqStatus", value = "filterEqStatus_example")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @QueryParameter(name = "params", value = "")
    @GET("/v1/{projectName}/log/nested/{parentId}")
    public static DataMethod<Iterableobject> getNestedItemsUsingGET;

    /**
     * Get logs by filter
     *
     * @param logId /path/ logId (required)
     * @param projectName /path/ projectName (required)
     * @param filterEqAutoAnalyzed /query/ Filters by 'autoAnalyzed' (optional)
     * @param filterEqBinaryContent /query/ Filters by 'binaryContent' (optional)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqItem /query/ Filters by 'item' (optional)
     * @param filterEqLastModified /query/ Filters by 'lastModified' (optional)
     * @param filterEqLaunch /query/ Filters by 'launch' (optional)
     * @param filterEqLaunchId /query/ Filters by 'launchId' (optional)
     * @param filterEqLevel /query/ Filters by 'level' (optional)
     * @param filterEqLogId /query/ Filters by 'logId' (optional)
     * @param filterEqLogTime /query/ Filters by 'logTime' (optional)
     * @param filterEqMessage /query/ Filters by 'message' (optional)
     * @param filterEqPath /query/ Filters by 'path' (optional)
     * @param filterEqRetryParentId /query/ Filters by 'retryParentId' (optional)
     * @param filterEqStatus /query/ Filters by 'status' (optional)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return Map<String, Serializable>
     */
    @QueryParameter(name = "filterEqAutoAnalyzed", value = "true")
    @QueryParameter(name = "filterEqBinaryContent", value = "filterEqBinaryContent_example")
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqItem", value = "789")
    @QueryParameter(name = "filterEqLastModified", value = "new Date()")
    @QueryParameter(name = "filterEqLaunch", value = "789")
    @QueryParameter(name = "filterEqLaunchId", value = "789")
    @QueryParameter(name = "filterEqLevel", value = "filterEqLevel_example")
    @QueryParameter(name = "filterEqLogId", value = "789")
    @QueryParameter(name = "filterEqLogTime", value = "new Date()")
    @QueryParameter(name = "filterEqMessage", value = "filterEqMessage_example")
    @QueryParameter(name = "filterEqPath", value = "filterEqPath_example")
    @QueryParameter(name = "filterEqRetryParentId", value = "789")
    @QueryParameter(name = "filterEqStatus", value = "filterEqStatus_example")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @GET("/v1/{projectName}/log/{logId}/page")
    public static DataMethod<Map<String, Serializable>> getPageNumberUsingGET;

    /**
     * Search test items with similar error logs
     *
     * @param itemId /path/ itemId (required)
     * @param projectName /path/ projectName (required)
     * @param request(SearchLogRq) /body/ request (required)
     * @return IterableSearchLogRs
     */
    @ContentType(JSON)
    @POST("/v1/{projectName}/log/search/{itemId}")
    public static DataMethod<IterableSearchLogRs> searchLogsUsingPOSTJSON;
}
