package pages;

import elements.Spirit_My_Trip_Page_Elements;
import org.openqa.selenium.WebDriver;

public class Spirit_My_Trips_Page {
     WebDriver driver;
     Spirit_My_Trip_Page_Elements myTripPageElements;

     public Spirit_My_Trips_Page (WebDriver driver) {
        this.driver = driver;
        myTripPageElements = new Spirit_My_Trip_Page_Elements(driver);
    }

     public void SpiritLogo () {
        myTripPageElements.SpiritLogo.click();

    }

     public void EmailData(String email) {
         myTripPageElements.EmailAddress.sendKeys(email);
     }

     public void PasswordDataAdd(String password){
         myTripPageElements.PasswordData.sendKeys(password);

     }

     public void SingIn (){
         myTripPageElements.SingInCTA.click();

     }


    public void CreateAnAccCTA(){
        myTripPageElements.CreateAnAccCTA.click();
    }



    public void ForgotPasswordUrl(){
        myTripPageElements.ForgotPassword.click();
     }


     public boolean SingInIsEnabled () {
        return myTripPageElements.singInEnabled.isEnabled();

     }

     public boolean CreateAnAccEnabled () {
         return myTripPageElements.CreateAnAccEnabled.isEnabled();

     }

     public boolean ContinueIsEnabled () {
         return myTripPageElements.continueEnabled.isEnabled();

     }
     public boolean SpiritLogoIsDisplayed () {
         return myTripPageElements.LogoDisplayed.isDisplayed();

     }



}
