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

        // Target date to set
        String inputDate = "08/25/1990";
        page.setDate(inputDate);

        // Take screenshot after setting date
        ScreenshotUtil.takeScreenshot(driver, "date_picker");

        // Get the actual value from the input field
        String actualDate = page.getDateValue();
        System.out.println("Date value: " + actualDate);

        // Accept both yyyy and yy formats (DemoQA sometimes shortens the year)
        Assert.assertTrue(
                actualDate.equals("08/25/1990") || actualDate.equals("08/25/90"),
                "Date input should contain the expected year format (1990 or 90)"
        );
    }
}
