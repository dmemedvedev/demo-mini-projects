import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCalculate extends BaseCalculate {
    @Test
    public void whenAllFieldsAreEmptyAndClickSubmitThenErrorMessage() {

        String buttonCalculateXPath = "//input[@type = 'submit']";
        By buttonCalculateBy = By.xpath(buttonCalculateXPath);
        WebElement buttonCalculateByWebElement = driver.findElement(buttonCalculateBy);

        buttonCalculateByWebElement.click();

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

        String inputNameFieldXPath = "//input[@name = \"name\"]";
        By inputNameFiledBy = By.xpath(inputNameFieldXPath);
        WebElement inputNameFiledByWebElement = driver.findElement(inputNameFiledBy);
        inputNameFiledByWebElement.sendKeys("Dzmitryi");



        String buttonCalculateXPath = "//input[@type = 'submit']";
        By buttonCalculateBy = By.xpath(buttonCalculateXPath);
        WebElement buttonCalculateByWebElement = driver.findElement(buttonCalculateBy);

        buttonCalculateByWebElement.click();

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


