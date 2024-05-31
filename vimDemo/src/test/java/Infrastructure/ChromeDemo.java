package Infrastructure;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
    public WebDriver driver;
    public Scenario scenario;
    public String URL = "https://www.getvim.com/";


    public void setup(Scenario scenario) {
        this.scenario = scenario;
        driver = getDriver();
    }

    public void teardown() {
        if (driver != null) driver.quit();
    }

    private WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        return driver;
    }


}