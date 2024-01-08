package da01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

   //sdfs

    }
}
