package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By addRemove = By.xpath("//*[@id=\"content\"]/ul/li[2]/a");
    public static By checkBoxes = By.xpath("//*[@id=\"content\"]/ul/li[6]/a");
    public static By horizontalSlide= By.xpath("//*[@id=\"content\"]/ul/li[24]/a");
    public static By formAuthentication = By.xpath("//*[@id=\"content\"]/ul/li[21]/a");

    public static By hover = By.xpath("//*[@id=\"content\"]/ul/li[25]/a");

    public static By menu = By.xpath("//*[@id=\"content\"]/ul/li[28]/a");



    public static By login = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a");
    public static By signup = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a");
}
