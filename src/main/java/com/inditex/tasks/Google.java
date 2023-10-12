package com.inditex.tasks;

import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static com.inditex.ui.Google.*;

public class Google implements Task {


    private String palabra;


    public Google conLaPalabra(String palabra) {
        this.palabra = palabra;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(palabra).into(searchbox).thenHit(Keys.ENTER),
                Scroll.to(scroll),
                Click.on(wiki),
                Scroll.to(enlace_historia),
                Click.on(enlace_historia)


                //WaitUntil.the(BTN_IMG, isClickable()).forNoMoreThan(10).seconds()

        );
    }


    public static Google googleSearch() {
        return new Google();
    }

}
