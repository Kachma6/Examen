package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.Menu;

public class IsVisibleMenu {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Menu.bottonDownload);
    }
}
