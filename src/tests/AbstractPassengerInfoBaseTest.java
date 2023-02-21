package tests;

import Libraries.AppLib;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Spirit_Passenger_Info_Page;

public class AbstractPassengerInfoBaseTest {

    WebDriver driver;

    private AppLib app;


    @BeforeMethod
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

        driver.findElement(By.xpath("//i[@class='far fa-chevron-down ng-star-inserted']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@data-qa='one-way']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@class='toStation ng-tns-c165-3']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[@class='station-picker-dropdown__station-name ng-star-inserted']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg search-button ng-tns-c165-3 ng-star-inserted']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//app-availability-fare-picker//div//app-availability-journey//div[@class='p-grid__standard-price']")).click();
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,600)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//section//div//button[@data-qa='pricing-breakdown-standard-cta']")).click();
        Thread.sleep(8000);

        app = new AppLib(driver);


    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

    public AppLib App() {
        return app;
    }

}
