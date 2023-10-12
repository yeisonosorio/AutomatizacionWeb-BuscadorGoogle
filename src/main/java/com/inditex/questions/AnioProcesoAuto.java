package com.inditex.questions;

import static org.openqa.selenium.By.cssSelector;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import net.serenitybdd.screenplay.targets.Target;

public class AnioProcesoAuto {


    public static final Target ANIO_PROCESO = Target
            .the("anio")
            .located(cssSelector("a[title=\"Egipto ptolemaico\"]"));

    public static Question<String> isEqualTo() {
        return TheTarget.textOf(ANIO_PROCESO);
    }

    private AnioProcesoAuto() {
    }
}