package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductFootwearPage {

    public static  final Target SLC_IMG = Target.the("Selection image")
            .locatedBy("(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[1]");

    public static  final Target SLC_SIZE = Target.the("Selection size")
            .locatedBy("//*[@class='variations_form cart']");
    public static  final Target SLC_SIZE_34 = Target.the("Selection size")
            .locatedBy("(//*[@class='size_select'])[1]");
    public static final Target BTN_BUY = Target.the("click button buy")
            .locatedBy("(//div[@class='buy_button'])[1]");
}
