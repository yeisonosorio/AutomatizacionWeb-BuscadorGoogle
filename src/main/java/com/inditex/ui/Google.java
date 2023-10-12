package com.inditex.ui;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Google extends PageObject{

    public static final Target searchbox  = Target.the("buscador")
            .located(By.name("q"));


    public static final Target scroll  = Target.the("scroll")
            .located(By.xpath("(//a[@jsname='UWckNb'])[6]"));


    public static final Target wiki  = Target.the("Wiki")
            .located(By.xpath("(//a[@jsname='UWckNb'])[7]"));

    public static final Target enlace_historia  = Target.the("Historia temprana")
            .located(By.id("Historia_temprana"));


}
