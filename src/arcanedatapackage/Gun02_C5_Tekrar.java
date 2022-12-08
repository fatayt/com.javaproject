package arcanedatapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C5_Tekrar {
    /*
        Create a new class : Review1
        ChromeDriver kullanarak, youtube git ve page basliginin  “youtube” oldugunu verify et, eger degilse dogrusunu yazdir.
        the page URL'in youtube  icerip icermedigini verify et, ve dogru url'i yazdir.
        Sonra https://www.amazon.com/ git
        youtube geri navigate et
        page'i Refresh et
        amazon'a tekrar navigate et
        Maximize the window
        page basliginin “Amazon” icerdigini dogrula, eger degilse dogru basligi yazdir
        page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
        Quit the browser
 */

    public static void main(String[] args) {
//Path i set et
        System.setProperty("webdriver.crome.driver", "C:/Users/deneme/Documents/selenium dependencies/drivers/chromedriver.exe");
        //chrome driver objesi olustur
        WebDriver driver = new ChromeDriver();
        //youtube anasayfasina git
        driver.get("https://www.youtube.com");
        //page basliginin  “youtube” oldugunu verify et, eger degilse dogrusunu yazdir.
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
            System.out.println("Beklenen:" + expectedTitle);
            System.out.println("Gercekte:" + actualTitle);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Home")) {
                System.out.println("Pass");

            } else {
                System.out.println("Fail");
            }
        }
        //Sonra https://www.amazon.com/ git
        driver.get("https://www.amazon.com/");

        //youtube geri navigate et
        driver.navigate().back();
        //page'i Refresh et
        driver.navigate().refresh();
        //amazon'a tekrar navigate et
        driver.navigate().forward();
        //Maximize the window
        driver.manage().window().maximize();

        // page basliginin “Amazon” icerdigini dogrula, eger degilse dogru basligi yazdir

        String expectedBaslik = "Amazon";
        String actualBaslik = driver.getTitle();

        if (expectedTitle.contains(actualBaslik)) {
            System.out.println("Basarili");
        } else {
            System.out.println("Basarisiz");
            System.out.println("Gercekte:" + actualBaslik);
            System.out.println("Beklenen:" + expectedBaslik);


        }
        //page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test Basarili");
        } else {
            System.out.println("Test Basarisiz");
            System.out.println("Actual Url: " + actualUrl);
            System.out.println("Expected Url: " + expectedUrl);
        }
        //Quit the browser
        driver.quit();

    }
}