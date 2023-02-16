package tests;

import elements.Spirit_Passenger_Info_Elements;
import graphql.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spirit_Passenger_Info_Sanity {

    WebDriver driver;
    Spirit_Passenger_Info_Elements PassSearchElement;

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

        PassSearchElement = new Spirit_Passenger_Info_Elements(driver);

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
        PassSearchElement.ResPas.click();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Learn_More_PoUp() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.tsa.gov/travel/security-screening/identification";
        PassSearchElement.LearMorePop.click();
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Acceptable_Form_ofID_Url() throws Exception {

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

    @Test
    public void DHS_REL_ID_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.dhs.gov/real-id";
        String expectedTitle = "Identification | Transportation Security Administration";
        driver.navigate().to("https://www.dhs.gov/real-id");
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void tsa_gov_link() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.dhs.gov/real-id";
        String expectedTitle = "Transportation Security Administration | Transportation Security Administration";
        driver.navigate().to("https://www.tsa.gov/");
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Terms_and_Conditions() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
        Thread.sleep(3000);
        String expectedURL = "https://cms10dss.spirit.com/Shared/en-us/Documents/General_Terms_and_Conditions.pdf";
        driver.navigate().to("https://cms10dss.spirit.com/Shared/en-us/Documents/General_Terms_and_Conditions.pdf");
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Privacy_Policy() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
        Thread.sleep(3000);
        String expectedURL = "https://cms10dss.spirit.com/Shared/en-us/Documents/Privacy_Policy.pdf";
        driver.navigate().to("https://cms10dss.spirit.com/Shared/en-us/Documents/Privacy_Policy.pdf");
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Title_DD() {

        SoftAssert sa = new SoftAssert();

        List<WebElement> Title = PassSearchElement.TitleDd;
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : Title) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }

    @Test
    public void Suffix_DD() {

        SoftAssert sa = new SoftAssert();

        List<WebElement> Suffix = PassSearchElement.SuffixDd;
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : Suffix) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }

    @Test
    public void State_DD() {

        SoftAssert sa = new SoftAssert();

        List<WebElement> State = PassSearchElement.StateDd;
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : State) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }
    @Test
    public void Country_DD() {

        SoftAssert sa = new SoftAssert();

        List<WebElement> Country = PassSearchElement.CountryDd;
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : Country) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }

    @Test
    public void Phone_Number_Country_Code_DD () {

        SoftAssert sa = new SoftAssert();

        List<WebElement> PhoneNumber = PassSearchElement.PhoneNumberDd;
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : PhoneNumber) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }

}