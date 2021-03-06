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
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.RestDataMethod;
import com.epam.jdi.model.OperationCompletionRS;

import static io.restassured.http.ContentType.JSON;

@ServiceDomain("${api}")
public class UserControllerApi {

    /**
     * Change own password
     *
     * @param changePasswordRQ(ChangePasswordRQ) /body/ changePasswordRQ (required)
     * @return OperationCompletionRS
     */
    @ContentType(JSON)
    @POST("/v1/user/password/change")
    public static RestDataMethod<OperationCompletionRS> changePasswordUsingPOST;

}
