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
import com.epam.http.annotations.POST;
import com.epam.http.annotations.PUT;
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.RestDataMethod;
import com.epam.jdi.model.FinishLaunchRS;
import com.epam.jdi.model.LaunchResource;
import com.epam.jdi.model.StartLaunchRS;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("${api}")
public class LaunchAsyncControllerApi {

    /**
     * Finish launch for specified project
     *
     * @param launchId /path/ launchId (required)
     * @param projectName /path/ projectName (required)
     * @param finishLaunchRQ(FinishExecutionRQ) /body/ finishLaunchRQ (required)
     * @return FinishLaunchRS
     */
    @ContentType(JSON)
    @PUT("/v2/{projectName}/launch/{launchId}/finish")
    public static RestDataMethod<FinishLaunchRS> finishLaunchUsingPUT;

    /**
     * Merge set of specified launches in common one
     *
     * @param projectName /path/ projectName (required)
     * @param mergeLaunchesRQ(MergeLaunchesRQ) /body/ Merge launches request body (required)
     * @return LaunchResource
     */
    @ContentType(JSON)
    @POST("/v2/{projectName}/launch/merge")
    public static RestDataMethod<LaunchResource> mergeLaunchesUsingPOST;

    /**
     * Starts launch for specified project
     *
     * @param projectName /path/ projectName (required)
     * @param startLaunchRQ(StartLaunchRQ) /body/ Start launch request body (required)
     * @return StartLaunchRS
     */
    @ContentType(JSON)
    @POST("/v2/{projectName}/launch")
    public static RestDataMethod<StartLaunchRS> startLaunchUsingPOST;
}
