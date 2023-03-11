package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Spirit_My_Trips_Sanity extends AbstractMyTripsBaseTest {

    @Test(groups = {"P1"})
    public void my_Trip_Page_Url() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/my-trips/find-trip";
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P2"})
    public void Spirit_logo_link_navigates_home_page() throws Exception {

        SoftAssert sa = new SoftAssert();
        String expectedURL = "https://qa01.nk.spirit.com/";
        App().Pages().SpiritMyTripPage().SpiritLogo();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P1"})
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
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");


    }

    @Test(groups = {"P2"})
    public void Create_An_Acc() throws Exception {

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/free-spirit";
        App().Pages().SpiritMyTripPage().CreateAnAccCTA();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }

    @Test(groups = {"P2"})
    public void Forgot_Password_Url() throws Exception {


        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        String expectedURL = "https://qa01.nk.spirit.com/retrieve-password";
        Thread.sleep(2000);
        App().Pages().SpiritMyTripPage().ForgotPasswordUrl();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        System.out.println(newUrl);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");

    }
    @Test
    public void Sing_In_Is_Enabled() throws Exception{

        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        sa.assertTrue(App().Pages().SpiritMyTripPage().SingInIsEnabled());

    }
    @Test
    public void Create_An_Account_Enabled() throws Exception {
        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        sa.assertTrue(App().Pages().SpiritMyTripPage().CreateAnAccEnabled());

    }

    @Test
    public void Find_My_Trip_Continue_Enabled() throws Exception {
        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        sa.assertTrue(App().Pages().SpiritMyTripPage().ContinueIsEnabled());

    }
    @Test
    public void Spirit_Logo_Displayed() throws Exception {
        SoftAssert sa = new SoftAssert();
        Thread.sleep(2000);
        sa.assertTrue(App().Pages().SpiritMyTripPage().SpiritLogoIsDisplayed());

    }

}
