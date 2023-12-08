package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hover {
    public static void on(WebDriver webDriver, By locator){
        WebElement element = webDriver.findElement(locator);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element).perform();
    }
}
