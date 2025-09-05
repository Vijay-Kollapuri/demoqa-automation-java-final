package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {
    private WebDriver driver;
    private By expandAllButton = By.cssSelector("button[title='Expand all']");
    private By homeCheckbox = By.cssSelector("label[for='tree-node-home'] span.rct-checkbox");
    private By result = By.id("result");

    public CheckboxPage(WebDriver driver) { this.driver = driver; }

    public void open() { driver.get("https://demoqa.com/checkbox"); }
    public void expandAll() { driver.findElement(expandAllButton).click(); }
    public void clickHomeCheckbox() { driver.findElement(homeCheckbox).click(); }
    public String getResultText() { return driver.findElement(result).getText(); }
}