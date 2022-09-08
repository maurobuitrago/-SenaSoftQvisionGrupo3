package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AddProductPage;
import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MyAccountPage.BTN_FOOTWEAR));
        actor.attemptsTo(Click.on(AddProductPage.SLC_IMG));
        actor.attemptsTo(Click.on(AddProductPage.SLC_SIZE));
        actor.attemptsTo(Click.on(AddProductPage.SLC_SIZE_34));
        actor.attemptsTo(Scroll.to(AddProductPage.BTN_BUY));
        actor.attemptsTo(Click.on(AddProductPage.BTN_BUY));




    }

    public  static AddProduct addProduct(){
        return Tasks.instrumented(AddProduct.class);
    }
}
