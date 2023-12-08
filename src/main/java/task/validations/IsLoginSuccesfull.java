package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;
import ui.Logout;

public class IsLoginSuccesfull {
    public static boolean visibleButtonLogout(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Logout.logoutButton);
    }
    public static boolean visibleMessage(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver,FormAuthentication.messageAuth);
    }
    public static String getTextSuccess(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormAuthentication.messageAuth);
        return element.getText();
    }
}
