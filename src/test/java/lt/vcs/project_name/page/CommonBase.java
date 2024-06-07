package lt.vcs.project_name.page;

import lt.vcs.project_name.util.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommonBase {
    public static void setUpChrome() {
        Driver.setUpChrome();
    }

    public static void setUpChrome(int waitSeconds) {
        Driver.setUpChrome();
        Driver.getChromeDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(waitSeconds));
    }

    public static void openUrl(String url) {
        Driver.getChromeDriver().get(url);
    }

    public static void quitChromeDriver() {
        Driver.quitChromeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getChromeDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator) {
        return Driver.getChromeDriver().findElements(locator);
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static String getTextFromElement(By locator) {
        return getElement(locator).getText();
    }

    public static boolean waitElementVisible(By locator, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    private static Alert getAlert() {
        return Driver.getChromeDriver().switchTo().alert();
    }

    public static void acceptAlert() {
        getAlert().accept();
    }

    public static boolean waitAlertPresent(int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getChromeDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    public static void cancelAlert() {
        getAlert().dismiss();
    }

    public static void sendKeysToAlert(String input) {
        getAlert().sendKeys(input);
    }
}
