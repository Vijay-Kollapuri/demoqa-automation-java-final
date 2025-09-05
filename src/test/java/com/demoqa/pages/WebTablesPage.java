package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WebTablesPage {
    private WebDriver driver;
    private By addButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submit = By.id("submit");
    private By rows = By.cssSelector("div.rt-tr-group");
    private By searchBox = By.id("searchBox");

    public WebTablesPage(WebDriver driver) { this.driver = driver; }

    public void open() { driver.get("https://demoqa.com/webtables"); }
    public void addRow(String fName, String lName, String mail, String a, String sal, String dept) {
        driver.findElement(addButton).click();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(age).sendKeys(a);
        driver.findElement(salary).sendKeys(sal);
        driver.findElement(department).sendKeys(dept);
        driver.findElement(submit).click();
    }
    public int getRowCount() { return driver.findElements(rows).size(); }
    public void search(String text) { driver.findElement(searchBox).clear(); driver.findElement(searchBox).sendKeys(text); }
    public void deleteRowByEmail(String emailText) {
        search(emailText);
        List<WebElement> del = driver.findElements(By.cssSelector("span[title='Delete']"));
        if (!del.isEmpty()) del.get(0).click();
    }
}