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

    public void ConFirstName (String Name) {
        PassSearchElement.conFirstName.sendKeys(Name);
    }

    public void ConLastName (String lastName) {
        PassSearchElement.conLastName.sendKeys(lastName);
    }

    public void State (String state) {
        PassSearchElement.State.sendKeys(state);

    }
    public void Email (String email) {
        PassSearchElement.email.sendKeys(email);

    }

    public void ConEmail (String email) {
        PassSearchElement.confEmail.sendKeys(email);

    }

    public void PhoneNumber (String number) {
        PassSearchElement.phoneNumber.sendKeys(number);

    }

    public void Continue () {
        PassSearchElement.confirm.click();
    }

   public void BundleStandardSelected () {
       PassSearchElement.bundleSelect.click();

   }

   public void AddingCarryOnBag () {
       PassSearchElement.addCarryOn.click();

   }

   public void ContinueWithStandard () {
       PassSearchElement.continueStandard.click();


   }
   public void ContinueSelected () {
       PassSearchElement.ContinueClick.click();


   }

   public void ContinueOptionStandard () {
       PassSearchElement.ContinueOptionStandard.click();

   }
   public void ContinueWithoutFlightFlex() {
       PassSearchElement.withoutFlightFlex.click();

   }

   public void AccountHolderName (String holdname) {
       PassSearchElement.accHoldName.sendKeys(holdname);

   }

   public void CreditCardNumber (String creditNumber) {
       PassSearchElement.CCnumber.sendKeys(creditNumber);

   }

   public void CreditCardExpirationDate (String exdate) {
       PassSearchElement.CCexpiration.sendKeys(exdate);

   }
   public void CreditCardSecurityCode (String code)  {
       PassSearchElement.CCsecurityCode.sendKeys(code);

   }

}
