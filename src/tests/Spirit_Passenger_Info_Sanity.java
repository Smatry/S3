package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spirit_Passenger_Info_Sanity extends AbstractPassengerInfoBaseTest  {


    @Test
    public void Reset_Password_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/book/passenger";
        String expectedTitle = "Retrieve Password | Spirit Airlines";
        PassengerPage.ResetPasswordUrl();
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
        PassengerPage.LearnMorePoUP();
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

        List<WebElement> Title = PassengerPage.TitleDropDown();
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

        List<WebElement> Suffix = PassengerPage.SuffixDropDown();
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

        List<WebElement> State = PassengerPage.StateDropDown();
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

        List<WebElement> Country = PassengerPage.CountryDropDown();
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

        List<WebElement> PhoneNumber = PassengerPage.PhoneNumberDropDown();
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

    @Test
    public void Adding_Info_LandsOn_Bundles () throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);

        String expectedURL = "https://qa01.nk.spirit.com/book/bundles";
        String expectedTitle = "Upgrade & Save | Spirit Airlines";
        PassengerPage.Title("Mr");
        Thread.sleep(2000);
        PassengerPage.FirstName("Bob");
        Thread.sleep(2000);
        PassengerPage.MiddleName("lucky");
        Thread.sleep(2000);
        PassengerPage.LastName("McLaud");
        Thread.sleep(2000);
        PassengerPage.DOB(("07/07/2007"));
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("scroll(0,900)");

        Thread.sleep(2000);
        PassengerPage.ConFirstName("Bob");
        Thread.sleep(2000);
        PassengerPage.ConLastName("McLaud");
        Thread.sleep(2000);
        driver.findElement(By.id("provinceState")).sendKeys("Florida");
        Thread.sleep(2000);
        driver.findElement(By.id("contactEmailPrimary")).sendKeys("BobMcLaud@spirit.com");
        Thread.sleep(2000);
        driver.findElement(By.id("contactEmailConfirm")).sendKeys("BobMcLaud@spirit.com");
        Thread.sleep(2000);
        driver.findElement(By.id("phoneNumber")).sendKeys("00000000007");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@data-qa='passenger-page-continue']")).click();
        Thread.sleep(5000);

        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }


}





















