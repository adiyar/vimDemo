package StepDefinitions;

import Infrastructure.ChromeDemo;
import io.cucumber.java.en.Then;

public class ContactUsSteps extends Instances{
    public ContactUsSteps(ChromeDemo chromeDemo) {
        this.chromeDemo = chromeDemo;
    }

    @Then("contact us main page is shown")
    public void mailLoginPageLoad() {
        contactUsPage.verifyCotactUs();
    }


}
