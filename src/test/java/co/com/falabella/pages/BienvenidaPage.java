package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BienvenidaPage {
    public static Target BOTON_SALTAR = Target.the("saltar anuncio bienvenida").located(By.id("testId-onboarding-desktop-skip"));

}
