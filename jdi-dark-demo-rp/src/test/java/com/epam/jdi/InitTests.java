package com.epam.jdi;

import com.epam.jdi.auth.AuthTokenApi;
import com.epam.jdi.tools.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.authentication.BasicAuthScheme;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.util.Date;

import static com.epam.http.requests.RequestDataFactory.auth;
import static com.epam.http.requests.ServiceInit.init;
import static io.restassured.RestAssured.given;

public class InitTests {

    public RequestSpecification spec;
    public String testProject;
    public Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();

    @BeforeClass(alwaysRun = true)
    public void authentication() {
        testProject = PropertyReader.getProperties("test.properties").getProperty("project");
        init(AuthTokenApi.class);
        BasicAuthScheme basicAuthScheme = new BasicAuthScheme();
        basicAuthScheme.setUserName("ui");
        basicAuthScheme.setPassword("uiman");
        String token = AuthTokenApi.getUserToken.call(
                auth(basicAuthScheme)
                        .formParamsUpdater().addAll(new Object[][]{
                        {"grant_type", "password"},
                        {"username", "test-user"},
                        {"password", "Fqvq1s0S"}}))
                .getRaResponse().jsonPath().getString("access_token");
        spec = given().auth().preemptive().oauth2(token);
    }

    public Date now() {
        return new Date();
    }
}
