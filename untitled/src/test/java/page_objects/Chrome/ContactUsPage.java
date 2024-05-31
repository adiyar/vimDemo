package page_objects.Chrome;

import Infrastructure.CommonPageObject;
import Infrastructure.Timeouts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import page_objects.interfaces.ContactUs;

public class ContactUsPage extends CommonPageObject implements ContactUs {

    @FindBy(id = "name")
    private WebElement contactUsName;

    @FindBy(xpath = "//label[@for='products']")
    private WebElement contactUsProducts;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Timeouts.WAIT_FOR_ELEMENT_TO_UPDATE), this);
    }

    @Override
    public void verifyCotactUs() {
        verifyElementDisplayed("Name field", contactUsName);
        verifyElementDisplayed("products dropdown", contactUsProducts);
    }
}
