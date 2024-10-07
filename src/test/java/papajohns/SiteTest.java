package papajohns;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SiteTest {
    WebDriver driver;
    String BASE_URL = "https://svyatoslav.biz/testlab/wt/index.php";

    @BeforeEach
    public void driverSetup(){
    driver = new ChromeDriver();
    driver.get(BASE_URL);
    }

    @Test
    public void testNames () throws InterruptedException {
     By rowBy = By.xpath("//input[@type = 'text']");
     List<WebElement> rows  = driver.findElements(rowBy);
     for (WebElement row :rows){
         row.sendKeys("test");
     }
     Thread.sleep(5000);

    }
    @AfterEach
    public void driverClose(){
        driver.quit();
    }
}
