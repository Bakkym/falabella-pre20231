package co.com.falabella.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioLoginPage {
    public static Target INPUT_EMAIL = Target.the("Input del email").located(By.id("testId-cc-login-form-email-input"));
    public static Target INPUT_PASSWORD = Target.the("Input de la contraseña").located(By.id("testId-cc-login-form-password-input"));
    public static Target BOTON_INGRESAR = Target.the("Boton para iniciar sesion").located(By.id("testId-cc-login-form-submit"));





}
