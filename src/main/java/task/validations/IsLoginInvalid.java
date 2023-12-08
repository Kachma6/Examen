package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;
import ui.Logout;

public class IsLoginInvalid {
    public static boolean visibleInvalidName(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Logout.logoutButton);
    }
    public static String getTextInvalid(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAuthentication.invalidUsername);
        return element.getText();
    }

}
