package arcanedatapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C2_BasicNavigations {
    /*
    Main method olustur
    Path'i set et
    Chrome driver olustur
    Window'u Maximize et
    Google anasayfasina git https://www.google.com/.
    Ayni class'in icinde, amazon anasayfasini (home page) Navigate et https://www.amazon.com/
    Google'e tekrar/geri Navigate et
    Amazon'a tekrar/geri Navigate et
    Sayfayi Refresh (yenile) et
    Browser'dan Close/Quit yap
 */
    public static void main(String[] args) {
      // Path'i set et
        System.setProperty("webdriver.chrome.driver", "C:/Users/deneme/Documents/selenium dependencies/drivers/chromedriver.exe");
//        Chrome driver olustur
        WebDriver driver = new ChromeDriver();
//        Window'u Maximize et
        driver.manage().window().maximize();
//        Google anasayfasina git https://www.google.com/
        driver.get("https://www.google.com/");
//        Ayni class'in icinde, amazon anasayfasini (home page) Navigate et https://www.amazon.com/
//        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/");
//        Google'e tekrar/geri Navigate et
        driver.navigate().back();
//        Amazon'a tekrar/geri Navigate et
        driver.navigate().forward();
//        Sayfayi Refresh (yenile) et
        driver.navigate().refresh();
//        Browser'dan Close/Quit yap
        // close sadece acik olan browseri kapatir
        driver.quit();
        //2.quit tum browserlari kapatir
        driver.close();


    }
}
