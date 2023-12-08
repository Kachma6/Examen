package ui;

import org.openqa.selenium.By;

public class FormAuthentication {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginButton = By.xpath("//*[@id=\"login\"]/button");

    public static By titleSuccesfull = By.xpath("//*[@id=\"content\"]/div/h2");
    public static By messageAuth = By.xpath("//*[@id=\"flash\"]");

    public static By invalidUsername = By.xpath("//*[@id=\"flash\"]");

}
