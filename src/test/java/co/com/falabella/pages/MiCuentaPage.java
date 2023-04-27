package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MiCuentaPage {
    public static Target BOTON_CONFIGURACION_CUENTA = Target.the("Boton configuracion de la cuenta").located(By.id("testId-navigationCard-configuremyaccount"));

}
