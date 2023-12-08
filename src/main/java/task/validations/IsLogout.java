package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.Logout;

public class IsLogout {
    public static boolean visibleButtonLogout(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUI.login);
    }
}
