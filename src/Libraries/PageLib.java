package Libraries;

import org.openqa.selenium.WebDriver;
import pages.Spirit_Home_Page;
import pages.Spirit_My_Trips_Page;

public class PageLib {
    private WebDriver driver;
    private Spirit_Home_Page HomePage;
    private Spirit_My_Trips_Page MyTripPage;

    public PageLib(WebDriver driver) {
        this.driver = driver;
        HomePage = new Spirit_Home_Page(this.driver);
        MyTripPage = new Spirit_My_Trips_Page(this.driver);
    }

    public Spirit_Home_Page SpiritHomePage() {
        return HomePage;

    }
    public Spirit_My_Trips_Page SpiritMyTripPage() {
        return MyTripPage;

    }

}
