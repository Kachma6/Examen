package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.HomePageUI;

import java.awt.event.ActionListener;

public class AddElement {
    public static void as(WebDriver webDriver){
        Click.on(webDriver, HomePageUI.addRemove);
        Click.on(webDriver, AddRemove.add);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Add elements");
    }
}
