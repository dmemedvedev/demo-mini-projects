import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculator {

    WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    @Test
    public void whenAllFieldsAreEmptyAndClickSubmitThenErrorMessage() {
        //1. Given

        //2. When - act
        String buttonCalculateXPath = "//input[@type = 'submit']";
        By buttonCalculateBy = By.xpath(buttonCalculateXPath);
        WebElement buttonCalculateByWebElement = driver.findElement(buttonCalculateBy);

        buttonCalculateByWebElement.click();

        //3. then
        String errorMessageXPath = "//b";
        By errorMessageBy = By.xpath(errorMessageXPath);
        WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void whenNameFieldIsFilledThenErrorMessage() {
        //1. Given
        String inputNameFieldXPath = "//input[@name = \"name\"]";
        By inputNameFiledBy = By.xpath(inputNameFieldXPath);
        WebElement inputNameFiledByWebElement = driver.findElement(inputNameFiledBy);
        inputNameFiledByWebElement.sendKeys("Dzmitryi");



        //2. When - act
        String buttonCalculateXPath = "//input[@type = 'submit']";
        By buttonCalculateBy = By.xpath(buttonCalculateXPath);
        WebElement buttonCalculateByWebElement = driver.findElement(buttonCalculateBy);

        buttonCalculateByWebElement.click();

        //3. then
        String errorMessageXPath = "//b";
        By errorMessageBy = By.xpath(errorMessageXPath);
        WebElement errorMessageWebElement = driver.findElement(errorMessageBy);

        String actualErrorMessage = errorMessageWebElement.getText();
        String expectedErrorMessage = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}
