package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.DatePickerPage;
import com.demoqa.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerTest extends BaseTest {
    @Test
    public void testSetDate() {
        DatePickerPage page = new DatePickerPage(driver);
        page.open();
        String date = "08/25/1990";
        page.setDate(date);
        ScreenshotUtil.takeScreenshot(driver, "date_picker");
        Assert.assertTrue(page.getDateValue().contains("1990"), "Date input should contain the year 1990");
    }
}