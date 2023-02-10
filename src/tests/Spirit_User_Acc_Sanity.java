package tests;

import Libraries.AppLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Spirit_User_Acc_Sanity {

    WebDriver driver;

       @BeforeMethod
        public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\96910\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa01.nk.spirit.com/my-trips/find-trip");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@data-qa='find-trip-page-username']")).sendKeys("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//input[@data-qa='find-trip-page-password']")).sendKeys("Brandy12$");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-responsive']")).click();

    }

    @AfterMethod
    public void tearDown(){
        driver.close();

    }

      @Test
      public void logged_In () throws Exception   {

      SoftAssert sa = new SoftAssert();
      String expectedURL = "https://qa01.nk.spirit.com/account/activity";
      String expectedTitle = "Manage Travel - Find Trip | Spirit Airlines";
      String newUrl = driver.getCurrentUrl();
      String newTitle = driver.getTitle();
      System.out.println(newUrl);
      System.out.println(newTitle);
      Thread.sleep(5000);

      sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
      sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Dashboard () throws Exception   {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/dashboard";
        String expectedTitle = "Spirit Airlines - Activity";
        driver.findElement(By.xpath("//ul//li//a[@class='no-decoration active black-font']")).click();
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

}
