package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage {

    public static final Target COMPARE_WISH_LIST = Target.the("compare wish list in my account")
            .locatedBy("//*[text()='Lista de deseos']");
    public static  final  Target BTN_FOOTWEAR = Target.the("click of option footwear")
            .locatedBy("(//*[text()='Zapatos'])[1]");
}
