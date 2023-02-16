package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Spirit_Passenger_Info_Elements {

    WebDriver driver;

    //Reset_Password_Url
    @FindBy(xpath = "//button[@class='d-block ml-auto btn btn-link btn-sm pt-0 ng-star-inserted']")  public WebElement ResPas;

    // Learn_More_PoUp
    @FindBy(xpath = "//a[@href='javascript:void(0)']")  public WebElement LearMorePop;

    //Acceptable_Form_ofID_Url
    @FindBy(linkText = "https://www.tsa.gov/travel/security-screening/identification")  public WebElement AcceptIDForm;

    //DHS_REL_ID_Url
    @FindBy(linkText = "https://www.dhs.gov/real-id") public WebElement DhlRealIDUrl;

    //tsa_gov_link
    @FindBy(linkText = "https://www.tsa.gov/") public WebElement TsaGovUrl;



    public Spirit_Passenger_Info_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

}