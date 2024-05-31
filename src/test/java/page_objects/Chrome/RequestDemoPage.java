package page_objects.Chrome;

import Infrastructure.CommonPageObject;
import Infrastructure.Timeouts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import page_objects.interfaces.RequestDemo;

public class RequestDemoPage extends CommonPageObject implements RequestDemo {

    @FindBy(xpath = "//p[@id='breadcrumbs']/span/span[2]")
    private WebElement demoRequest;

    @FindBy(xpath = "//div[@id='demo-request-page']/section/div/div/div/h1")
    private WebElement seeHowTitle;

    public RequestDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Timeouts.WAIT_FOR_ELEMENT_TO_UPDATE), this);
    }

    @Override
    public void RequestDemoShown() {
        verifyElementDisplayed("Demo request", demoRequest);
        verifyElementDisplayed("See how ...", seeHowTitle);
    }
}
