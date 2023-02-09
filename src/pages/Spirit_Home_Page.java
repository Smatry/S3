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
    public List<WebElement> DropDownToStations () {
        return homeSearchElements.getDropDownToAirport;

    }
}
