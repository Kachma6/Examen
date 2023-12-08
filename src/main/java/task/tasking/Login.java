package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.FormAuthentication;
import ui.HomePageUI;

public class Login {
    public static void as(WebDriver webDriver, String username, String password){
        Click.on(webDriver, HomePageUI.login);
        Enter.text(webDriver, ui.Login.username, username);
        Enter.text(webDriver, ui.Login.password, password);
        Click.on(webDriver, ui.Login.loginButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Login");
    }
}
