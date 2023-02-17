package pages;

import elements.Spirit_Passenger_Info_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Spirit_Passenger_Info_Page {
    WebDriver driver;
    Spirit_Passenger_Info_Elements PassSearchElement;
    public Spirit_Passenger_Info_Page (WebDriver driver) {
        this.driver = driver;
        PassSearchElement = new Spirit_Passenger_Info_Elements(driver);

    }

    public void ResetPasswordUrl () {
        PassSearchElement.ResPas.click();

    }
    public void LearnMorePoUP ()  {
        PassSearchElement.LearMorePop.click();

    }
    public List<WebElement> TitleDropDown () {
        return  PassSearchElement.TitleDd;


    }
    public List<WebElement>  SuffixDropDown () {
        return PassSearchElement.SuffixDd;

    }

    public List<WebElement>  StateDropDown () {
        return PassSearchElement.StateDd;

    }

    public List<WebElement>  CountryDropDown () {
        return PassSearchElement.CountryDd;

    }

    public List<WebElement> PhoneNumberDropDown () {
        return PassSearchElement.PhoneNumberDd;

    }

    public void Title (String title) {
        PassSearchElement.title.sendKeys(title);

    }

    public void FirstName (String Name) {
        PassSearchElement.firstName.sendKeys(Name);

    }

    public void MiddleName (String midName) {
        PassSearchElement.midName.sendKeys(midName);
    }

    public void LastName (String lastName) {
        PassSearchElement.lastName.sendKeys(lastName);

    }

    public void DOB (String DoB) {
        PassSearchElement.DoB.sendKeys(DoB);
    }

}
