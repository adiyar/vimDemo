package Infrastructure;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureResultsWriteException;
import io.qameta.allure.AllureResultsWriter;
import io.qameta.allure.model.Status;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.InputStream;

/**
 * Extend this class in your page object to use common element operations.
 */
public class CommonPageObject {
    public WebDriver driver;

    public void verifyElementDisplayed(String text, WebElement element) {

        waitForElement(text, element);
    }

    public void clickOnWebElement(String text, WebElement element) {
        try {
            new WebDriverWait(driver, Timeouts.WAIT_FOR_ELEMENT_TO_UPDATE).until(ExpectedConditions.elementToBeClickable(element)).click();
            ExtentCucumberAdapter.getCurrentStep().pass(text + " was clicked");
        } catch (Exception exception) {
            ExtentCucumberAdapter.getCurrentStep().fail(text + " wasn't clicked");
            Assert.fail(text + " wasn't clicked");
        }
    }

    public void waitForElement(String text, WebElement element) {
        try {
            new WebDriverWait(driver, Timeouts.WAIT_FOR_ELEMENT_TO_UPDATE).until(ExpectedConditions.visibilityOf(element));
            ExtentCucumberAdapter.getCurrentStep().pass(text + " is shown on screen");
        } catch (Exception exception) {
            ExtentCucumberAdapter.getCurrentStep().fail(text + " isn't shown on screen");
            Assert.fail(text + " isn't shown on screen");
        }
    }

}

