package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;
import ui.Logout;
import ui.Proyect;

public class IsCreateProyect {
    public static boolean visibleProyect(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Proyect.tituloproyect);
    }
    public static String getTextInvalid(WebDriver webDriver){
        WebElement element = webDriver.findElement(Proyect.tituloproyect);
        return element.getText();
    }
}
