package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Groupodev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com");

        //Sign in butonuna basın
        driver.findElement(By.id("sign-in")).click();

        WebElement emailTextbox = driver.findElement(By.id("session_email"));
        WebElement passwordTextbox = driver.findElement(By.id("session_password"));
        WebElement signIn = driver.findElement(By.name("commit"));

        emailTextbox.sendKeys("testtechproed@gmail.com");
        passwordTextbox.sendKeys(("Test1234!")+ Keys.ENTER);

        //driver.findElement(By.name("commit")).click(); entera 3side geçerli
        //signIn.click(); 3side aynı bunların

        // expected user id nin testtechproed.gmail.com oldugunu dogrulayın

        /*
        String expectedid="testtechproed@gmail.com";
        WebElement actualid=driver.findElement(By.className("navbar-text"));

        if(actualid.equals(expectedid)) {
            System.out.println("Test PASSED");
        }
        else{
            System.out.println("Test FAILED");



            İsdisplayın uzun yolu
         */

        WebElement ExpectedUserId = driver.findElement(By.className("navbar-text"));
        if(ExpectedUserId.isDisplayed()){
            System.out.println("Expected user test PASSED");
        }else {
            System.out.println("Expected user test FAILED");
        }

        WebElement adres = driver.findElement(By.linkText("Addresses"));
        if (adres.isDisplayed()){
            System.out.println("Adress test Passesd");
        }else {
            System.out.println("Adress test FAILED");
        }

        WebElement signOut =driver.findElement(By.linkText("Sign-out"));
        if (signOut.isDisplayed()){
            System.out.println("Sign-out test PASSED");

        }else {
            System.out.println("Sign-out test FAILED");
        }
        //sayfadan kaç tane link oldugunu bulun.
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("Sitede" + tag.size() + "adet link bulunmaktadir");


        //sayfayi kapatin
        driver.close();
    }
}
