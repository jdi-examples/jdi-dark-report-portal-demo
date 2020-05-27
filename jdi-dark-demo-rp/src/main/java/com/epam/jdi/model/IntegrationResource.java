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

import com.epam.jdi.model.IntegrationTypeResource;
import java.util.Date;

import com.epam.jdi.tools.DataClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IntegrationResource
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class IntegrationResource extends DataClass<IntegrationResource>{

  public Date creationDate;
  public String creator;
  public Boolean enabled;
  public Long id;
  public Object integrationParameters;
  public IntegrationTypeResource integrationType;
  public String name;
  public Long projectId;
}

