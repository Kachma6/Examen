package task.tasking;

import actions.Click;
import actions.Hover;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.Menu;

public class ExpandMenu {
    public static void as (WebDriver webDriver){
        Click.on(webDriver, HomePageUI.menu);
        Hover.on(webDriver, Menu.bottonDesable);
    }
}
