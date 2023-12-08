package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxes;

public class IsCheckboxChecked {
    public static boolean checked(WebDriver webDriver){
        return WaitUntilElement.isChecked(webDriver,CheckBoxes.checkbox1);
    }
    public static boolean checkedDefault(WebDriver webDriver){
        return WaitUntilElement.isChecked(webDriver,CheckBoxes.checkbox2);
    }
}
