package com.co.qvision.tasks;

import com.co.qvision.userinterfaces.AddProductPage;
import com.co.qvision.userinterfaces.MyAccountPage;
import com.co.qvision.userinterfaces.ProductFootwearPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MyAccountPage.BTN_FOOTWEAR));
        actor.attemptsTo(Click.on(ProductFootwearPage.SLC_IMG));
        actor.attemptsTo(Click.on(ProductFootwearPage.SLC_SIZE));
        actor.attemptsTo(Click.on(ProductFootwearPage.BTN_BUY));


    }

    public  static AddProduct addProduct(){
        return Tasks.instrumented(AddProduct.class);
    }
}
