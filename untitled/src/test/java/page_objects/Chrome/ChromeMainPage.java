package page_objects.Chrome;

import Infrastructure.CommonPageObject;
import Infrastructure.Timeouts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import page_objects.interfaces.MainPage;

public class ChromeMainPage extends CommonPageObject implements MainPage {

    @FindBy(xpath = "//img[@alt='CommPeak logo']")
    private WebElement commpeakLogo;

    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    private WebElement commpeakContactUs;

    @FindBy(id = "masthead")
    private WebElement commpeakUpperOptionsBar;

    public ChromeMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Timeouts.WAIT_FOR_ELEMENT_TO_UPDATE), this);
    }

    @Override
    public void verifyMainPage() {
        verifyElementDisplayed("COMMPEAK logo", commpeakLogo);
        verifyElementDisplayed("COMMPEAK Contact us", commpeakContactUs);
        verifyElementDisplayed("COMMPEAK upper options bar", commpeakUpperOptionsBar);
    }

    @Override
    public void clickOnConTactUs() {
        clickOnWebElement("contact us", commpeakContactUs);
    }


}
