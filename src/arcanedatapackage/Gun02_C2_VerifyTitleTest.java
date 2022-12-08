package arcanedatapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C2_VerifyTitleTest {

    public static void main(String[] args) {
       /* path'! set et
        Chrome driver'1 olustur/ac
        window*» maximize et
        https://www.qooqle.com/ apasayfasini ac
        Google basliginin "google" olduğunu doğrula

        */

        // Path'i set et
        System.setProperty("webdriver.chrome.driver", "C:/Users/deneme/Documents/selenium dependencies/drivers/chromedriver.exe");
//        Chrome driver olustur
        WebDriver driver = new ChromeDriver();
//        Window'u Maximize et
        driver.manage().window().maximize();

        //        Google anasayfasina git https://www.google.com/
        driver.get("https://www.google.com/");

        //        Google basliginin "google" olduğunu doğrula
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisiz");
            System.out.println("Beklenen:"+ expectedTitle);
            System.out.println("Gercekte:" + actualTitle);
        }
        driver.close();

        /*
        Eger yazdiginiz script ler basarisiz olursa

        1- Script`leri tekrar tekrar kosturuyoruz
        2- Manuel testing yapiyoruz
        3- Business Analist(BA) ve urunun sahibi belirler (Acceptance Criteria)
          Bir Tester olarak bizim gorevimiz dokumanlarda bulunan yanlislari duzeltmek degildir,
          Bizim misyonumuz  bug/hata bulacak script yazmaktir.
        */

    }
}
