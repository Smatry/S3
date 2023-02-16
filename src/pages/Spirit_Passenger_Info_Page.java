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


}
