package page_objects.factories;

import Infrastructure.ChromeDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.Chrome.RequestDemoPage;

public class RequestDemoPageFactory {
    public RequestDemoPage getPageObject(ChromeDemo chromeDemo) {
        if (chromeDemo.driver instanceof ChromeDriver) {
            return new RequestDemoPage(chromeDemo.driver);
        }
        return null;
    }
}
