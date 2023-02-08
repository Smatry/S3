package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Spirit_My_Trips_Sanity extends AbstractMyTripsBaseTest {

    @Test
    public void my_Trip_Page_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/my-trips/find-trip";
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }


    @Test
    public void Spirit_logo_link_navigates_home_page() throws Exception {

        SoftAssert sa = new SoftAssert();
        String expectedURL = "https://qa01.nk.spirit.com/";
        App().Pages().SpiritMyTripPage().SpiritLogo();
        Thread.sleep(2000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test
    public void Sing_In_To_Acc() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/account/activity";
        Thread.sleep(2000);
        App().Pages().SpiritMyTripPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritMyTripPage().PasswordDataAdd("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritMyTripPage().SingIn();
        Thread.sleep(5000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");


    }

    @Test
    public void Create_An_Acc() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";
        App().Pages().SpiritMyTripPage().CreateAnAccCTA();
        Thread.sleep(3000);
        String newUrl = driver.getCurrentUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }


}
