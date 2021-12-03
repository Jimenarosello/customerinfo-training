package com.bbva.achp.risklimitsbehavioralevaluationsv0;

import javax.inject.Inject;

import com.bbva.arch.qe.backend.client.TestingScenario;

import cucumber.api.java.en.When;

public class RiskLimitsListBehavioralEvaluationsV0RequestSteps {

    @Inject
    private TestingScenario scenario;

    @When("The user executes service listBehavioralEvaluations")
    public void theUserExecutesServiceListBehavioralEvaluations() {
        scenario.http()
            .get("/risk-limits/v0/behavioral-evaluations")
            .send();
    }

}