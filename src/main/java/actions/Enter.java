package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Enter {
    public static void text(WebDriver webDriver, By locator, String text){
        webDriver.findElement(locator).sendKeys(text);
    }
    public static void slide(WebDriver webDriver,By locator,int value){
        WebElement slider = webDriver.findElement(locator);
        Actions actions = new Actions(webDriver);

        actions.clickAndHold(slider).moveByOffset(-64,0).release().build().perform();

    }
}
