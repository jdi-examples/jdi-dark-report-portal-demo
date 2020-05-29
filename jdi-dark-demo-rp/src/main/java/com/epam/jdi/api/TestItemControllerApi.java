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

@ServiceDomain("${domain}")
public class TestItemControllerApi {

    /**
     * Bulk update attributes and description
     *
     * @param projectName /path/ projectName (required)
     * @param bulkInfoUpdateRQ(BulkInfoUpdateRQ) /body/ bulkInfoUpdateRQ (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/item/info")
    public static DataMethod<OperationCompletionRS> bulkUpdateUsingPUT1JSON;

    /**
     * Update issues of specified test items
     *
     * @param projectName /path/ projectName (required)
     * @param request(DefineIssueRQ) /body/ request (required)
     * @return Issue[]
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/item")
    public static DataMethod<Issue[]> defineTestItemIssueTypeUsingPUTJSON;

    /**
     * Delete test item
     *
     * @param itemId /path/ itemId (required)
     * @param projectName /path/ projectName (required)
     * @return OperationCompletionRS
     */
    @DELETE("/v1/{projectName}/item/{itemId}")
    public static DataMethod<OperationCompletionRS> deleteTestItemUsingDELETE;

    /**
     * Delete test items by specified ids
     *
     * @param projectName /path/ projectName (required)
     * @param ids /query/ ids (required)
     * @return OperationCompletionRS[]
     */
    @QueryParameter(name = "ids", value = "56")
    @DELETE("/v1/{projectName}/item")
    public static DataMethod<OperationCompletionRS[]> deleteTestItemsUsingDELETE;

    /**
     * Finish test item
     *
     * @param projectName /path/ projectName (required)
     * @param testItemId /path/ testItemId (required)
     * @param finishExecutionRQ(FinishTestItemRQ) /body/ finishExecutionRQ (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/item/{testItemId}")
    public static DataMethod<OperationCompletionRS> finishTestItemUsingPUT1JSON;

    /**
     * Get all unique attribute keys of specified launch
     *
     * @param projectName /path/ projectName (required)
     * @param filterCntAttributeKey /query/ filter.cnt.attributeKey (required)
     * @param filterId /query/ filterId (required)
     * @param isLatest /query/ isLatest (optional, default to false)
     * @param launchesLimit /query/ launchesLimit (optional, default to 0)
     * @return String[]
     */
    @QueryParameter(name = "filterCntAttributeKey", value = "filterCntAttributeKey_example")
    @QueryParameter(name = "filterId", value = "789")
    @QueryParameter(name = "isLatest", value = "false")
    @QueryParameter(name = "launchesLimit", value = "0")
    @GET("/v1/{projectName}/item/attribute/keys/all")
    public static DataMethod<String[]> getAttributeKeysForProjectUsingGET;

    /**
     * Get all unique attribute keys of specified launch
     *
     * @param projectName /path/ projectName (required)
     * @param filterCntAttributeKey /query/ filter.cnt.attributeKey (required)
     * @param launch /query/ launch (required)
     * @return String[]
     */
    @QueryParameter(name = "filterCntAttributeKey", value = "filterCntAttributeKey_example")
    @QueryParameter(name = "launch", value = "789")
    @GET("/v1/{projectName}/item/attribute/keys")
    public static DataMethod<String[]> getAttributeKeysUsingGET1;

    /**
     * Get all unique attribute values of specified launch
     *
     * @param projectName /path/ projectName (required)
     * @param filterCntAttributeValue /query/ filter.cnt.attributeValue (required)
     * @param filterEqAttributeKey /query/ filter.eq.attributeKey (optional)
     * @param launch /query/ launch (required)
     * @return String[]
     */
    @QueryParameter(name = "filterCntAttributeValue", value = "filterCntAttributeValue_example")
    @QueryParameter(name = "filterEqAttributeKey", value = "filterEqAttributeKey_example")
    @QueryParameter(name = "launch", value = "789")
    @GET("/v1/{projectName}/item/attribute/values")
    public static DataMethod<String[]> getAttributeValuesUsingGET1;

