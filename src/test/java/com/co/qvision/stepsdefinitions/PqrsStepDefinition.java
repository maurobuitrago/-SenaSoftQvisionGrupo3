package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.CompareMyAccount;
import com.co.qvision.questions.ComparePqr;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class PqrsStepDefinition {

    @When("^He user could see the PQRS module$")
    public void heUserCouldSeeThePQRSModule() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ComparePqr.comparePqr()
                , Matchers.equalTo("E")));

    }
}
