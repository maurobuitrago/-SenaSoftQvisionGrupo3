package com.co.qvision.tasks;

import com.co.qvision.models.Data;
import com.co.qvision.userinterfaces.HomePage;
import com.co.qvision.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class Register implements Task {
    Data data;

    public Register(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_LOGIN));
        actor.attemptsTo(Enter.theValue(data.getIdentification()).into(RegisterPage.NUM_CC));
        actor.attemptsTo(Enter.theValue(data.getEmail()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Scroll.to(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(data.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BTN_CHECK));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));

    }

    public static Register register(Data data) {

       return Tasks.instrumented(Register.class, data);

    }

}