    /**
     * Load history of test items
     *
     * @param projectName /path/ projectName (required)
     * @param filterEqAttributeKey /query/ Filters by 'attributeKey' (optional)
     * @param filterEqAttributeValue /query/ Filters by 'attributeValue' (optional)
     * @param filterEqAutoAnalyzed /query/ Filters by 'autoAnalyzed' (optional)
     * @param filterEqCompositeAttribute /query/ Filters by 'compositeAttribute' (optional)
     * @param filterEqDescription /query/ Filters by 'description' (optional)
     * @param filterEqDuration /query/ Filters by 'duration' (optional)
     * @param filterEqEndTime /query/ Filters by 'endTime' (optional)
     * @param filterEqHasChildren /query/ Filters by 'hasChildren' (optional)
     * @param filterEqHasRetries /query/ Filters by 'hasRetries' (optional)
     * @param filterEqHasStats /query/ Filters by 'hasStats' (optional)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqIgnoreAnalyzer /query/ Filters by 'ignoreAnalyzer' (optional)
     * @param filterEqIssueComment /query/ Filters by 'issueComment' (optional)
     * @param filterEqIssueGroupId /query/ Filters by 'issueGroupId' (optional)
     * @param filterEqIssueId /query/ Filters by 'issueId' (optional)
     * @param filterEqIssueType /query/ Filters by 'issueType' (optional)
     * @param filterEqKey /query/ Filters by 'key' (optional)
     * @param filterEqLastModified /query/ Filters by 'lastModified' (optional)
     * @param filterEqLaunchId /query/ Filters by 'launchId' (optional)
     * @param filterEqLocator /query/ Filters by 'locator' (optional)
     * @param filterEqMode /query/ Filters by 'mode' (optional)
     * @param filterEqName /query/ Filters by 'name' (optional)
     * @param filterEqParentId /query/ Filters by 'parentId' (optional)
     * @param filterEqParentId2 /query/ Filters by 'parentId' (optional)
     * @param filterEqPath /query/ Filters by 'path' (optional)
     * @param filterEqPatternName /query/ Filters by 'patternName' (optional)
     * @param filterEqProjectId /query/ Filters by 'projectId' (optional)
     * @param filterEqRetryParentId /query/ Filters by 'retryParentId' (optional)
     * @param filterEqStartTime /query/ Filters by 'startTime' (optional)
     * @param filterEqStatisticsdefectsautomationBugab001 /query/ Filters by 'statistics$defects$automation_bug$ab001' (optional)
     * @param filterEqStatisticsdefectsnoDefectnd001 /query/ Filters by 'statistics$defects$no_defect$nd001' (optional)
     * @param filterEqStatisticsdefectsproductBugpb001 /query/ Filters by 'statistics$defects$product_bug$pb001' (optional)
     * @param filterEqStatisticsdefectssystemIssuesi001 /query/ Filters by 'statistics$defects$system_issue$si001' (optional)
     * @param filterEqStatisticsdefectstoInvestigateti001 /query/ Filters by 'statistics$defects$to_investigate$ti001' (optional)
     * @param filterEqStatisticsexecutionsfailed /query/ Filters by 'statistics$executions$failed' (optional)
     * @param filterEqStatisticsexecutionspassed /query/ Filters by 'statistics$executions$passed' (optional)
     * @param filterEqStatisticsexecutionsskipped /query/ Filters by 'statistics$executions$skipped' (optional)
     * @param filterEqStatisticsexecutionstotal /query/ Filters by 'statistics$executions$total' (optional)
     * @param filterEqStatus /query/ Filters by 'status' (optional)
     * @param filterEqTestCaseHash /query/ Filters by 'testCaseHash' (optional)
     * @param filterEqTestCaseId /query/ Filters by 'testCaseId' (optional)
     * @param filterEqTicketId /query/ Filters by 'ticketId' (optional)
     * @param filterEqType /query/ Filters by 'type' (optional)
     * @param filterEqUniqueId /query/ Filters by 'uniqueId' (optional)
     * @param filterEqValue /query/ Filters by 'value' (optional)
     * @param filterId /query/ filterId (optional)
     * @param historyDepth /query/ historyDepth (optional, default to 5)
     * @param isLatest /query/ isLatest (optional, default to false)
     * @param launchesLimit /query/ launchesLimit (optional, default to 0)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @param type /query/ type (optional)
     * @return IterableTestItemHistoryElement
     */
    @QueryParameter(name = "filterEqAttributeKey", value = "")
    @QueryParameter(name = "filterEqAttributeValue", value = "")
    @QueryParameter(name = "filterEqAutoAnalyzed", value = "true")
    @QueryParameter(name = "filterEqCompositeAttribute", value = "")
    @QueryParameter(name = "filterEqDescription", value = "filterEqDescription_example")
    @QueryParameter(name = "filterEqDuration", value = "789")
    @QueryParameter(name = "filterEqEndTime", value = "new Date()")
    @QueryParameter(name = "filterEqHasChildren", value = "true")
    @QueryParameter(name = "filterEqHasRetries", value = "true")
    @QueryParameter(name = "filterEqHasStats", value = "true")
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqIgnoreAnalyzer", value = "true")
    @QueryParameter(name = "filterEqIssueComment", value = "filterEqIssueComment_example")
    @QueryParameter(name = "filterEqIssueGroupId", value = "56")
    @QueryParameter(name = "filterEqIssueId", value = "789")
    @QueryParameter(name = "filterEqIssueType", value = "filterEqIssueType_example")
    @QueryParameter(name = "filterEqKey", value = "filterEqKey_example")
    @QueryParameter(name = "filterEqLastModified", value = "filterEqLastModified_example")
    @QueryParameter(name = "filterEqLaunchId", value = "789")
    @QueryParameter(name = "filterEqLocator", value = "filterEqLocator_example")
    @QueryParameter(name = "filterEqMode", value = "filterEqMode_example")
    @QueryParameter(name = "filterEqName", value = "filterEqName_example")
    @QueryParameter(name = "filterEqParentId", value = "789")
    @QueryParameter(name = "filterEqParentId2", value = "789")
    @QueryParameter(name = "filterEqPath", value = "789")
    @QueryParameter(name = "filterEqPatternName", value = "")
    @QueryParameter(name = "filterEqProjectId", value = "789")
    @QueryParameter(name = "filterEqRetryParentId", value = "789")
    @QueryParameter(name = "filterEqStartTime", value = "new Date()")
    @QueryParameter(name = "filterEqStatisticsdefectsautomationBugab001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectsnoDefectnd001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectsproductBugpb001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectssystemIssuesi001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectstoInvestigateti001", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionsfailed", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionspassed", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionsskipped", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionstotal", value = "789")
    @QueryParameter(name = "filterEqStatus", value = "filterEqStatus_example")
    @QueryParameter(name = "filterEqTestCaseHash", value = "56")
    @QueryParameter(name = "filterEqTestCaseId", value = "filterEqTestCaseId_example")
    @QueryParameter(name = "filterEqTicketId", value = "filterEqTicketId_example")
    @QueryParameter(name = "filterEqType", value = "filterEqType_example")
    @QueryParameter(name = "filterEqUniqueId", value = "filterEqUniqueId_example")
    @QueryParameter(name = "filterEqValue", value = "filterEqValue_example")
    @QueryParameter(name = "filterId", value = "789")
    @QueryParameter(name = "historyDepth", value = "5")
    @QueryParameter(name = "isLatest", value = "false")
    @QueryParameter(name = "launchesLimit", value = "0")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @QueryParameter(name = "type", value = "type_example")
    @GET("/v1/{projectName}/item/history")
    public static DataMethod<IterableTestItemHistoryElement> getItemsHistoryUsingGET;

