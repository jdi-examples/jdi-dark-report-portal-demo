package com.epam.jdi.tests.steps;

import com.epam.http.logger.ILogger;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.specification.RequestSpecification;

import java.util.Date;

import static com.epam.http.logger.HTTPLogger.instance;

public class GlobalVariables {

    public static String[] names;
    public static int launchId;
    public static String launchUUId;
    public static int debugLaunchId;

    public static ILogger logger = instance("JDI_DEMO_TESTS");
    public static RequestSpecification spec;
    public static String testProject;
    public static Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

    public static Date now() {
        return new Date();
    }
}
