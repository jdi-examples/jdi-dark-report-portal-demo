package com.epam.jdi.tests.stepdefs;

import com.epam.http.logger.ILogger;
import com.epam.jdi.auth.AuthTokenApi;
import com.epam.jdi.tools.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.cucumber.java.en.Given;
import io.restassured.authentication.BasicAuthScheme;
import io.restassured.specification.RequestSpecification;

import java.util.Date;
import java.util.Properties;

import static com.epam.http.logger.HTTPLogger.instance;
import static com.epam.http.requests.RequestDataFactory.auth;
import static com.epam.http.requests.ServiceInit.init;
import static io.restassured.RestAssured.given;

public class InitTests {

    protected int launchId;
    protected String launchUUId;
    protected int debugLaunchId;
    protected final String launchName = "Dark_Test";

    public static ILogger logger = instance("JDI_DEMO_TESTS");
    public RequestSpecification spec;
    public String testProject;
    public Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

    public Date now() {
        return new Date();
    }

    @Given("get sut access token")
    public void authentication() {
        Properties properties = PropertyReader.getProperties("test.properties");
        testProject = properties.getProperty("project");
        String sutUserName = properties.getProperty("sut_username");
        String sutPassword = properties.getProperty("sut_password");
        init(AuthTokenApi.class);
        BasicAuthScheme basicAuthScheme = new BasicAuthScheme();
        basicAuthScheme.setUserName("ui");
        basicAuthScheme.setPassword("uiman");
        String token = AuthTokenApi.getUserToken.call(
                auth(basicAuthScheme)
                        .formParamsUpdater().addAll(new Object[][]{
                        {"grant_type", "password"},
                        {"username", sutUserName},
                        {"password", sutPassword}}))
                .getRaResponse().jsonPath().getString("access_token");
        spec = given().auth().preemptive().oauth2(token);
    }

}
