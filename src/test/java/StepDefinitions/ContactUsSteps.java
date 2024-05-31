package StepDefinitions;

import Infrastructure.ChromeDemo;
import io.cucumber.java.en.Then;

public class ContactUsSteps extends Instances{
    public ContactUsSteps(ChromeDemo chromeDemo) {
        this.chromeDemo = chromeDemo;
    }

    @Then("Request a Demo page is shown")
    public void RequestDemoPageLoad() {
        requestDemoPage.RequestDemo();
    }


}
