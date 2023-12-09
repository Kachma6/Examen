package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class Proyect {
    public static void as(WebDriver webDriver, String username, String password){
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, ui.Login.username, username);
        Enter.text(webDriver, ui.Login.password, password);
        Click.on(webDriver, ui.Login.loginButton);
        Click.on(webDriver, ui.Proyect.create);
        Enter.text(webDriver, ui.Proyect.input, "diplomadoV5");
        Click.on(webDriver, ui.Proyect.buttoncreate);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Login");
    }
}
