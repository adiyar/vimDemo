package StepDefinitions;

import Infrastructure.ChromeDemo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainPageSteps extends Instances {

    public MainPageSteps(ChromeDemo chromeDemo) {
        this.chromeDemo = chromeDemo;
    }

    @Then("VIM main page is shown")
    public void mailLoginPageLoad() {
        mainPage.verifyMainPage();
    }

    @When("User clicks on Request a Demo")
    public void clickOnRequestDemo() {
        mainPage.clickOnRequestDemo();
    }


}
