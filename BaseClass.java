package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class BaseClass {

    protected WebDriver d;

    public void setUp() {
        // Automatically setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();

        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void tearDown() {
        if (d != null) {
            d.quit();
        }
    }
}
