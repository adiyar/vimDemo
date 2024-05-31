package page_objects.factories;

import Infrastructure.ChromeDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.Chrome.ChromeMainPage;
import page_objects.interfaces.MainPage;

public class ChromeMainPageFactory {

    public MainPage getPageObject(ChromeDemo chromeDemo) {
        if (chromeDemo.driver instanceof ChromeDriver) {
            return new ChromeMainPage(chromeDemo.driver);
        }
        return null;
    }
}
