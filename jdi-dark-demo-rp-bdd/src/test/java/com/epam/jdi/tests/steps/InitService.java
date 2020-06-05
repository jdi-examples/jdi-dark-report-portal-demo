package com.epam.jdi.tests.steps;

import com.epam.jdi.api.ActivityControllerApi;
import com.epam.jdi.api.LaunchControllerApi;
import com.epam.jdi.api.UserControllerApi;
import io.cucumber.java.en.Given;

import static com.epam.http.requests.ServiceInit.init;
import static com.epam.jdi.http.Utils.service;

public class InitService extends GlobalVariables {

    @Given("init {string} service")
    public void initService(String serviceName) throws Exception {
        switch (serviceName) {
            case "ActivityControllerApi":
                service.set(init(ActivityControllerApi.class, spec));
                break;
            case "LaunchControllerApi":
                service.set(init(LaunchControllerApi.class, spec));
                break;
            case "UserControllerApi":
                service.set(init(UserControllerApi.class, spec));
                break;
            default:
                throw new NoSuchFieldException(String.format("There is no '%s' service found", serviceName));
        }
    }

}
