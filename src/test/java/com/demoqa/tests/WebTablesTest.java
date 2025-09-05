package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.WebTablesPage;
import com.demoqa.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @Test
    public void testAddAndDeleteRow() {
        WebTablesPage page = new WebTablesPage(driver);
        page.open();

        String email = "vijay@example.com";

        // Add a new row
        page.addRow("Vijay", "Kollapuri", email, "30", "50000", "QA");

        // Verify the row exists by searching
        page.search(email);
        ScreenshotUtil.takeScreenshot(driver, "webtables_after_add");

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains(email), "Newly added row should be visible in table");

        // Delete the row
        page.deleteRowByEmail(email);
        ScreenshotUtil.takeScreenshot(driver, "webtables_after_delete");

        page.search(email);
        String afterDeleteSource = driver.getPageSource();
        Assert.assertFalse(afterDeleteSource.contains(email), "Row should be deleted");
    }
}
