package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spirit_Home_Sanity extends AbstractHomeBaseTest {


    @Test(groups = {"P1"})
    public void My_Trips_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/my-trips/find-trip";
        App().Pages().SpiritHomePage().MyTripUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P1"})
    public void Check_In_Url() throws Exception {


        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/home-check-in";
        App().Pages().SpiritHomePage().CheckInUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P1"})
    public void Flight_Status_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/flight-status";
        App().Pages().SpiritHomePage().FlightStatusUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P1"})
    public void Free_Spirit_Header_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";
        App().Pages().SpiritHomePage().FreeSpiritURL();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P1"})
    public void Deals_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.spirit.com/en/flights";
        App().Pages().SpiritHomePage().DealsUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P2"})
    public void Contact_Us_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://www.spirit.com/s/contact-us";
        App().Pages().SpiritHomePage().ContactUsUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P2"})
    public void Saver_Club_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        String expectedURL = "https://qa01.nk.spirit.com/savers-club";
        App().Pages().SpiritHomePage().SaverClubURL();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }


    @Test
    public void drop_Down_From() throws Exception {

        SoftAssert sa = new SoftAssert();
        App().Pages().SpiritHomePage().TripTypeSelect();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SelectedOneWay();
        Thread.sleep(2000);
        List<WebElement> From = App().Pages().SpiritHomePage().DropDownFromStations();
        Thread.sleep(2000);
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : From) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }

    @Test
    public void drop_Down_To() throws Exception {


        SoftAssert sa = new SoftAssert();
        App().Pages().SpiritHomePage().TripTypeSelect();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SelectedOneWay();
        Thread.sleep(2000);
        List<WebElement> To = App().Pages().SpiritHomePage().DropDownToStations();
        List<String> arr1 = new ArrayList<>();
        for (WebElement option : To) {
            arr1.add(option.getText());
        }
        List<String> arr2 = new ArrayList<String>(arr1);
        Collections.sort(arr2);
        System.out.println("Actual List:" + arr1);
        System.out.println("Sorted List:" + arr2);

        sa.assertTrue(arr1.equals(arr2));

    }

    @Test
    public void Spirit_JetBlue_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://lowfaresgreatservice.com/";
        App().Pages().SpiritHomePage().SpiritJetBlueUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");


    }

    @Test
    public void bank_of_america_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://secure.bankofamerica.com/apply-credit-cards/public/icai-single/#/info/";
        App().Pages().SpiritHomePage().BankOfAmericaUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        Thread.sleep(2000);
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Landing_OnTheBooking_FlightPage() throws Exception {

        SoftAssert sa = new SoftAssert();
        String expectedURL = "https://qa01.nk.spirit.com/book/flights";
        App().Pages().SpiritHomePage().TripTypeSelect();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SelectedOneWay();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().ToStationDropDownMenu();
        Thread.sleep(5000);
        App().Pages().SpiritHomePage().ToStationSelected();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SearchButton();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Booking_Flight_Confirm() throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/book/flights";
        App().Pages().SpiritHomePage().TripTypeSelect();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SelectedOneWay();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().ToStationDropDownMenu();
        Thread.sleep(5000);
        App().Pages().SpiritHomePage().ToStationSelected();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SearchButton();
        Thread.sleep(5000);
        App().Pages().SpiritHomePage().FlightConfirmed();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
    }

    @Test public void Create_An_Acc  () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritHomePage().SingInHeader();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().CreateAnAcc();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().FirsName("John");
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().LastName("Due");
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().DOB("01/01/2000");
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().Email("BikesmithFSbase@spirit.com ");
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().Password("Brandy12$");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@class='checkBox ng-untouched ng-dirty ng-valid']")).click();
        Thread.sleep(4000);
        App().Pages().SpiritHomePage().SingUp();
        Thread.sleep(2000);

    }

    @Test
    public void Landing_On_The_Passenger_Page() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().TripTypeSelect();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SelectedOneWay();
        Thread.sleep(3000);
        App().Pages().SpiritHomePage().ToStationDropDownMenu();
        Thread.sleep(5000);
        App().Pages().SpiritHomePage().ToStationSelected();
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().SearchButton();
        Thread.sleep(5000);
        App().Pages().SpiritHomePage().FlightConfirmed();
        Thread.sleep(3000);
        String expectedURL = "https://qa01.nk.spirit.com/book/passenger";
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
        Thread.sleep(2000);
        App().Pages().SpiritHomePage().WithStandardPricing();
        Thread.sleep(8000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void COVID_19_Url () throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/notices";
        String expectedTitle = "Important Travel Notices | Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/notices");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void OptionalService_Url () throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/optional-services";
        String expectedTitle = "Optional Services | Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/optional-services");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void About_Us_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/about-us";
        String expectedTitle = "About Spirit | Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/about-us");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Charity_Foundation_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://foundation.spirit.com/en-us/foundation";
        String expectedTitle = "Spirit Foundation - Home · Spirit Airlines Support";
        App().Flow().navigateToUrl("https://foundation.spirit.com/en-us/foundation");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Free_Spirit_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";
        String expectedTitle = "Spirit Foundation - Home · Spirit Airlines Support";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/free-spirit");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Spirit_Saver_Club_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/savers-club";
        String expectedTitle = "Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/savers-club");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Media_Centre_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/press-release";
        String expectedTitle = "Media Center | Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/press-release");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Investor_Relations_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "http://ir.spirit.com/";
        String expectedTitle = "Investor Relations - Spirit Airlines, Inc";
        App().Flow().navigateToUrl("http://ir.spirit.com/");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Careers_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://careers.spirit.com/careers-home";
        String expectedTitle = "Careers Home Apply";
        App().Flow().navigateToUrl("https://careers.spirit.com/careers-home");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void ESG_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://ir.spirit.com/ESG-brief/default.aspx";
        String expectedTitle = "Careers Home Apply";
        App().Flow().navigateToUrl("https://ir.spirit.com/ESG-brief/default.aspx");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Help_Centre_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://customersupport.spirit.com/en-US/";
        String expectedTitle = "Spirit Airlines Support · Spirit Airlines Support";
        App().Flow().navigateToUrl("https://customersupport.spirit.com/en-US/");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Contact_Us_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/s/contact-us";
        String expectedTitle = "Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/s/contact-us");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Legal_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://qa01.nk.spirit.com/legal";
        String expectedTitle = "Legal | Spirit Airlines";
        App().Flow().navigateToUrl("https://qa01.nk.spirit.com/legal");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Privacy_Policy_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://cms10dss.spirit.com/Shared/en-us/Documents/Privacy_Policy.pdf";
        App().Flow().navigateToUrl("https://cms10dss.spirit.com/Shared/en-us/Documents/Privacy_Policy.pdf");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Contract_Of_Carriage_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://cms10dss.spirit.com/Shared/en-us/Documents/Contract_of_Carriage.pdf";
        App().Flow().navigateToUrl("https://cms10dss.spirit.com/Shared/en-us/Documents/Contract_of_Carriage.pdf");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }
    @Test
    public void Your_Privacy_Choice_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://privacyportal.onetrust.com/webform/a3ba0bce-b005-4f16-b003-c296ec63f389/954bc30a-2d63-4519-8090-bee1d30277d6";
        String expectedTitle = "Privacy Web Form";
        App().Flow().navigateToUrl("https://privacyportal.onetrust.com/webform/a3ba0bce-b005-4f16-b003-c296ec63f389/954bc30a-2d63-4519-8090-bee1d30277d6");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Travel_Agent_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://nkprodr4xspa.spirit.com/login";
        String expectedTitle = "Travel Agent Portal | Spirit Airlines";
        App().Flow().navigateToUrl("https://nkprodr4xspa.spirit.com/login");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Group_Agent_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://customersupport.spirit.com/en-us/category/article/KA-01333";
        String expectedTitle = "Spirit Airlines Map";
        App().Flow().navigateToUrl("https://customersupport.spirit.com/en-us/category/article/KA-01333");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Where_We_Fly_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://www.spirit.com/en/route-map";
        String expectedTitle = "Group Travel · Spirit Support";
        App().Flow().navigateToUrl("https://www.spirit.com/en/route-map");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Deals_Fly_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://www.spirit.com/en/flights";
        String expectedTitle = "Spirit Airlines Flights and Destinations";
        App().Flow().navigateToUrl("https://www.spirit.com/en/flights");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Facebook_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://www.facebook.com/SpiritAirlines/";
        String expectedTitle = "Spirit Airlines - Home | Facebook";
        App().Flow().navigateToUrl("https://www.facebook.com/SpiritAirlines/");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Twitter_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://twitter.com/spiritairlines";
        String expectedTitle = "Spirit Airlines (@SpiritAirlines) / Twitter";
        App().Flow().navigateToUrl("https://twitter.com/spiritairlines");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Instagram_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://www.instagram.com/spiritairlines/";
        String expectedTitle = "Spirit Airlines (@spiritairlines) • Instagram photos and videos";
        App().Flow().navigateToUrl("https://www.instagram.com/spiritairlines/");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void YouTube_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://www.youtube.com/channel/UCrOwgmAwcw8r8xs34RiIuJg";
        String expectedTitle = "Spirit Airlines - YouTube";
        App().Flow().navigateToUrl("https://www.youtube.com/channel/UCrOwgmAwcw8r8xs34RiIuJg");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Tumblr_Footer_Url () throws Exception {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://www.tumblr.com/login_required/spiritairlines";
        String expectedTitle = "Tumblr";
        App().Flow().navigateToUrl("https://www.tumblr.com/login_required/spiritairlines");
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

}