import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {
    @Test
    public void testOpenSite(){
        //1 открыть браузер
        WebDriver driver = new ChromeDriver();

        //2 ввести адрес и перейти по адресу https://www.onliner.by
        driver.get("https://www.onliner.by");

        // 3 проверить текст на странице
        // 3.1 отыскать вэб-элемент
        // 3.2 забрать текст
        String textXPath = "/html/body/div[1]/footer/div/div/div/div[2]/div[2]";
        By TextByXPath = By.xpath(textXPath);
        WebElement textWebElement = driver.findElement(TextByXPath);

        String actual = textWebElement.getText();
        Assertions.assertEquals("© 2001—2024 Onlíner",actual);
    }
}
