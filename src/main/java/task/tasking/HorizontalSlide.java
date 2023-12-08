package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.HorizontalSlider;

public class HorizontalSlide {
    public static void as(WebDriver webDriver){
        Click.on(webDriver, HomePageUI.horizontalSlide);
        Enter.slide(webDriver, HorizontalSlider.slide,1);

    }
}
