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

import java.util.Date;

/**
 * IntegrationTypeResource
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class IntegrationTypeResource extends DataClass<IntegrationTypeResource> {

    public AuthFlowEnum authFlow;

    /**
     * Gets or Sets authFlow
     */
    public enum AuthFlowEnum {
        OAUTH("OAUTH"),

        BASIC("BASIC"),

        TOKEN("TOKEN"),

        FORM("FORM"),

        LDAP("LDAP");

        private String value;

        AuthFlowEnum(String value) {
            this.value = value;
        }
    }

    public Date creationDate;
    public Object details;
    public Boolean enabled;
    public String groupType;
    public String name;
    public Long type;
}

