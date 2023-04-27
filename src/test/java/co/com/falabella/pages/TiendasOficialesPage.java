package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TiendasOficialesPage {
    public static Target SECCION_TIENDAS_OFICIALES = Target.the("Seccion de tiendas oficiales").located(By.id("main-RichText-31e4967c-3cc0-4669-a76d-e8cd1f844340"));

    public static Target HOMECENTER_IMAGE = Target.the("Imagen con link a homecenter").locatedBy("(//div[@data-testid='powercard-image']/a[contains(@href, 'homecenter')])[1]");


}
