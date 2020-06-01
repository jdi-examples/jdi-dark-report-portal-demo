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
 * WidgetResource
 */

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WidgetResource extends DataClass<WidgetResource> {

    public Object content;
    public ContentParameters contentParameters;
    public String description;
    public Long id;
    public String name;
    public String owner;
    public Boolean share;
    public WidgetTypeEnum widgetType;

    /**
     * Gets or Sets widgetType
     */
    public enum WidgetTypeEnum {
        OLDLINECHART("oldLineChart"),

        INVESTIGATEDTREND("investigatedTrend"),

        LAUNCHSTATISTICS("launchStatistics"),

        STATISTICTREND("statisticTrend"),

        CASESTREND("casesTrend"),

        NOTPASSED("notPassed"),

        OVERALLSTATISTICS("overallStatistics"),

        UNIQUEBUGTABLE("uniqueBugTable"),

        BUGTREND("bugTrend"),

        ACTIVITYSTREAM("activityStream"),

        LAUNCHESCOMPARISONCHART("launchesComparisonChart"),

        LAUNCHESDURATIONCHART("launchesDurationChart"),

        LAUNCHESTABLE("launchesTable"),

        TOPTESTCASES("topTestCases"),

        FLAKYTESTCASES("flakyTestCases"),

        PASSINGRATESUMMARY("passingRateSummary"),

        PASSINGRATEPERLAUNCH("passingRatePerLaunch"),

        PRODUCTSTATUS("productStatus"),

        MOSTTIMECONSUMING("mostTimeConsuming"),

        CUMULATIVE("cumulative");

        private String value;

        WidgetTypeEnum(String value) {
            this.value = value;
        }
    }

}

