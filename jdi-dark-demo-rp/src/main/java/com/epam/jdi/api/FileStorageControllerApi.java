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
import com.epam.http.annotations.FormParameter;
import com.epam.http.annotations.GET;
import com.epam.http.annotations.POST;
import com.epam.http.annotations.QueryParameter;
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.DataMethod;
import com.epam.http.requests.RestMethod;
import com.epam.jdi.model.OperationCompletionRS;

import static io.restassured.http.ContentType.ANY;

@ServiceDomain("${domain}")
public class FileStorageControllerApi {

    /**
     * Delete user&#39;s photo
     *
     * @return OperationCompletionRS
     */
    @DELETE("/v1/data/photo")
    public static DataMethod<OperationCompletionRS> deletePhotoUsingDELETE;

    /**
     * getFile
     *
     * @param dataId /path/ dataId (required)
     * @param projectName /path/ projectName (required)
     */
    @GET("/v1/data/{projectName}/{dataId}")
    public static RestMethod getFileUsingGET;

    /**
     * Get photo of current user
     *
     * @param loadThumbnail /query/ loadThumbnail (optional)
     */
    @QueryParameter(name = "loadThumbnail", value = "true")
    @GET("/v1/data/photo")
    public static RestMethod getMyPhotoUsingGET;

    /**
     * Get user&#39;s photo
     *
     * @param projectName /path/ projectName (required)
     * @param id /query/ id (required)
     * @param loadThumbnail /query/ loadThumbnail (optional)
     */
    @QueryParameter(name = "id", value = "id_example")
    @QueryParameter(name = "loadThumbnail", value = "true")
    @GET("/v1/data/{projectName}/userphoto")
    public static RestMethod getUserPhotoUsingGET;

    /**
     * Upload user&#39;s photo
     *
     * @return OperationCompletionRS
     */
    @ContentType(ANY)
    @FormParameter(name = "file", value = "new File(&quot;/path/to/file.txt&quot;)")
    @POST("/v1/data/photo")
    public static DataMethod<OperationCompletionRS> uploadPhotoUsingPOSTANY;
}
