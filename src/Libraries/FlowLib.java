package Libraries;

import org.openqa.selenium.WebDriver;

public class FlowLib {
    private WebDriver driver;

    public FlowLib (WebDriver driver) {
        this.driver = driver;
    }

     public String getCurrentPageUrl()  {
        return this.driver.getCurrentUrl();

    }

}