    /**
     * Find test item by UUID
     *
     * @param itemId /path/ itemId (required)
     * @param projectName /path/ projectName (required)
     * @return TestItemResource
     */
    @GET("/v1/{projectName}/item/uuid/{itemId}")
    public static DataMethod<TestItemResource> getTestItemByUuidUsingGET;

    /**
     * Find test item by ID
     *
     * @param itemId /path/ itemId (required)
     * @param projectName /path/ projectName (required)
     * @return TestItemResource
     */
    @GET("/v1/{projectName}/item/{itemId}")
    public static DataMethod<TestItemResource> getTestItemUsingGET;

    /**
     * Get test items by specified ids
     *
     * @param projectName /path/ projectName (required)
     * @param ids /query/ ids (required)
     * @return TestItemResource[]
     */
    @QueryParameter(name = "ids", value = "56")
    @GET("/v1/{projectName}/item/items")
    public static DataMethod<TestItemResource[]> getTestItemsUsingGET;

    /**
     * Find test items by specified filter
     *
     * @param projectName /path/ projectName (required)
     * @param filterEqAttributeKey /query/ Filters by 'attributeKey' (optional)
     * @param filterEqAttributeValue /query/ Filters by 'attributeValue' (optional)
     * @param filterEqAutoAnalyzed /query/ Filters by 'autoAnalyzed' (optional)
     * @param filterEqCompositeAttribute /query/ Filters by 'compositeAttribute' (optional)
     * @param filterEqDescription /query/ Filters by 'description' (optional)
     * @param filterEqDuration /query/ Filters by 'duration' (optional)
     * @param filterEqEndTime /query/ Filters by 'endTime' (optional)
     * @param filterEqHasChildren /query/ Filters by 'hasChildren' (optional)
     * @param filterEqHasRetries /query/ Filters by 'hasRetries' (optional)
     * @param filterEqHasStats /query/ Filters by 'hasStats' (optional)
     * @param filterEqId /query/ Filters by 'id' (optional)
     * @param filterEqIgnoreAnalyzer /query/ Filters by 'ignoreAnalyzer' (optional)
     * @param filterEqIssueComment /query/ Filters by 'issueComment' (optional)
     * @param filterEqIssueGroupId /query/ Filters by 'issueGroupId' (optional)
     * @param filterEqIssueId /query/ Filters by 'issueId' (optional)
     * @param filterEqIssueType /query/ Filters by 'issueType' (optional)
     * @param filterEqKey /query/ Filters by 'key' (optional)
     * @param filterEqLastModified /query/ Filters by 'lastModified' (optional)
     * @param filterEqLaunchId /query/ Filters by 'launchId' (optional)
     * @param filterEqLocator /query/ Filters by 'locator' (optional)
     * @param filterEqMode /query/ Filters by 'mode' (optional)
     * @param filterEqName /query/ Filters by 'name' (optional)
     * @param filterEqParentId /query/ Filters by 'parentId' (optional)
     * @param filterEqParentId2 /query/ Filters by 'parentId' (optional)
     * @param filterEqPath /query/ Filters by 'path' (optional)
     * @param filterEqPatternName /query/ Filters by 'patternName' (optional)
     * @param filterEqProjectId /query/ Filters by 'projectId' (optional)
     * @param filterEqRetryParentId /query/ Filters by 'retryParentId' (optional)
     * @param filterEqStartTime /query/ Filters by 'startTime' (optional)
     * @param filterEqStatisticsdefectsautomationBugab001 /query/ Filters by 'statistics$defects$automation_bug$ab001' (optional)
     * @param filterEqStatisticsdefectsnoDefectnd001 /query/ Filters by 'statistics$defects$no_defect$nd001' (optional)
     * @param filterEqStatisticsdefectsproductBugpb001 /query/ Filters by 'statistics$defects$product_bug$pb001' (optional)
     * @param filterEqStatisticsdefectssystemIssuesi001 /query/ Filters by 'statistics$defects$system_issue$si001' (optional)
     * @param filterEqStatisticsdefectstoInvestigateti001 /query/ Filters by 'statistics$defects$to_investigate$ti001' (optional)
     * @param filterEqStatisticsexecutionsfailed /query/ Filters by 'statistics$executions$failed' (optional)
     * @param filterEqStatisticsexecutionspassed /query/ Filters by 'statistics$executions$passed' (optional)
     * @param filterEqStatisticsexecutionsskipped /query/ Filters by 'statistics$executions$skipped' (optional)
     * @param filterEqStatisticsexecutionstotal /query/ Filters by 'statistics$executions$total' (optional)
     * @param filterEqStatus /query/ Filters by 'status' (optional)
     * @param filterEqTestCaseHash /query/ Filters by 'testCaseHash' (optional)
     * @param filterEqTestCaseId /query/ Filters by 'testCaseId' (optional)
     * @param filterEqTicketId /query/ Filters by 'ticketId' (optional)
     * @param filterEqType /query/ Filters by 'type' (optional)
     * @param filterEqUniqueId /query/ Filters by 'uniqueId' (optional)
     * @param filterEqValue /query/ Filters by 'value' (optional)
     * @param filterId /query/ filterId (optional)
     * @param isLatest /query/ isLatest (optional, default to false)
     * @param launchesLimit /query/ launchesLimit (optional, default to 0)
     * @param pagePage /query/ Results page you want to retrieve (0..N) (optional)
     * @param pageSize /query/ Number of records per page (optional)
     * @param pageSort /query/ Sorting criteria in the format: property, (asc|desc). Default sort order is ascending. Multiple sort criteria are supported. (optional)
     * @return IterableTestItemResource
     */
    @QueryParameter(name = "filterEqAttributeKey", value = "")
    @QueryParameter(name = "filterEqAttributeValue", value = "")
    @QueryParameter(name = "filterEqAutoAnalyzed", value = "true")
    @QueryParameter(name = "filterEqCompositeAttribute", value = "")
    @QueryParameter(name = "filterEqDescription", value = "filterEqDescription_example")
    @QueryParameter(name = "filterEqDuration", value = "789")
    @QueryParameter(name = "filterEqEndTime", value = "new Date()")
    @QueryParameter(name = "filterEqHasChildren", value = "true")
    @QueryParameter(name = "filterEqHasRetries", value = "true")
    @QueryParameter(name = "filterEqHasStats", value = "true")
    @QueryParameter(name = "filterEqId", value = "789")
    @QueryParameter(name = "filterEqIgnoreAnalyzer", value = "true")
    @QueryParameter(name = "filterEqIssueComment", value = "filterEqIssueComment_example")
    @QueryParameter(name = "filterEqIssueGroupId", value = "56")
    @QueryParameter(name = "filterEqIssueId", value = "789")
    @QueryParameter(name = "filterEqIssueType", value = "filterEqIssueType_example")
    @QueryParameter(name = "filterEqKey", value = "filterEqKey_example")
    @QueryParameter(name = "filterEqLastModified", value = "filterEqLastModified_example")
    @QueryParameter(name = "filterEqLaunchId", value = "789")
    @QueryParameter(name = "filterEqLocator", value = "filterEqLocator_example")
    @QueryParameter(name = "filterEqMode", value = "filterEqMode_example")
    @QueryParameter(name = "filterEqName", value = "filterEqName_example")
    @QueryParameter(name = "filterEqParentId", value = "789")
    @QueryParameter(name = "filterEqParentId2", value = "789")
    @QueryParameter(name = "filterEqPath", value = "789")
    @QueryParameter(name = "filterEqPatternName", value = "")
    @QueryParameter(name = "filterEqProjectId", value = "789")
    @QueryParameter(name = "filterEqRetryParentId", value = "789")
    @QueryParameter(name = "filterEqStartTime", value = "new Date()")
    @QueryParameter(name = "filterEqStatisticsdefectsautomationBugab001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectsnoDefectnd001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectsproductBugpb001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectssystemIssuesi001", value = "789")
    @QueryParameter(name = "filterEqStatisticsdefectstoInvestigateti001", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionsfailed", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionspassed", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionsskipped", value = "789")
    @QueryParameter(name = "filterEqStatisticsexecutionstotal", value = "789")
    @QueryParameter(name = "filterEqStatus", value = "filterEqStatus_example")
    @QueryParameter(name = "filterEqTestCaseHash", value = "56")
    @QueryParameter(name = "filterEqTestCaseId", value = "filterEqTestCaseId_example")
    @QueryParameter(name = "filterEqTicketId", value = "filterEqTicketId_example")
    @QueryParameter(name = "filterEqType", value = "filterEqType_example")
    @QueryParameter(name = "filterEqUniqueId", value = "filterEqUniqueId_example")
    @QueryParameter(name = "filterEqValue", value = "filterEqValue_example")
    @QueryParameter(name = "filterId", value = "789")
    @QueryParameter(name = "isLatest", value = "false")
    @QueryParameter(name = "launchesLimit", value = "0")
    @QueryParameter(name = "pagePage", value = "56")
    @QueryParameter(name = "pageSize", value = "56")
    @QueryParameter(name = "pageSort", value = "pageSort_example")
    @GET("/v1/{projectName}/item")
    public static DataMethod<IterableTestItemResource> getTestItemsUsingGET1;

    /**
     * Get tickets that contains a term as a part inside for specified launch
     *
     * @param projectName /path/ projectName (required)
     * @param launch /query/ launch (required)
     * @param term /query/ term (required)
     * @return String[]
     */
    @QueryParameter(name = "launch", value = "789")
    @QueryParameter(name = "term", value = "term_example")
    @GET("/v1/{projectName}/item/ticket/ids")
    public static DataMethod<String[]> getTicketIdsUsingGET;

    /**
     * Attach external issue for specified test items
     *
     * @param projectName /path/ projectName (required)
     * @param rq(LinkExternalIssueRQ) /body/ rq (required)
     * @return OperationCompletionRS[]
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/item/issue/link")
    public static DataMethod<OperationCompletionRS[]> linkExternalIssuesUsingPUTJSON;

    /**
     * Start a child test item
     *
     * @param parentItem /path/ parentItem (required)
     * @param projectName /path/ projectName (required)
     * @param startTestItemRQ(StartTestItemRQ) /body/ startTestItemRQ (required)
     * @return EntryCreatedAsyncRS
     */
    @ContentType(JSON)
    @POST("/v1/{projectName}/item/{parentItem}")
    public static DataMethod<EntryCreatedAsyncRS> startChildItemUsingPOST1JSON;

    /**
     * Start a root test item
     *
     * @param projectName /path/ projectName (required)
     * @param startTestItemRQ(StartTestItemRQ) /body/ startTestItemRQ (required)
     * @return EntryCreatedAsyncRS
     */
    @ContentType(JSON)
    @POST("/v1/{projectName}/item")
    public static DataMethod<EntryCreatedAsyncRS> startRootItemUsingPOST1JSON;

    /**
     * Unlink external issue for specified test items
     *
     * @param projectName /path/ projectName (required)
     * @param rq(UnlinkExternalIssueRQ) /body/ rq (required)
     * @return OperationCompletionRS[]
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/item/issue/unlink")
    public static DataMethod<OperationCompletionRS[]> unlinkExternalIssuesUsingPUTJSON;

    /**
     * Update test item
     *
     * @param itemId /path/ itemId (required)
     * @param projectName /path/ projectName (required)
     * @param rq(UpdateTestItemRQ) /body/ rq (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @PUT("/v1/{projectName}/item/{itemId}/update")
    public static DataMethod<OperationCompletionRS> updateTestItemUsingPUTJSON;
}
