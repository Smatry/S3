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



    public Spirit_User_Acc_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}