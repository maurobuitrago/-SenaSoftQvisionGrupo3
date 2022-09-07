package com.co.qvision.questions;

import com.co.qvision.userinterfaces.PqrPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ComparePqr implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PqrPage.COMPARE_MODULE_BONBONITE).viewedBy(actor).asString();
    }
    public  static  ComparePqr comparePqr(){
        return  new ComparePqr();
    }
}
