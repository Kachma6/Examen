package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {
    // Crear acciones que se pueden reutilizar
    public static void on(WebDriver webDriver, By locator){
        webDriver.findElement(locator).click();
    }


}

