package lt.vcs.project_name.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> chromeDriver = new ThreadLocal<>();

    public static void setUpChrome() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.75");

        chromeDriver.set(new ChromeDriver(options));
    }

    public static WebDriver getChromeDriver() {
        return chromeDriver.get();
    }

    public static void quitChromeDriver() {
        chromeDriver.get().quit();
        chromeDriver.remove();
    }
}
