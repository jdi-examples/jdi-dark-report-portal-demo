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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SearchLogRq
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchLogRq extends DataClass<SearchLogRq>{

  public Long filterId;
  public SearchModeEnum searchMode;
  /**
   * Gets or Sets searchMode
   */
  public enum SearchModeEnum {
      CURRENTLAUNCH("currentLaunch"),
      
      LAUNCHNAME("launchName"),
      
      FILTER("filter");

      private String value;

      SearchModeEnum(String value) {
      this.value = value;
  }
  }

}

