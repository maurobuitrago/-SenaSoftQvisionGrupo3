package com.co.qvision.stepsdefinitions;

import com.co.qvision.questions.CompareAddProduct;
import com.co.qvision.questions.CompareMyAccount;
import com.co.qvision.tasks.AddProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class ProductStepDefinitions {

    @When("^He user add products$")
    public void heUserAddProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.addProduct());

    }


    @Then("^He user could see the product in the product list$")
    public void heUserCouldSeeTheProductInTheProductList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareAddProduct.compareAddProduct()
                , Matchers.equalTo("FINALIZAR COMPRA")));

    }
}
