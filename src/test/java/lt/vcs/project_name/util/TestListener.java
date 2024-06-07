package lt.vcs.project_name.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }

    private void takeScreenshot() {
        TakesScreenshot screenshot = (TakesScreenshot) Driver.getChromeDriver();
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

        String directory = "./screenshots/";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_ss_SSS");

        File saveFile = new File("%s%s_screenshot.png".formatted(directory, LocalDateTime.now().format(formatter)));

        try {
            FileUtils.copyFile(screenshotFile, saveFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
