package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TernaryNavbarPage {
    public static Target DESPLEGABLE_TARJETAS_Y_CUENTAS = Target.the("Desplegable tarjetas y cuentas").locatedBy("//div[@id='testId-extra-links-dropdown-1']");
    public static Target BOTON_SECCION_NOVIOS = Target.the("Boton seccion de novios").located(By.id("testId-extra-links-3"));
    public static Target DESPLEGAGLE_AYUDA = Target.the("Desplegable con secciones de ayuda").located(By.id("testId-extra-links-dropdown-4"));

}



