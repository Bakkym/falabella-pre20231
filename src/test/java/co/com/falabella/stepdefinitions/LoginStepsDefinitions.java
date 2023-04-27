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
import static co.com.falabella.pages.CabeceraPage.DESPLEGABLE_LOGIN;
import static co.com.falabella.pages.CabeceraPage.DESPLEGABLE_USUARIO_LOGEADO;
import static co.com.falabella.pages.DesplegableLogin.BOTON_INCIAR_SESION;
import static co.com.falabella.pages.DesplegableLogueadoPage.BOTON_MI_CUENTA;
import static co.com.falabella.pages.FormularioLoginPage.*;
import static co.com.falabella.pages.MiCuentaPage.BOTON_CONFIGURACION_CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepsDefinitions {

    @Dado("que {actor} busca ingresar con su cuenta")
    public void MenuLogin(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                Click.on(BOTON_SALTAR),
                MoveMouse.to(DESPLEGABLE_LOGIN),
                Click.on(BOTON_INCIAR_SESION)

        );


    }
    @Cuando("{actor} ingresa su correo {string} y contraseña {string}")
    public void iniciarSesion(Actor actor, String email, String password) {
        actor.attemptsTo(
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BOTON_INGRESAR),
                WaitUntil.the(DESPLEGABLE_USUARIO_LOGEADO, isVisible()).forNoMoreThan(3).seconds()

        );


    }
    @Entonces("{actor} debe tener acceso a la informacion de su cuenta")
    public void verificarCuenta(Actor actor) {
        actor.attemptsTo(
                MoveMouse.to(DESPLEGABLE_USUARIO_LOGEADO),
                Click.on(BOTON_MI_CUENTA),
                WaitUntil.the(BOTON_CONFIGURACION_CUENTA, isVisible()).forNoMoreThan(5).seconds()

        );
    }
}

