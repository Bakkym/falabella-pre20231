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
import static co.com.falabella.pages.CabeceraPage.BOTON_MENU;
import static co.com.falabella.pages.MenuCategoriaPage.TECNOLOGIA_PORTATILES;
import static co.com.falabella.pages.MenuPage.CATEGORIA_TECNOLOGIA;
import static co.com.falabella.pages.ProductosPorCategoriaPage.PRODUCTOS_PORTATILES;

public class MenuBusquedaStepDefinitions {
    @Dado("que {actor} busca portatiles en el menu")
    public void buscarMenu(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SALTAR),
                Click.on(BOTON_MENU)
        );
    }
    @Cuando("{actor} selecciona la opcion portatiles")
    public void SeleccionarOpcion(Actor actor) {
        actor.attemptsTo(
                MoveMouse.to(CATEGORIA_TECNOLOGIA),
                Click.on(TECNOLOGIA_PORTATILES)
        );


    }
    @Entonces("{actor} debe encontrar al menos {int} elemento en la seccion")
    public void mostrarXCantidadProductos(Actor actor, Integer cantidadProductos) {
        actor.attemptsTo(
                Ensure.that(PRODUCTOS_PORTATILES).textValues().hasSizeGreaterThanOrEqualTo(cantidadProductos)
        );
    }


}
