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

import static io.restassured.http.ContentType.ANY;
import com.epam.http.annotations.ContentType;
import com.epam.jdi.model.EntryCreatedRS;
import java.io.File;
import com.epam.http.annotations.FormParameter;
import com.epam.http.annotations.FormParameters;
import com.epam.jdi.model.IntegrationTypeResource;
import static io.restassured.http.ContentType.JSON;
import com.epam.jdi.model.OperationCompletionRS;
import com.epam.jdi.model.UpdatePluginStateRQ;
import com.epam.http.annotations.DELETE;
import com.epam.http.annotations.GET;
import com.epam.http.annotations.POST;
import com.epam.http.annotations.PUT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ServiceDomain("${domain}")
public class PluginControllerApi {

  /**
   * Delete plugin by id
   * 
   * @param pluginId /path/ pluginId (required)
   * @return OperationCompletionRS
  */
  @DELETE("/v1/plugin/{pluginId}")
  public static RestMethod deletePluginUsingDELETE;

  /**
   * Get all available plugins
   * 
   * @return List(IntegrationTypeResource);
  */
  @GET("/v1/plugin")
  public static RestMethod getPluginsUsingGET;

  /**
   * Update Report Portal plugin state
   * 
   * @param pluginId /path/ pluginId (required)
   * @param updatePluginStateRQ(UpdatePluginStateRQ) /body/ updatePluginStateRQ (required)
   * @return OperationCompletionRS
  */
  @ContentType(JSON)
  @PUT("/v1/plugin/{pluginId}")
  public static RestMethod updatePluginStateUsingPUTJSON;

  /**
   * Upload new Report Portal plugin
   * 
   * @return EntryCreatedRS
  */
  @ContentType(ANY)
  @FormParameter(name = "file", value = "new File(&quot;/path/to/file.txt&quot;)")
  @POST("/v1/plugin")
  public static RestMethod uploadPluginUsingPOSTANY;
}
