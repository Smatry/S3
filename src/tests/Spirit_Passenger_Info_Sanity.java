package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Spirit_Passenger_Info_Sanity {

    WebDriver driver;

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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@data-qa='one-way']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='toStation ng-tns-c165-3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@class='station-picker-dropdown__station-name ng-star-inserted']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg search-button ng-tns-c165-3 ng-star-inserted']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div//p[@class='p-grid__pricing-value ng-star-inserted']")).click();
        Thread.sleep(4000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,600)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//section//div//button[@data-qa='pricing-breakdown-standard-cta']")).click();
        Thread.sleep(8000);


    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

    @Test
    public void Reset_Password_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/book/passenger";
        String expectedTitle = "Retrieve Password | Spirit Airlines";
        driver.findElement(By.xpath("//button[@class='d-block ml-auto btn btn-link btn-sm pt-0 ng-star-inserted']")).click();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
     @Test
     public void Learn_More_PoUp () throws Exception  {

         SoftAssert sa = new SoftAssert();
         Thread.sleep(2000);
         String expectedURL = "https://www.tsa.gov/travel/security-screening/identification";
         driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
         Thread.sleep(5000);
         String newUrl = driver.getCurrentUrl();
         System.out.println(newUrl);

         sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

     }
     @Test
     public void Acceptable_Form_ofID_Url () throws  Exception {

         SoftAssert sa = new SoftAssert();
         Thread.sleep(2000);
         String expectedURL = "https://www.tsa.gov/travel/security-screening/identification";
         String expectedTitle = "Identification | Transportation Security Administration";
         driver.navigate().to("https://www.tsa.gov/travel/security-screening/identification");
         Thread.sleep(5000);
         String newUrl = driver.getCurrentUrl();
         String newTitle = driver.getTitle();
         System.out.println(newUrl);
         System.out.println(newTitle);

         sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
         sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

     }


}



