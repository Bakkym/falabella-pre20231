package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("testId-SearchBar-Input"));
    public static Target BOTON_MENU = Target.the("boton para el menu").located(By.id("testId-HamburgerBtn-toggle"));
}
