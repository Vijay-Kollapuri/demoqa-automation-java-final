package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.CheckboxPage;
import com.demoqa.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckHomeCheckbox() {
        CheckboxPage page = new CheckboxPage(driver);
        page.open();
        page.expandAll();
        page.clickHomeCheckbox();
        String res = page.getResultText();
        ScreenshotUtil.takeScreenshot(driver, "checkbox_result");
        Assert.assertTrue(res.toLowerCase().contains("home"), "Result should contain 'home'");
    }
}