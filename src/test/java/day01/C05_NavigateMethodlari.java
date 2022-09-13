package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to( "https://amazon.com");
        //driver.navigate().to( "http://") methodu sayfada ileri geri yapıcaksak kullanılır
        //driver.get(). methodu gibi bizi istediginiz urle götürür

        driver.navigate().to( "http://techproeducation.com");
        //tekrar amazon sayfasına dönelim

        Thread.sleep(2000);
        driver.navigate().back(); //Bir önceki sayfayı getirir
        // tekrar techpro sayfasına gidelim

        Thread.sleep(2000);
        driver.navigate().forward(); //ilk sayfadan ileriye gider
        //techpro sayfasını yeniyelim

        Thread.sleep(2000);
        driver.navigate().refresh(); // Son sayfayı günceller
        //Son olarak sayfayı kapatın
        driver.close();

        /* Class Work
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
                Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.

        Soru2
        Yeni bir Class olusturalim.C05_NavigationMethods
Youtube ana sayfasina gidelim . https://www.youtube.com/
Amazon soyfasina gidelim. https://www.amazon.com/
Tekrar YouTube’sayfasina donelim
Yeniden Amazon sayfasina gidelim
Sayfayi Refresh(yenile) yapalim
Sayfayi kapatalim / Tum sayfalari kapatalim

         */
    }

}
