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

import com.epam.jdi.model.Order;
import com.epam.jdi.model.UserFilterCondition;
import java.util.List;

import com.epam.jdi.tools.DataClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateUserFilterRQ
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserFilterRQ extends DataClass<UpdateUserFilterRQ>{

  public String description;
  public String name;
  public Boolean share;
  public TypeEnum type;
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
      LAUNCH("launch"),
      
      TESTITEM("testitem"),
      
      LOG("log");

      private String value;

      TypeEnum(String value) {
      this.value = value;
  }
  }

}

