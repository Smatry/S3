package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spirit_User_Acc_Elements {

    WebDriver driver;

    //Email//Pass//SingIn
    @FindBy (xpath = "//input[@data-qa='find-trip-page-username']") public WebElement EmailAddress;
    @FindBy (xpath = "//input[@data-qa='find-trip-page-password']") public WebElement  PasswordData;
    @FindBy (xpath = "//button[@class='btn btn-primary btn-responsive']")  public WebElement SingInCTA;

    //Dashboard
    @FindBy (id = "dashboard")  public WebElement dashboardCTA;
    //Status
    @FindBy (id = "status") public WebElement statusCTA;
    //Offers
    @FindBy (id = "offers") public WebElement offersCTA;
    //SaverClub
    @FindBy (id = "savings-club") public WebElement saversClubCTA;

   //StartAPool
    @FindBy (id = "my-pool") public WebElement MyPoolCTA;


    //Book_A_Flight_Url
    @FindBy (xpath = "//div//a[@data-track='book-flight']") public WebElement bookAFlightUrl;

    //Buy_or_Gift_Point_Url
    @FindBy (xpath = "//div//a[@data-track='buy-gift-points']") public WebElement giftPoints;

    //ActivityAddAnUpcomingTrip_Url
    @FindBy (xpath = "//div//a[@data-track='add-upcoming-trip']") public WebElement upcomingTrip;

    //ShopWithPartners
    @FindBy (xpath = "//div//a[@data-track='shop-with-partners']") public WebElement shopWithPartners;

    //DashboardAddAnUpcomingTrip
    @FindBy (xpath = "//a[@data-track='add-upcoming-trip']") public WebElement UpcomingTrip;

    //ActivityManageTrip
    @FindBy(xpath = "//td//a[@data-qa='row-action-link']") public WebElement manageTrip;

    //EditProfile
    @FindBy(id = "edit-profile-hyperlink") public WebElement editProf;

    //ManageMyPool
    @FindBy(xpath = "//a[@data-qa='manage-my-pool-link']") public WebElement managePool;

    //MyPoolApplyMasterCard
    @FindBy(id = "mastercardUpsellButton") public WebElement applyMasterCard;


    //Edit_Profile_Adding_Info
    @FindBy(id = "personal") public WebElement personalCTA;
    @FindBy(id = "middleName") public WebElement mdName;
    @FindBy(id = "address2") public WebElement address2;
    @FindBy(id = "save-personal-info") public WebElement saveInfo;

    //Saver$_Club_Validation
    @FindBy(xpath = "//div[@class='savers-club-badge']") public WebElement SCMember;

    //The_User_Has_A_Points
    @FindBy(xpath = "//div[@class='grid-column-2-row-1 grid-center-align']//div[@class='sub-header-user-points']") public WebElement userPoint;

    //Gold_Member_Validation
    @FindBy(xpath = "//img[@alt='member gold badge']") public WebElement GoldMember;

    //Silver_Member_Validation
    @FindBy(xpath = "//img[@alt='member silver badge']") public WebElement SilverMember;

    //Free_Spirit_Number_Validation
    @FindBy(id = "free-spirit-number") public WebElement freeSpiritNumber;

    //Offers_Free_Spirit_Master_Card_Apply_Now_Enabled
    @FindBy(id ="mastercardUpsellButton") public WebElement mastercardApplyEnabled;

    //Offers_Free_Spirit_Master_Card_Banner_Displayed
    @FindBy(id = "master-card-upsell-container") public WebElement mastercardBannerDisplayed;




    public Spirit_User_Acc_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}