package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.Data;
import com.co.qvision.tasks.Register;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RegisterStepDefinition {

    @When("^He user register in the page$")
    public void heUserRegisterInThePage(List<Data>dataList) {

        Data data;
        data = dataList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Register.register(data));

    }

}
