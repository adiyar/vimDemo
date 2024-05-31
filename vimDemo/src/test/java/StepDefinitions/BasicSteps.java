package StepDefinitions;

import Infrastructure.ChromeDemo;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import page_objects.factories.*;

public class BasicSteps extends Instances {

    public BasicSteps(ChromeDemo chromeDemo) {
        this.chromeDemo = chromeDemo;
    }

    @Before
    public void setup(Scenario scenario) {
        chromeDemo.setup(scenario);
        mainPage = new ChromeMainPageFactory().getPageObject(chromeDemo);
        contactUsPage = new ChromeContactUsPageFactory().getPageObject(chromeDemo);

    }

    @Given("a user browse to COMMPEAK web site")
    public void aLoggedOutUser() {
        ExtentCucumberAdapter.getCurrentStep().info("user browsing to COMMPEAK");
    }


    @AfterStep
    @BeforeStep
    public void takeScreenShot(Scenario scenario) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) chromeDemo.driver;
        byte[] src = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(src, "image/png", "screenshot");
    }

    @After
    public void tearDown() {
        chromeDemo.teardown();
    }

}
