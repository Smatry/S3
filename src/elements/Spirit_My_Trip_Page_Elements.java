package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spirit_My_Trip_Page_Elements {

    WebDriver driver;

    // Spirit_logo_link_navigates_home_page
    @FindBy (xpath = "//img[@class='logo h-100']")  public WebElement SpiritLogo;

    // Sing_In_To_Acc
    @FindBy (xpath = "//input[@data-qa='find-trip-page-username']") public WebElement EmailAddress;
    @FindBy (xpath = "//input[@data-qa='find-trip-page-password']") public WebElement  PasswordData;
    @FindBy (xpath = "//button[@class='btn btn-primary btn-responsive']")  public WebElement SingInCTA;

    // Create_An_Acc
    @FindBy (xpath = "//button[@class='btn btn-secondary btn-responsive']") public WebElement CreateAnAccCTA;

    public Spirit_My_Trip_Page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
