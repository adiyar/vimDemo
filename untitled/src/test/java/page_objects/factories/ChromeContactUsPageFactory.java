package page_objects.factories;

import Infrastructure.ChromeDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.Chrome.ContactUsPage;

public class ChromeContactUsPageFactory {
    public ContactUsPage getPageObject(ChromeDemo chromeDemo) {
        if (chromeDemo.driver instanceof ChromeDriver) {
            return new ContactUsPage(chromeDemo.driver);
        }
        return null;
    }
}
