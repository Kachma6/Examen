package task.tasking;

import actions.Click;
import actions.Hover;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class HoverImagen1 {
    public static void as(WebDriver webDriver){
        Click.on(webDriver, HomePageUI.hover);
        Hover.on(webDriver, ui.Hover.imagen1);
    }
}
