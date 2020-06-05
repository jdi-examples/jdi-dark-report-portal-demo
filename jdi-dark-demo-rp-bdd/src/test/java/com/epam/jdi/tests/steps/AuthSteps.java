package com.epam.jdi.tests.steps;

import com.epam.jdi.auth.AuthTokenApi;
import com.epam.jdi.tools.PropertyReader;
import io.cucumber.java.en.Given;
import io.restassured.authentication.BasicAuthScheme;

import java.util.Properties;

import static com.epam.http.requests.RequestDataFactory.auth;
import static com.epam.http.requests.ServiceInit.init;
import static io.restassured.RestAssured.given;

public class AuthSteps extends Global {

    @Given("get sut access token")
    public void authentication() {
        Properties properties = PropertyReader.getProperties("test.properties");
        testProject = properties.getProperty("project");
        String sutUserName = properties.getProperty("sut.username");
        String sutPassword = properties.getProperty("sut.password");
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
