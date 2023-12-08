package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxes;
import ui.FormAuthentication;
import ui.HomePageUI;

public class Checkboxes {
    public static void as(WebDriver webDriver){
        Click.on(webDriver, HomePageUI.checkBoxes);
        Click.on(webDriver, CheckBoxes.checkbox1);

        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Checkboxes");
    }

}
