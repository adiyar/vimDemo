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

    @FindBy(xpath = "//p[@class='logo']")
    private WebElement vimLogo;

    @FindBy(xpath = "//a[contains(text(),'Request a Demo')]")
    private WebElement requestDemoButton;

    @FindBy(xpath = "//div[@class='header']")
    private WebElement vimLogoUpperOptionsBar;

    public ChromeMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Timeouts.WAIT_FOR_ELEMENT_TO_UPDATE), this);
    }

    @Override
    public void verifyMainPage() {
        verifyElementDisplayed("VIM logo", vimLogo);
        verifyElementDisplayed("Request a Demo button", requestDemoButton);
        verifyElementDisplayed("VIM upper options bar", vimLogoUpperOptionsBar);
    }

    @Override
    public void clickOnRequestDemo() {
        clickOnWebElement("Request a Demo", requestDemoButton);
    }


}
