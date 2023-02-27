package tests;

import Libraries.AppLib;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Spirit_Home_Page;
import pages.Spirit_My_Trips_Page;

public class AbstractHomeBaseTest {

    WebDriver driver;
    private AppLib app;


    @BeforeMethod (alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\96910\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa01.nk.spirit.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button//span[@aria-hidden='true']")).click();
        Thread.sleep(2000);

        app = new AppLib(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.close();

    }

    public AppLib App() {
        return app;

    }

}
