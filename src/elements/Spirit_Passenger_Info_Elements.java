package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class Spirit_Passenger_Info_Elements {

    WebDriver driver;

    //Reset_Password_Url
    @FindBy(xpath = "//button[@class='d-block ml-auto btn btn-link btn-sm pt-0 ng-star-inserted']")  public WebElement ResPas;

    // Learn_More_PoUp
    @FindBy(xpath = "//a[@href='javascript:void(0)']")  public WebElement LearMorePop;

    //Title_DD
    @FindBy(id = "title0") public List<WebElement> TitleDd;

    //Suffix_DD
    @FindBy(id = "suffix0") public List<WebElement> SuffixDd;

    //State_DD
    @FindBy(id = "provinceState") public List<WebElement> StateDd;

    //Country_DD
    @FindBy(id = "countryCode") public List<WebElement> CountryDd;

    //Phone_Number_Country_Code_DD
    @FindBy(id = "phoneCountryType") public List<WebElement> PhoneNumberDd;

    //Adding_Info_LandsOn_Bundles
    @FindBy(id = "title0") public WebElement title;
    @FindBy(id = "firstName0") public WebElement firstName;
    @FindBy(id = "middleName0") public WebElement midName;
    @FindBy(id = "lastName0") public WebElement lastName;
    @FindBy(id = "dateOfBirth0") public WebElement DoB;
    @FindBy(id = "firstName") public WebElement conFirstName;
    @FindBy(id = "lastName") public WebElement conLastName;
    @FindBy(id = "provinceState") public WebElement State;
    @FindBy(id = "contactEmailPrimary") public WebElement email;
    @FindBy(id = "contactEmailConfirm") public WebElement confEmail;
    @FindBy(id = "phoneNumber") public WebElement phoneNumber;
    @FindBy(xpath = "//button[@data-qa='passenger-page-continue']") public WebElement confirm;

    //End To End
    @FindBy(xpath = "//button[@data-qa='bundle-cta-button-BF']") public WebElement bundleSelect;
    @FindBy(xpath = "/i[contains(@class,'add-circle')]") public WebElement addCarryOn;
    @FindBy(xpath = "//button[@data-track='continue-with-standard'] //div[@class='ng-star-inserted']") public WebElement continueStandard;


    public Spirit_Passenger_Info_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}