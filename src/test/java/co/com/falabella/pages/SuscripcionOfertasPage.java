package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class SuscripcionOfertasPage {

     public static Target BOTON_CANCELAR_OFERTAS = Target.the("Boton no gracias").located(ByShadow.xpath("//button[@class='airship-btn airship-btn-deny'"));

}
