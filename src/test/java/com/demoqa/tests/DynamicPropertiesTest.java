package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.DynamicPropertiesPage;
import com.demoqa.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest {
    @Test
    public void testDynamicButtons() throws InterruptedException {
        DynamicPropertiesPage page = new DynamicPropertiesPage(driver);
        page.open();
        Thread.sleep(6000);
        Assert.assertTrue(page.isEnableAfterEnabled(), "Enable after button should be enabled after wait");
        Assert.assertTrue(page.isVisibleAfterDisplayed(), "Visible after button should be displayed after wait");
        String cls = page.getColorChangeClass();
        ScreenshotUtil.takeScreenshot(driver, "dynamic_props");
        Assert.assertNotNull(cls);
    }
}