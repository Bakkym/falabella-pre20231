package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.BienvenidaPage.BOTON_SALTAR;
import static co.com.falabella.pages.OportunidadesUnicasPage.SECCION_DEPORTES;
import static co.com.falabella.pages.DesplegableTarjetasYCuentasPage.BOTON_OPORTUNIDADES_UNICAS;
import static co.com.falabella.pages.TernaryNavbarPage.DESPLEGABLE_TARJETAS_Y_CUENTAS;

public class OportunidadesUnicasStepDefinitions {

    @Dado("que {actor} busca la seccion de deportes")
    public void buscarOpcionOportunidadesUnicas(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SALTAR),
                MoveMouse.to(DESPLEGABLE_TARJETAS_Y_CUENTAS)
        );
    }
    @Cuando("{actor} selecciona la opcion de oportunidades unicas")
    public void seleccionarOportunidadesUnicas(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_OPORTUNIDADES_UNICAS)
        );
    }
    @Entonces("{actor} debe encontrar la seccion de deportes")
    public void buscarSeccionDeportes(Actor actor) {
        actor.attemptsTo(
                Ensure.that(SECCION_DEPORTES).isDisplayed()
        );
    }
}
