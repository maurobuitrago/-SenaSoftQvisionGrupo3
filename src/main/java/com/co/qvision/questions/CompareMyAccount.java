package com.co.qvision.questions;

import com.co.qvision.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareMyAccount implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MyAccountPage.COMPARE_WISH_LIST).viewedBy(actor).asString();
    }
    public  static  CompareMyAccount compareMyAccount(){
        return  new CompareMyAccount();
    }
}
