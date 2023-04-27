package co.com.falabella.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.falabella.pages.BienvenidaPage.BOTON_SALTAR;
import static co.com.falabella.pages.DesplegableOrdenarHomecenterFalabellaPage.BOTON_PRECIO_MENOR_A_MAYOR;
import static co.com.falabella.pages.HomecenterFalabellaPage.SECCION_VENTILADORES;
import static co.com.falabella.pages.HomecenterFalabellaSeccionPage.DESPLEGABLE_ORDERNAR;
import static co.com.falabella.pages.HomecenterFalabellaSeccionPage.LISTA_PRODUCTOS;
import static co.com.falabella.pages.TiendasOficialesPage.HOMECENTER_IMAGE;
import static co.com.falabella.pages.TiendasOficialesPage.SECCION_TIENDAS_OFICIALES;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class BusquedaArticulosHomecenterStepDefinitions {

    @Dado("que {actor} quiere comprar un ventilador")
    public void ingresoTiendaOficial(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SALTAR),
                Scroll.to(SECCION_TIENDAS_OFICIALES),
                Click.on(HOMECENTER_IMAGE)
        );
    }
    @Cuando("{actor} entra a la seccion de ventiladores en Homecenter")
    public void selecionarSeccion(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_SALTAR),
                Click.on(SECCION_VENTILADORES),
                Switch.toNewWindow()
        );
    }
    @Entonces("{actor} debe encontrar al menos {int} elemento en la seccion ordenado por su precio")
    public void buscarYOrdenarXProductosDeLaSeccionEscogida(Actor actor, Integer cantidadProductos) {
        actor.attemptsTo(
                Click.on(DESPLEGABLE_ORDERNAR),
                Click.on(BOTON_PRECIO_MENOR_A_MAYOR),
                WaitUntil.the(LISTA_PRODUCTOS, isVisible()).forNoMoreThan(6).seconds(),
                Ensure.that(LISTA_PRODUCTOS).textValues().hasSizeGreaterThanOrEqualTo(cantidadProductos)

        );

    }
}
