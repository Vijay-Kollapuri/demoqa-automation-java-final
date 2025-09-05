package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage {
    private WebDriver driver;
    private By datePickerInput = By.id("datePickerMonthYearInput");

    public DatePickerPage(WebDriver driver) { this.driver = driver; }
    public void open() { driver.get("https://demoqa.com/date-picker"); }
    public void setDate(String dateText) {
        WebElement el = driver.findElement(datePickerInput);
        el.clear();
        el.sendKeys(dateText);
        el.sendKeys(Keys.ENTER);
    }
    public String getDateValue() { return driver.findElement(datePickerInput).getAttribute("value"); }
}