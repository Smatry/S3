package pages;

import elements.Spirit_Home_Page_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Spirit_Home_Page {
    WebDriver driver;
    Spirit_Home_Page_Elements homeSearchElements;
    public Spirit_Home_Page(WebDriver driver) {
        this.driver = driver;
        homeSearchElements = new Spirit_Home_Page_Elements(driver);
    }

    //My_Trip_url
    public void MyTripUrl () {
        homeSearchElements.myTripsCTA.click();
    }

    //Check_In_Url
    public void CheckInUrl() {
        homeSearchElements.CheckInCTA.click();

    }

    //Flight_Status_Url
    public void FlightStatusUrl () {
        homeSearchElements.flightStatusCTA.click();

    }
    //Deals_Url
    public void DealsUrl() {
        homeSearchElements.DealsCTA.click();

    }

    //Contact_Us_Url
    public void ContactUsUrl() {
        homeSearchElements.ContactUsCTA.click();

    }


    // Free_Spirit_url
    public void FreeSpiritURL () {
        homeSearchElements.FreeSpiritIcon.click();

    }
    // Saver_Club_Url
    public void SaverClubURL () {
        homeSearchElements.SaverClubIcon.click();

    }
    // drop_down_from
    public void TripTypeSelect () {
        homeSearchElements.TypeOfTheTripSelector.click();

    }
    public void SelectedOneWay () {
        homeSearchElements.OneWaySelected.click();

    }
    public List<WebElement> DropDownFromStations () {
        return homeSearchElements.DropDownFromAirport;

    }

    // drop_down_to
    public List<WebElement> DropDownToStations () {
        return homeSearchElements.getDropDownToAirport;

    }

    public void SpiritJetBlueUrl () {
        homeSearchElements.SpiritJetBlueCTA.click();

    }


    public void BankOfAmericaUrl() {
        homeSearchElements.BankOfAmSTA.click();

    }


    public void ToStationDropDownMenu() {
        homeSearchElements.ToStationDropDown.click();

    }

    public void ToStationSelected() {
        homeSearchElements.ToStation.click();


    }
    public void SearchButton() {
        homeSearchElements.search.click();

    }

    public void FlightConfirmed() {
        homeSearchElements.Confirm.click();

    }



    public void SingInHeader () {
        homeSearchElements.singInHeader.click();

    }

    public void CreateAnAcc ()  {
        homeSearchElements.createAnAccCTA.click();

    }

    public void FirsName (String firstName) {
        homeSearchElements.firstName.sendKeys(firstName);
    }

    public void LastName (String lastName) {
        homeSearchElements.lastName.sendKeys(lastName);

    }

    public void DOB (String dayOfBirth) {
        homeSearchElements.dayOfBirth.sendKeys(dayOfBirth);

    }

    public void Email (String email) {
        homeSearchElements.email.sendKeys(email);

    }

    public void Password (String password) {
        homeSearchElements.password.sendKeys(password);


    }
    public void CheckBox () {
        homeSearchElements.checkBox.click();

    }
    public void SingUp () {
        homeSearchElements.singUp.click();
    }

    public void WithStandardPricing () {
        homeSearchElements.standardPricing.click();

    }
    public boolean SearchButtonEnable () {
        return homeSearchElements.searchBtn.isEnabled();
    }

    public boolean ApplyMasterCardEnable () {
        return homeSearchElements.applyMasterCardCTS.isEnabled();
    }

    public boolean JoinServerClubImageDisplayed () {
        return homeSearchElements.joinServerClubImageIsDisplayed.isDisplayed();

    }

}
