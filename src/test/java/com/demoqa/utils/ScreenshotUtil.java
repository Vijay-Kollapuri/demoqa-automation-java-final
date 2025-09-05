package com.demoqa.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {
    public static String takeScreenshot(WebDriver driver, String name) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String ts = LocalDateTime.now().format(fmt);
        String fileName = System.getProperty("user.dir") + "/target/screenshots/" + name + "_" + ts + ".png";
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(fileName);
        try { FileUtils.copyFile(src, dest); } catch (IOException e) { e.printStackTrace(); }
        return fileName;
    }
}