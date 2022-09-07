package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductFootwearPage {
    public static  final Target SLC_SIZE = Target.the("Selection size")
            .locatedBy("//div[@data-variationid='201710'] ");
    public static final Target BTN_BUY = Target.the("click button buy")
            .locatedBy("(//a[@data-product_id='201710'])[1] ");
}
