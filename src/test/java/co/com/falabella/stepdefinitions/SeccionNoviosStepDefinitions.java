package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.falabella.pages.BienvenidaPage.BOTON_SALTAR;
import static co.com.falabella.pages.NoviosPage.INPUT_APELLIDOS;
import static co.com.falabella.pages.ResultadoBusquedaApellidoNoviosPage.RESULTADO_NOVIOS;
import static co.com.falabella.pages.TernaryNavbarPage.BOTON_SECCION_NOVIOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeccionNoviosStepDefinitions {
    @Dado("que {actor} desea hacer un regalo a una pareja")
    public void ingresoSeccionNovios(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SALTAR),
                Click.on(BOTON_SECCION_NOVIOS),
                Switch.toNewWindow()
        );
    }
    @Cuando("{actor} ingresa el apellido {string} en la seccion de novios")
    public void busquedaParejeasPorApellido(Actor actor, String apellido) {
        actor.attemptsTo(
                Enter.theValue(apellido).into(INPUT_APELLIDOS).thenHit(Keys.ENTER)
        );
    }
    @Entonces("{actor} debe encontrar al menos {int} pareja con ese apellido")
    public void resultadoBusquedaParejas(Actor actor, Integer cantidadParejas) {
        actor.attemptsTo(
                WaitUntil.the(RESULTADO_NOVIOS, isVisible()).forNoMoreThan(5).seconds(),
                Ensure.that(RESULTADO_NOVIOS).textValues().hasSizeGreaterThanOrEqualTo(cantidadParejas)

        );
    }
}
