package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target BARRA_BUSQUEDA = Target.the("barra de busqueda").located(By.id("testId-SearchBar-Input"));
    public static Target BOTON_MENU = Target.the("boton para el menu").located(By.id("testId-HamburgerBtn-toggle"));
    public static Target DESPLEGABLE_LOGIN = Target.the("Desplegable Login").located(By.id("testId-UserAction-userinfo"));
    public static Target DESPLEGABLE_USUARIO_LOGEADO = Target.the("Desplegable del usuario ya logueado").locatedBy("//div[@class='Popover-module_popover-container__3qpkj Popover-module_bottom-caret-login__1WGhj']");


}
