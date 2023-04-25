package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.falabella.pages.AyudaDevolucionesPage.INFORMACION_DEVOLUCIONES;
import static co.com.falabella.pages.BienvenidaPage.BOTON_SALTAR;
import static co.com.falabella.pages.DesplegableAyudaPage.BOTON_DEVOLUCIONES_CAMBIO;
import static co.com.falabella.pages.TernaryNavbarPage.DESPLEGAGLE_AYUDA;

public class InfoDevolucionesStepDefinitions {
    @Dado("que {actor} desea conocer el funcionamiento de las devoluciones")
    public void desplegableAyuda(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SALTAR),
                MoveMouse.to(DESPLEGAGLE_AYUDA)

        );

    }
    @Cuando("{actor} ingresa a la seccion de ayuda")
    public void ingresoSeccionDevoluciones(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_DEVOLUCIONES_CAMBIO),
                Click.on(BOTON_SALTAR)

        );

    }
    @Entonces("{actor} debe encontrar la informacion relacionada a devoluciones")
    public void informacionRelacionadaDevoluciones(Actor actor) {
        actor.attemptsTo(
                Ensure.that(INFORMACION_DEVOLUCIONES).textValues().isNotEmpty()

        );

    }
}
