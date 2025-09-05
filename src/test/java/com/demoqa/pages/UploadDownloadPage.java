package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadDownloadPage {
    private WebDriver driver;
    private By uploadInput = By.id("uploadFile");
    private By uploadedFilePath = By.id("uploadedFilePath");

    public UploadDownloadPage(WebDriver driver) { this.driver = driver; }
    public void open() { driver.get("https://demoqa.com/upload-download"); }
    public void uploadFile(String absolutePath) { driver.findElement(uploadInput).sendKeys(absolutePath); }
    public String getUploadedFileText() { return driver.findElement(uploadedFilePath).getText(); }
}