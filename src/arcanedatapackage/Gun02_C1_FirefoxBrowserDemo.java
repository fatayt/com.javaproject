package arcanedatapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Gun02_C1_FirefoxBrowserDemo {
    /*
    https://www.mozilla.org/en-US/firefox/new/
    https://github.com/mozilla/geckodriver/releases
    Yeni sinif olustur : FirefoxBrowserDemo
    Main method olustur
    Set Path
    Gecko driver olustur
    Ac : google home page https://www.google.com/
    Maximize the window
    Close/Quit the browser
     */
    public static void main(String[] args) {
        //Path i set et
        System.setProperty("webdriver.gecko.driver", "C:/Users/deneme/Documents/selenium dependencies/drivers/geckodriver.exe");

        //obje olustur
        WebDriver driver = new FirefoxDriver();

        //Maximize the windows
        driver.manage().window().maximize();

        //Ac : google home page
        driver.get("https://www.google.com/");

        //Close/Quit the browser
        driver.close();

        /*
            get() and navigate().to()
         1) get() daha yaygin kullanilir
         2) get() daha hizli calisir
         3) get () YALNIZCA parametre olarak String alir. fakat navigate().to() hem String hem de URL'i parametre olarak alabilir
         4) navigate()  daha fazla method ortaya cikar (forward, to, back, refresh())

         close() ile quit() arasindaki fark
        1)	closeO yanlizca calistiqiniz browser! kapatir
        2)	quit () calisilan turn browserlari kapatir. Quit sağlam kapatir

        -----------------------------------------
        jaya'ya bekleme (Wait) ekleme
        1- Thread.sleep(500O)-> bir sonraki adima gecmeden 5 sn bekle
        2- Bu bekleme JAVA`nin kendisine aittir. Selenium a ait degildir
            bu nedenle Thread.sleep() kullanimi tavsiye edilmez (Hard wait denir)
          Not: daha sonra biz "selenium wait" kullanacagiz. bu dinamik bir beklemedir.
          bu selenium bekle daha hizlidir extra bir zaman beklemez

        */


    }
}
