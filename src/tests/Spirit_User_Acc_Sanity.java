package tests;

import Utils.DataUnit1;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

public class Spirit_User_Acc_Sanity  extends AbstractUserAccBaseTest {


    @Test(groups = {"P1"})
    public void logged_In() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
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
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");


    }

    @Test(groups = {"P1"})
    public void Dashboard() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
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
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Status() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
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
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test(groups = {"P2"})
    public void Offers() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
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
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test(groups = {"P2"})
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
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void My_Pool() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/my-pool";
        String expectedTitle = "Spirit Airlines - My Pool";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().StartAPool();
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Dashboard_Book_A_Flight_Url() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/";
        String expectedTitle = "Spirit Airlines";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().BookAFlightURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Dashboard_Buy_or_Gift_Point () throws Exception {

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
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Dashboard_Add_An_Up_coming_Trip () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSsliver@spirit.com");
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
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");
    }


    @Test
    public void Dashboard_Shop_With_Partners () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/s/our-partners";
        String expectedTitle = "Spirit Airlines";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().DashboardLink();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().ShopWithPartnersURL();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");
    }


    @Test
    public void Dashboard_Add_An_Upcoming_Trip () throws Exception {

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
        Thread.sleep(5000);

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
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");


    }

    @Test
    public void Edit_Profile () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSsliver@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/edit-profile";
        String expectedTitle = "Spirit Airlines - Edit Profile";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().EditProfile();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }
    @Test
    public void Manage_My_Pool() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/manage-pool";
        String expectedTitle = "Spirit Airlines - Manage Pool";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().StartAPool();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().ManagePool();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void My_Pool_Apply_MasterCard () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://secure.bankofamerica.com/apply-credit-cards/public/icai-single/#/info/";
        String expectedTitle = "Your Application";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().StartAPool();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().ApplyMasterCard();
        Thread.sleep(3000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Edit_Profile_Adding_Info () throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("mikesmithFSgold@spirit.com");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Brandy12$");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/edit-profile";
        String expectedTitle = "Spirit Airlines - Edit Profile";
        Thread.sleep(5000);
        App().Pages().SpiritUserAccPage().EditProfile();
        Thread.sleep(3000);
        App().Pages().SpiritUserAccPage().Edit();
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().MidlName("Jr");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().Address2("123 Pratt St");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SavePersonInfo();
        Thread.sleep(2000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(5000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");

    }

    @Test
    public void Saver$_Club_Validation() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        sa.assertTrue(App().Pages().SpiritUserAccPage().Saver$ClubValidations());
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/activity";
        String expectedTitle = "Spirit Airlines - Loyalty";
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");


    }

    @Test
    public void The_User_Has_A_Points() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        sa.assertTrue(App().Pages().SpiritUserAccPage().TheUserHasAPoint());
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/activity";
        String expectedTitle = "Spirit Airlines - Loyalty";
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");


    }

    @Test
    public void Gold_Member_Validation() throws Exception {

        SoftAssert sa = new SoftAssert();

        App().Pages().SpiritUserAccPage().EmailData("lennoxscgld@qa.test");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("Zxasqw12!");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);
        sa.assertTrue(driver.findElement(By.xpath("//img[@alt='member gold badge']")).isDisplayed());
        Thread.sleep(5000);
        String expectedURL = "https://qa01.nk.spirit.com/account/activity";
        String expectedTitle = "Spirit Airlines - Loyalty";
        Thread.sleep(5000);
        String newUrl = App().Flow().getCurrentPageUrl();
        String newTitle = App().Flow().getCurrentPageTitle();
        System.out.println(newUrl);
        System.out.println(newTitle);
        Thread.sleep(6000);

        sa.assertEquals(newUrl, expectedURL, "Verify URL of new page");
        sa.assertEquals(newTitle, expectedTitle, "Verify Title of new page");


    }



    @Test (description = "Test Data1.json", dataProviderClass = DataUnit1.class, dataProvider = "dataProvider1")
    public void Ability_To_Use_Test_Data_JSONFile(HashMap<String, String> hashMap) throws Exception {

        App().Pages().SpiritUserAccPage().EmailData(hashMap.get("email"));
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().PasswordData("password");
        Thread.sleep(2000);
        App().Pages().SpiritUserAccPage().SingIN();
        Thread.sleep(5000);

    }

}