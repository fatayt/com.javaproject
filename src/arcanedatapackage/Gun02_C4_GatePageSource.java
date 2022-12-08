package arcanedatapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C4_GatePageSource {
    public static void main(String[] args) {
        //Path i set et
        System.setProperty("webdriver.crome.driver", "C:/Users/deneme/Documents/selenium dependencies/drivers/chromedriver.exe");
        //chrome driver objesi olustur
        WebDriver driver = new ChromeDriver();
        //sayfayi maximize et
        driver.manage().window().maximize();
        //google anasayfasina git
        driver.get("https://www.google.com");
        // amazon sayfasina git
        driver.navigate().to("https://www.amazon.com");
        // getPageSource() page source u string olarak dondurur
        // Tum sayfanin icinde istedigimiz bir text(metin) kullanip kullanmadigimizi verify edebiliriz
        // Note: paheSource icin assertion pek kullanilmaz cunku burada cok genel bilgi vardir ve bize false sonuc verebilir
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        // System.out.println(pageSource.contains("Electronics"));
        if (pageSource.contains("Gaming accessories")) {
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisiz");
        }
        driver.close();
    }

}
