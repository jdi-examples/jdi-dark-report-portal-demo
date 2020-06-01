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
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * UpdateLaunchRQ
 */

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateLaunchRQ extends DataClass<UpdateLaunchRQ> {

    public String description;
    public ModeEnum mode;

    /**
     * Gets or Sets mode
     */
    public enum ModeEnum {
        DEFAULT("DEFAULT"),

        DEBUG("DEBUG");

        private String value;

        ModeEnum(String value) {
            this.value = value;
        }
    }

}

