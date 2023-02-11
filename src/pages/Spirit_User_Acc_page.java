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
    public void StartAPool (){
        UserAccSearchElements.startapoolCTA.click();

    }

}