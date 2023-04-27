package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomecenterFalabellaSeccionPage {
    public static Target DESPLEGABLE_ORDERNAR = Target.the("Desplegable opciones de ordenamiento").located(By.id("testId-Dropdown-desktop-button"));
    public static Target LISTA_PRODUCTOS = Target.the("Resultado de busqueda de productos por seccion").locatedBy("//div[@pod-layout='4_GRID']");





}