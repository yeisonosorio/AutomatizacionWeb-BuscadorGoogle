package com.inditex.stepdefinitions;

import com.inditex.questions.AnioProcesoAuto;
import com.inditex.setup.Configuracion;
import com.inditex.tasks.AbrirPaginaInicial;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import net.serenitybdd.core.Serenity;

import static com.inditex.tasks.Google.googleSearch;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class GoogleStepDefinitions extends Configuracion {

    public static Logger LOGGER = Logger.getLogger(GoogleStepDefinitions.class);

    @Given("que estoy en el sitio web de Google")
    public void queEstoyEnElSitioWebDeGoogle() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
        } catch (Exception e) {
            LOGGER.info("fallo la configuracion inicial");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }
    }

    @When("busco {string} y accedo a la pagina de Wikipedia")
    public void buscoYAccedoALaPaginaDeWikipedia(String palabra) {
        try {
            theActorInTheSpotlight().attemptsTo(
                    googleSearch()
                            .conLaPalabra(palabra)
            );
        } catch (Exception e) {
            LOGGER.info("fallo el proceso de buscar la palabra");
            LOGGER.warn(e.getMessage());
            quitarDriver();
        }

    }

    @Then("comprobar anio que se hizo el primer proceso automatico {string}")
    public void comprobarAnioQueSeHizoElPrimerProcesoAutomatico(String texto) {
        try {
            theActorInTheSpotlight().should(
                    seeThat(AnioProcesoAuto.isEqualTo(), containsString((texto)))
            );

        } catch (Exception e) {
            LOGGER.info("fallo el proceso de automatizacion");
            LOGGER.warn(e.getMessage());
        } finally {
            quitarDriver();
        }
    }


}
