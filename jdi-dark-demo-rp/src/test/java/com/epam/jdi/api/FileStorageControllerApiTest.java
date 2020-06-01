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

import com.epam.http.response.RestResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.http.requests.ServiceInit.init;

/**
 * API tests for FileStorageControllerApi
 */
public class FileStorageControllerApiTest {

    @BeforeClass
    public void before() {
        init(FileStorageControllerApi.class);
    }


    /**
     * Delete user&#39;s photo
     */
    @Test
    public void deletePhotoUsingDELETETest() {
        // TODO: add call parameters and test validations
        RestResponse resp = FileStorageControllerApi.deletePhotoUsingDELETE.call();
        resp.isOk();
    }

    /**
     * getFile
     */
    @Test
    public void getFileUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = FileStorageControllerApi.getFileUsingGET.call();
        resp.isOk();
    }

    /**
     * Get photo of current user
     */
    @Test
    public void getMyPhotoUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = FileStorageControllerApi.getMyPhotoUsingGET.call();
        resp.isOk();
    }

    /**
     * Get user&#39;s photo
     */
    @Test
    public void getUserPhotoUsingGETTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = FileStorageControllerApi.getUserPhotoUsingGET.call();
        resp.isOk();
    }

    /**
     * Upload user&#39;s photo
     */
    @Test
    public void uploadPhotoUsingPOSTANYTest() {
        // TODO: add call parameters and test validations
        RestResponse resp = FileStorageControllerApi.uploadPhotoUsingPOSTANY.call();
        resp.isOk();
    }

}
