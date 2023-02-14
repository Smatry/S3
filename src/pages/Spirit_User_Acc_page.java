package pages;

import elements.Spirit_User_Acc_Elements;
import org.openqa.selenium.WebDriver;

public class Spirit_User_Acc_page {
    WebDriver driver;
    Spirit_User_Acc_Elements UserAccSearchElements;

    public Spirit_User_Acc_page(WebDriver driver) {
        this.driver = driver;
        UserAccSearchElements = new Spirit_User_Acc_Elements(driver);

    }

    public void DashboardLink() {


        UserAccSearchElements.dashboardCTA.click();
    }

    public void StatusLink() {


        UserAccSearchElements.statusCTA.click();
    }

    public void OffersLink() {

        UserAccSearchElements.offersCTA.click();


    }

    public void SaverClubLink() {
        UserAccSearchElements.saversClubCTA.click();

    }


    public void StartAPool() {
        UserAccSearchElements.MyPoolCTA.click();

    }

    public void EmailData(String email) {
        UserAccSearchElements.EmailAddress.sendKeys(email);


    }

    public void PasswordData(String password) {
        UserAccSearchElements.PasswordData.sendKeys(password);


    }

    public void SingIN() {
        UserAccSearchElements.SingInCTA.click();


    }

    public void BookAFlightURL() {
        UserAccSearchElements.bookAFlightUrl.click();


    }

    public void BuyAGiftPointURL() {
        UserAccSearchElements.giftPoints.click();


    }

    public void AddAnUpcomingTripURL() {
        UserAccSearchElements.upcomingTrip.click();


    }

    public void ShopWithPartnersURL() {
        UserAccSearchElements.shopWithPartners.click();

    }

    public void AddAnUPTripURL() {
        UserAccSearchElements.UpcomingTrip.click();


    }

    public void ManageTripURL() {
        UserAccSearchElements.manageTrip.click();

    }

    public void EditProfile () {
        UserAccSearchElements.editProf.click();

    }

    public void ManagePool () {
        UserAccSearchElements.managePool.click();


    }
    public void ApplyMasterCard () {
        UserAccSearchElements.applyMasterCard.click();


    }

    public void Edit ()  {
        UserAccSearchElements.personalCTA.click();

    }

    public void MidlName (String mdName) {
        UserAccSearchElements.mdName.click();
    }

    public void Address2 (String address2) {
        UserAccSearchElements.address2.click();

    }
    public void SavePersonInfo () {
        UserAccSearchElements.saveInfo.click();


    }

}