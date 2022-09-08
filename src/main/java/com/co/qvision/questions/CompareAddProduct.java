package com.co.qvision.questions;

import com.co.qvision.userinterfaces.AddProductPage;
import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class CompareAddProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Boolean.valueOf(Visibility.of(AddProductPage.BTN_FINISH).viewedBy(actor).asBoolean());
    }
    public static CompareAddProduct compareAddProduct(){
        return new CompareAddProduct();
    }
}
