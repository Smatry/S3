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

     public Spirit_Home_Page_Elements(WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver, this);

     }

}
