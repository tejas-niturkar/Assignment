package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

    public static WebDriver driver ;



    public static void initialization() {

        System.setProperty("webdriver.chrome.driver", "/home/diamanti/Documents/automation/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.tendable.com/why-tendable");
        driver.manage().window().fullscreen();
    }
}
