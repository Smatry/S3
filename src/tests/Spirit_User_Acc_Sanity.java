package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Spirit_User_Acc_Sanity  extends AbstractUserAccBaseTest {


    @Test
    public void logged_In() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/activity";
        String expectedTitle = "Spirit Airlines - Loyalty";
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);
        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");
        Thread.sleep(5000);

    }

    @Test
    public void Dashboard() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/dashboard";
        String expectedTitle = "Spirit Airlines - Activity";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Status() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/status";
        String expectedTitle = "Spirit Airlines - Status";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().StatusLink();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Offers() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/offers";
        String expectedTitle = "Spirit Airlines - Offers";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().OffersLink();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Saver_$_Club() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/savings-club";
        String expectedTitle = "Spirit Airlines - Savers Club";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().SaverClubLink();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Start_A_Pool() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/create-pool";
        String expectedTitle = "Spirit Airlines - My Pool";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().StartAPool();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Book_A_Flight_Url() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/";
        String expectedTitle = "Spirit Airlines";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().BookAFlightURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Buy_or_Gift_Point () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://storefront.points.com/free-spirit/en-US/buy?product=buy";
        String expectedTitle = "Buy points";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().BuyAGiftPointURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Add_An_Up_coming_Trip () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/retro-credit-request";
        String expectedTitle = "Buy points";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().AddAnUpcomingTripURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");
    }


    @Test
    public void Shop_With_Partners () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/s/our-partners";
        String expectedTitle = "Spirit Airlines";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().ShopWithPartnersURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");
    }


    @Test
    public void Add_an_Upcoming_Trip () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/retro-credit-request";
        String expectedTitle = "Spirit Airlines - Loyalty";
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().AddAnUPTripURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");
    }

    @Test
    public void Activity_Manage_Trip () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/check-in/reservation-summary";
        String expectedTitle = "Manage Travel - Your Trip Summary | Spirit Airlines";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().ManageTripURL();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");


    }



}