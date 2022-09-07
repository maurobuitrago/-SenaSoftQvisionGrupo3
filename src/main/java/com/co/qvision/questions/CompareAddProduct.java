package com.co.qvision.questions;

import com.co.qvision.userinterfaces.AddProductPage;
import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareAddProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AddProductPage.BTN_FINISH_SHOPPING).viewedBy(actor).asString();
    }
    public static CompareAddProduct compareAddProduct(){
        return new CompareAddProduct();
    }
}
