package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spirit_User_Acc_Elements {

    WebDriver driver;

    //Dashboard
    @FindBy (id = "dashboard")  public WebElement dashboardCTA;
    //Status
    @FindBy (id = "status") public WebElement statusCTA;
    //Offers
    @FindBy (id = "offers") public WebElement offersCTA;
    //SaverClub
    @FindBy (id = "savings-club") public WebElement saversClubCTA;



    public Spirit_User_Acc_Elements (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}