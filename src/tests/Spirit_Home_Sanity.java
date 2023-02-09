package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Spirit_Home_Sanity extends AbstractHomeBaseTest {


    @Test
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

    @Test
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

    @Test
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

    @Test
    public void  Free_Spirit_Url () throws Exception {

        SoftAssert sa = new SoftAssert();
        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";
        App().Pages().SpiritHomePage().FreeSpiritURL();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);

        sa.assertEquals(newUrl,expectedURL,"Verify URL of new page");

    }

    @Test
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

    @Test
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



    @Test
    public void Saver_Club_Url () throws Exception {

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


    }