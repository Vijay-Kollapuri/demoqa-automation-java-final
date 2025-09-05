package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.WebTablesPage;
import com.demoqa.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {
    @Test
    public void testAddAndDeleteRow() throws InterruptedException {
        WebTablesPage page = new WebTablesPage(driver);
        page.open();
        int before = page.getRowCount();
        page.addRow("Vijay", "Kollapuri", "vijay@example.com", "30", "50000", "QA");
        Thread.sleep(1000);
        int after = page.getRowCount();
        ScreenshotUtil.takeScreenshot(driver, "webtables_after_add");
        Assert.assertTrue(after > before, "Row count should increase after adding");
        page.deleteRowByEmail("vijay@example.com");
        Thread.sleep(1000);
        ScreenshotUtil.takeScreenshot(driver, "webtables_after_delete");
    }
}