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
        App().Pages().SpiritPassengerInfoPage().ResetPasswordUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
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
        App().Pages().SpiritPassengerInfoPage().LearnMorePoUP();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Acceptable_Form_ofID_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.tsa.gov/travel/security-screening/identification";
        String expectedTitle = "Identification | Transportation Security Administration";
        App().Flow().navigateToUrl("https://www.tsa.gov/travel/security-screening/identification");
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
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
        String expectedTitle = "REAL ID | Homeland Security";
        App().Flow().navigateToUrl("https://www.dhs.gov/real-id");
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
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
        App().Flow().navigateToUrl("https://www.tsa.gov/");
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
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
        App().Flow().navigateToUrl("https://cms10dss.spirit.com/Shared/en-us/Documents/General_Terms_and_Conditions.pdf");
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
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
        App().Flow().navigateToUrl("https://cms10dss.spirit.com/Shared/en-us/Documents/Privacy_Policy.pdf");
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Title_DD() {

        SoftAssert sa = new SoftAssert();

        List<WebElement> Title = App().Pages().SpiritPassengerInfoPage().TitleDropDown();
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

        List<WebElement> Suffix = App().Pages().SpiritPassengerInfoPage().SuffixDropDown();
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

        List<WebElement> State = App().Pages().SpiritPassengerInfoPage().StateDropDown();
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

        List<WebElement> Country = App().Pages().SpiritPassengerInfoPage().CountryDropDown();
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

        List<WebElement> PhoneNumber = App().Pages().SpiritPassengerInfoPage().PhoneNumberDropDown();
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
        App().Pages().SpiritPassengerInfoPage().Title("Mr");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().FirstName("Bob");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().MiddleName("lucky");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().LastName("McLaud");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().DOB(("07/07/2007"));
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().ConFirstName("Bob");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().ConLastName("McLaud");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().State("Florida");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().Email("BobMcLaud@spirit.com");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().ConEmail("BobMcLaud@spirit.com");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().PhoneNumber("00000000007");
        Thread.sleep(1000);
        App().Pages().SpiritPassengerInfoPage().Continue();
        Thread.sleep(5000);

        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void OW_Booking () throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);

        String expectedURL = "https://qa01.nk.spirit.com/book/confirmation";
        String expectedTitle = "You’re Booked | Spirit Airlines";
        App().Pages().SpiritPassengerInfoPage().Title("Mr");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().FirstName("Bob");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().MiddleName("lucky");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().LastName("McLaud");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().DOB(("07/07/2007"));
        Thread.sleep(2000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().ConFirstName("Bob");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().ConLastName("McLaud");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().State("Florida");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().Email("BobMcLaud@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().ConEmail("BobMcLaud@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().PhoneNumber("00000000007");
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().Continue();
        Thread.sleep(4000);
        //Bundle Page
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        Thread.sleep(3000);
        App().Pages().SpiritPassengerInfoPage().BundleStandardSelected();
        Thread.sleep(4000);
        //Bags Page
        ((JavascriptExecutor)driver).executeScript("scroll(0,500)");
        Thread.sleep(4000);
        App().Pages().SpiritPassengerInfoPage().AddingCarryOnBag();
        Thread.sleep(2000);
        App().Pages().SpiritPassengerInfoPage().ContinueWithStandard();
        Thread.sleep(4000);
        //Seat Page
        Thread.sleep(3000);
        App().Pages().SpiritPassengerInfoPage().ContinueSelected();
        Thread.sleep(3000);
        //Option Page
        Thread.sleep(5000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(5000);
        App().Pages().SpiritPassengerInfoPage().ContinueOptionStandard();
        Thread.sleep(5000);
        App().Pages().SpiritPassengerInfoPage().ContinueWithoutFlightFlex();
        Thread.sleep(5000);
        //Payment page
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
        Thread.sleep(3000);
        App().Pages().SpiritPassengerInfoPage().AccountHolderName("Bob McLoud");
        Thread.sleep(3000);
        App().Pages().SpiritPassengerInfoPage().CreditCardNumber("373235387881007");
        Thread.sleep(3000);
        App().Pages().SpiritPassengerInfoPage().CreditCardExpirationDate ("07/27");
        Thread.sleep(3000);
        App().Pages().SpiritPassengerInfoPage().CreditCardSecurityCode("2222");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
        Thread.sleep(3000);
        driver.findElement(By.id("billingAddress")).sendKeys("Ocean Drive");
        Thread.sleep(3000);
        driver.findElement((By.id("billingCity"))).sendKeys("Hollywood");
        Thread.sleep(3000);
        driver.findElement(By.id("billingState")).sendKeys("Florida");
        Thread.sleep(3000);
        driver.findElement(By.id("billingZipPostal")).sendKeys("33333");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[@for='termsCheck']")).click();
        Thread.sleep(4000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2500)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div//button[@name='paymentSubmit']")).click();
        Thread.sleep(8000);

        String newUrl = driver.getCurrentUrl();
        String newTitle = driver.getTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }



}





















