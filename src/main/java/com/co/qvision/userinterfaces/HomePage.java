package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_LOGIN = Target.the("click login")
            .locatedBy("//*[@class='myaccount']");


}
