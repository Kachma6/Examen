package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.HomePageUI;

public class SignUp {
    public static void as(WebDriver webDriver, String nombre, String correo, String pass){
        Click.on(webDriver, HomePageUI.signup);
        Enter.text(webDriver, ui.SignUp.name,nombre);
        Enter.text(webDriver, ui.SignUp.email,correo);
        Enter.text(webDriver, ui.SignUp.password,pass);
        Click.on(webDriver, ui.SignUp.terminos);
        Click.on(webDriver, ui.SignUp.buttonSing);


        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Add elements");
    }
}
