package av.by;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import av.by.BaseTest;


public class AVTEst extends BaseTest {

        @Test
        public void closePopup() throws InterruptedException {
            By buttonCloseCookieBy = By.xpath(CloseCookiePage.BUTTON_CLOSE_COOKIE_XPATH);
            WebElement buttonCloseCookieWebElement = driver.findElement(buttonCloseCookieBy);
            Thread.sleep(5000);
            buttonCloseCookieWebElement.click();
            Thread.sleep(5000);
        }
}
