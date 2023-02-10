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
        Thread.sleep(2000);

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
        String expectedTitle = "Spirit Airlines - Dashboard";
        driver.findElement(By.id("dashboard")).click();
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Status () throws Exception   {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/status";
        String expectedTitle = "Spirit Airlines - Status";
        driver.findElement(By.id("status")).click();
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Offers () throws Exception   {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/offers";
        String expectedTitle = "Spirit Airlines - Offers";
        driver.findElement(By.id("offers")).click();
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Saver$_Club () throws Exception   {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/savings-club";
        String expectedTitle = "Spirit Airlines - Savers Club";
        driver.findElement(By.id("savings-club")).click();
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }



}
