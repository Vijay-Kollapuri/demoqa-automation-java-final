package com.demoqa.pages;

import org.openqa.selenium.*;
import java.util.List;

public class WebTablesPage {
    private WebDriver driver;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://demoqa.com/webtables");
    }

    public void addRow(String firstName, String lastName, String email, String age, String salary, String department) {
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.id("salary")).sendKeys(salary);
        driver.findElement(By.id("department")).sendKeys(department);
        driver.findElement(By.id("submit")).click();
    }

    public void search(String keyword) {
        WebElement searchBox = driver.findElement(By.id("searchBox"));
        searchBox.clear();
        searchBox.sendKeys(keyword);
    }

    public void deleteRowByEmail(String email) {
        List<WebElement> rows = driver.findElements(By.cssSelector(".rt-tr-group"));
        for (WebElement row : rows) {
            if (row.getText().contains(email)) {
                WebElement deleteBtn = row.findElement(By.cssSelector("span[title='Delete']"));

                // ✅ Scroll into view
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);

                // ✅ JS click to bypass ads overlay
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleteBtn);
                break;
            }
        }
    }
}
