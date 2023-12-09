package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.Proyect;

public class IsCreatedTodo {
    public static boolean visibleTarea(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, Proyect.itemTodo);

    }
}
