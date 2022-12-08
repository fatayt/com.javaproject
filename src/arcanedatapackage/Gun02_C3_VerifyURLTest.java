package arcanedatapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C3_VerifyURLTest {
/*
    Google anasayfaslna git
    Google anasayfasinda url'in "ww.google.com" olduğunu dogrula/verify et
    */

    public static void main(String[] args) {
        //Path i set et
        System.setProperty("webdriver.crome.driver", "C:/Users/deneme/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        String expectedUrl = "www.google.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("Basarili");
        }else{
            System.out.println("Basarisiz");
            System.out.println("actual:"+ actualUrl);
            System.out.println("Expect:"+ expectedUrl);
        }
    }

}
