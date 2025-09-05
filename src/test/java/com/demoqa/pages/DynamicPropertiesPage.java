package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPropertiesPage {
    private WebDriver driver;
    private By enableAfterBtn = By.id("enableAfter");
    private By colorChangeBtn = By.id("colorChange");
    private By visibleAfterBtn = By.id("visibleAfter");

    public DynamicPropertiesPage(WebDriver driver) { this.driver = driver; }
    public void open() { driver.get("https://demoqa.com/dynamic-properties"); }
    public boolean isEnableAfterEnabled() { return driver.findElement(enableAfterBtn).isEnabled(); }
    public boolean isVisibleAfterDisplayed() { return driver.findElement(visibleAfterBtn).isDisplayed(); }
    public String getColorChangeClass() { return driver.findElement(colorChangeBtn).getAttribute("class"); }
}