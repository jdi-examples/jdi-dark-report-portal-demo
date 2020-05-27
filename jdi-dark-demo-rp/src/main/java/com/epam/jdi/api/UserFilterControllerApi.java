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

import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.RestMethod;

import com.epam.jdi.model.CollectionsRQBulkUpdateFilterRQ;
import com.epam.http.annotations.ContentType;
import com.epam.jdi.model.EntryCreatedRS;
import com.epam.jdi.model.IterableSharedEntity;
import com.epam.jdi.model.IterableUserFilterResource;
import static io.restassured.http.ContentType.JSON;
import com.epam.jdi.model.OperationCompletionRS;
import com.epam.http.annotations.QueryParameter;
import com.epam.http.annotations.QueryParameters;
import com.epam.jdi.model.UpdateUserFilterRQ;
import com.epam.jdi.model.UserFilterResource;
import com.epam.http.annotations.DELETE;
import com.epam.http.annotations.GET;
import com.epam.http.annotations.POST;
import com.epam.http.annotations.PUT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ServiceDomain("${domain}")
public class UserFilterControllerApi {

  /**
   * Create user filter
   * 
   * @param projectName /path/ projectName (required)
   * @param createFilterRQ(UpdateUserFilterRQ) /body/ createFilterRQ (required)
   * @return EntryCreatedRS
  */
  @ContentType(JSON)
  @POST("/v1/{projectName}/filter")
  public static RestMethod createFilterUsingPOSTJSON;

  /**
   * Delete specified user filter by id
   * 
   * @param filterId /path/ filterId (required)
   * @param projectName /path/ projectName (required)
   * @return OperationCompletionRS
  */
  @DELETE("/v1/{projectName}/filter/{filterId}")
  public static RestMethod deleteFilterUsingDELETE;

  /**
   * Get available filter names
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
   * @param share /query/ share (optional, default to false)
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
  @QueryParameter(name = "share", value = "false")
  @GET("/v1/{projectName}/filter/names")
  public static RestMethod getAllFiltersNamesUsingGET;

  /**
   * Get permitted (own and shared) filters
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
   * @return IterableUserFilterResource
  */
  @QueryParameter(name = "filterEqId", value = "789")
  @QueryParameter(name = "filterEqName", value = "filterEqName_example")
  @QueryParameter(name = "filterEqOwner", value = "filterEqOwner_example")
  @QueryParameter(name = "filterEqProjectId", value = "789")
  @QueryParameter(name = "filterEqShared", value = "true")
  @QueryParameter(name = "pagePage", value = "56")
  @QueryParameter(name = "pageSize", value = "56")
  @QueryParameter(name = "pageSort", value = "pageSort_example")
  @GET("/v1/{projectName}/filter")
  public static RestMethod getAllFiltersUsingGET;

  /**
   * Get specified user filter by id
   * 
   * @param filterId /path/ filterId (required)
   * @param projectName /path/ projectName (required)
   * @return UserFilterResource
  */
  @GET("/v1/{projectName}/filter/{filterId}")
  public static RestMethod getFilterUsingGET;

  /**
   * Get all filters for specified user who own them
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
   * @return IterableUserFilterResource
  */
  @QueryParameter(name = "filterEqId", value = "789")
  @QueryParameter(name = "filterEqName", value = "filterEqName_example")
  @QueryParameter(name = "filterEqOwner", value = "filterEqOwner_example")
  @QueryParameter(name = "filterEqProjectId", value = "789")
  @QueryParameter(name = "filterEqShared", value = "true")
  @QueryParameter(name = "pagePage", value = "56")
  @QueryParameter(name = "pageSize", value = "56")
  @QueryParameter(name = "pageSort", value = "pageSort_example")
  @GET("/v1/{projectName}/filter/own")
  public static RestMethod getOwnFiltersUsingGET;

  /**
   * Get all available shared filters (except own shared filters)
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
   * @return IterableUserFilterResource
  */
  @QueryParameter(name = "filterEqId", value = "789")
  @QueryParameter(name = "filterEqName", value = "filterEqName_example")
  @QueryParameter(name = "filterEqOwner", value = "filterEqOwner_example")
  @QueryParameter(name = "filterEqProjectId", value = "789")
  @QueryParameter(name = "filterEqShared", value = "true")
  @QueryParameter(name = "pagePage", value = "56")
  @QueryParameter(name = "pageSize", value = "56")
  @QueryParameter(name = "pageSort", value = "pageSort_example")
  @GET("/v1/{projectName}/filter/shared")
  public static RestMethod getSharedFiltersUsingGET;

  /**
   * Get list of specified user filters
   * 
   * @param projectName /path/ projectName (required)
   * @param ids /query/ ids (required)
   * @return List(UserFilterResource);
  */
  @QueryParameter(name = "ids", value = "56")
  @GET("/v1/{projectName}/filter/filters")
  public static RestMethod getUserFiltersUsingGET;

  /**
   * Update specified user filter
   * 
   * @param filterId /path/ filterId (required)
   * @param projectName /path/ projectName (required)
   * @param updateRQ(UpdateUserFilterRQ) /body/ updateRQ (required)
   * @return OperationCompletionRS
  */
  @ContentType(JSON)
  @PUT("/v1/{projectName}/filter/{filterId}")
  public static RestMethod updateUserFilterUsingPUTJSON;

  /**
   * Update list of user filters
   * 
   * @param projectName /path/ projectName (required)
   * @param updateRQ(CollectionsRQBulkUpdateFilterRQ) /body/ updateRQ (required)
   * @return List(OperationCompletionRS);
  */
  @ContentType(JSON)
  @PUT("/v1/{projectName}/filter")
  public static RestMethod updateUserFiltersUsingPUTJSON;
}
