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

import com.epam.jdi.model.IntegrationResource;
import com.epam.jdi.model.ProjectConfiguration;
import com.epam.jdi.model.ProjectUser;
import java.util.Date;
import java.util.List;

import com.epam.jdi.tools.DataClass;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProjectResource
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProjectResource extends DataClass<ProjectResource>{

  public Long allocatedStorage;
  public ProjectConfiguration configuration;
  public Date creationDate;
  public String entryType;
  public String organization;
  public Long projectId;
  public String projectName;
}

