package Libraries;

import org.openqa.selenium.WebDriver;
import pages.Spirit_Home_Page;
import pages.Spirit_My_Trips_Page;
import pages.Spirit_Passenger_Info_Page;
import pages.Spirit_User_Acc_page;

public class PageLib {
    private WebDriver driver;
    private Spirit_Home_Page HomePage;
    private Spirit_My_Trips_Page MyTripPage;
    private Spirit_User_Acc_page AccPage;
    private Spirit_Passenger_Info_Page PassengerPage;


    public PageLib(WebDriver driver) {
        this.driver = driver;
        HomePage = new Spirit_Home_Page(this.driver);
        MyTripPage = new Spirit_My_Trips_Page(this.driver);
        AccPage = new Spirit_User_Acc_page(this.driver);
        PassengerPage = new Spirit_Passenger_Info_Page(this.driver);

    }

    public Spirit_Home_Page SpiritHomePage() {
        return HomePage;

    }
    public Spirit_My_Trips_Page SpiritMyTripPage() {
        return MyTripPage;

    }

    public Spirit_User_Acc_page SpiritUserAccPage() {
        return AccPage;

    }

    public Spirit_Passenger_Info_Page SpiritPassengerInfoPage () {
        return PassengerPage;

    }


}
