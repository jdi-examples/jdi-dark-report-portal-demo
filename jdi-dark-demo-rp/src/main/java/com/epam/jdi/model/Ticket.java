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

package com.epam.jdi.model;

import com.epam.jdi.tools.DataClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Ticket
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket extends DataClass<Ticket> {

    public String id;
    public String status;
    public String summary;
    public String url;
}

