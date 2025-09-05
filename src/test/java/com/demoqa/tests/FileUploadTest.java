package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.UploadDownloadPage;
import com.demoqa.utils.Config;
import com.demoqa.utils.ScreenshotUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void testUploadFile() {
        UploadDownloadPage page = new UploadDownloadPage(driver);
        page.open();
        page.uploadFile(Config.SAMPLE_UPLOAD_FILE);
        String uploaded = page.getUploadedFileText();
        ScreenshotUtil.takeScreenshot(driver, "upload_result");
        Assert.assertTrue(uploaded.contains("sample_upload.txt"));
    }
}