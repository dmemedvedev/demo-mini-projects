package onliner.by;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlinerPage {
    WebDriver driver;

    @When("Open web site")
    public void openSite(){
        driver = new ChromeDriver();
        driver.get("http://onliner.by");
    }
    @Then("Assert Site Opened")
    public void checkSiteOpened(){
        String footerXPath = "//div[@class ='footer-class__copy']";
        By footerBy = By.xpath(footerXPath);
        WebElement footer = driver.findElement(footerBy);
        String actual = footer.getText();
        String expected = "© 2001—2024 Onlíner";

        Assertions.assertEquals(expected,actual);
    }
}
