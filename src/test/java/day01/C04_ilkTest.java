package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ilkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");


        String actualLife = driver.getTitle();
        String istenenkelime= "Amazon";
        if (actualLife.contains(istenenkelime)){
            System.out.println("Title testi PASSED");

        }else System.out.println("Title testi FAILED");

        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";

        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");

        }else System.out.println("Url testi FAILED");
        driver.close();

    }
}