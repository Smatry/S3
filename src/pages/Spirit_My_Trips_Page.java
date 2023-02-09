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

    // Spirit_logo_link_navigates_home_page
     public void SpiritLogo () {
        myTripPageElements.SpiritLogo.click();

    }
     // Sing_In_To_Acc
     public void EmailData(String email) {
         myTripPageElements.EmailAddress.sendKeys(email);
     }

     public void PasswordDataAdd(String password){
         myTripPageElements.PasswordData.sendKeys(password);

     }

     public void SingIn (){
         myTripPageElements.SingInCTA.click();

     }

    // Create_An_Acc
    public void CreateAnAccCTA(){
        myTripPageElements.CreateAnAccCTA.click();
    }



    // Forgot_Password_Url
    public void ForgotPasswordUrl(){
        myTripPageElements.ForgotPassword.click();
     }

}
