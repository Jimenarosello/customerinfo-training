package com.bbva.uuaa.customersv0;

import javax.inject.Inject;

import com.bbva.arch.qe.backend.client.TestingScenario;

import cucumber.api.java.en.When;

public class CustomersV0RequestSteps {

    @Inject
    private TestingScenario scenario;

    @When("The user executes service listCustomers")
    public void theUserExecutesServiceListCustomers() {
        scenario.http()
            .get("/customers/v0/customers")
            .send();
    }

}