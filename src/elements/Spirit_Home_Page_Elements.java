package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Spirit_Home_Page_Elements {

    WebDriver driver;

    //My_Trip_url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-my-trips']") public WebElement myTripsCTA;

    //Check_in_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-check-in']") public WebElement CheckInCTA;

    //Free_Spirit_Url
    @FindBy(className = "sp-image") public WebElement FreeSpiritIcon;

    //Flight_Status_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-flight-status']") public WebElement flightStatusCTA;

    //Deals_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-deals']") public WebElement DealsCTA;

    //Contact_Us_Url
    @FindBy(xpath = "//a[@data-qa='home-page.common-header-contact-us']") public WebElement ContactUsCTA;

    //Saver_Club_url
    @FindBy(xpath = "//img[@alt='savers_club_image']") public WebElement SaverClubIcon;

    //Drop_Down_from
     @FindBy(xpath = "//i[@class='far fa-chevron-down ng-star-inserted']") public WebElement TypeOfTheTripSelector;

     @FindBy(xpath = "//label[@data-qa='one-way']") public WebElement OneWaySelected;

     @FindBy(xpath = "//label[@class='fromStation ng-tns-c142-3']")  public List<WebElement> DropDownFromAirport;

     //Drop_Down_To
     @FindBy(xpath = "//label[@class='toStation ng-tns-c142-3']") public  List<WebElement> getDropDownToAirport;

     //Spirit_JetBlue_Url
     @FindBy(xpath = "//strong//a[@target='_blank']") public WebElement SpiritJetBlueCTA;

     //Bank_Of_America_Url
     @FindBy(xpath = "//div//a[@class='cc-button-credit-card text-uppercase display-desktop text-center btn btn-primary']") public WebElement BankOfAmSTA;

     //Landing_OnThePassenger_Page
     @FindBy(xpath = "//label[@class='toStation ng-tns-c165-3']") public WebElement ToStationDropDown;

     @FindBy(xpath = "//p[@class='station-picker-dropdown__station-name ng-star-inserted']") public WebElement ToStation;

     @FindBy(xpath = "//button[@class='btn btn-primary btn-lg search-button ng-tns-c165-3 ng-star-inserted']") public WebElement search;

     @FindBy(xpath = "//section//div//button[@data-qa='pricing-breakdown-standard-cta']") public WebElement standardPricing;


     // Booking_Flight_Confirm
     @FindBy(xpath = "//div//p[@class='p-grid__pricing-value ng-star-inserted']") public WebElement Confirm;

     //Create_An_Acc
     @FindBy(xpath = "//a[@data-qa='home-page.common-header-login']") public WebElement singInHeader;
     @FindBy(xpath = "//div//button[@class='btn btn-secondary btn-responsive w-100']") public WebElement createAnAccCTA;
     @FindBy(id = "firstName") public WebElement firstName;
     @FindBy(id ="lastName") public WebElement lastName;
     @FindBy(id = "free-spirit-account-enrollment-dob") public WebElement dayOfBirth;
     @FindBy(id = "emailAddress") public  WebElement email;
     @FindBy(id = "passwordFieldId") public WebElement password;
     @FindBy (xpath = "//div//input[@class='checkBox ng-untouched ng-dirty ng-invalid']") public WebElement checkBox;
     @FindBy (xpath = "//div//button[@data-qa='fs-sign-up-button']") public WebElement singUp;

     public Spirit_Home_Page_Elements(WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver, this);

     }

}
