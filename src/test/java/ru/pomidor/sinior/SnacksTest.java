package ru.pomidor.sinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnacksTest extends BaseTest {

        @BeforeEach
        public void closePopup() throws InterruptedException {
            By buttonCloseBy = By.xpath(CityChooseModalPage.BUTTON_CLOSE_XPATH);
            WebElement buttonCloseWebElement = driver.findElement(buttonCloseBy);
            Thread.sleep(5000);
            buttonCloseWebElement.click();
        }

        @Test
        public void testClickOnSnacksOpenSnacksBlock() throws InterruptedException {
            By menuButtonPizzaBy = By.xpath(MenuPage.MENU_BUTTON_SNACKS);
            WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
            Thread.sleep(5000);
            menuButtonPizzaWebElement.click();

            By titleSnacksBy = By.xpath(SnacksPage.TITLE_SNACKS_XPATH);
            WebElement titleSnacksWebElement = driver.findElement(titleSnacksBy);
            String actualTitleSnacksText = titleSnacksWebElement.getText();
            String expectedTitleSnacksText = "Закуски";

            Assertions.assertEquals(expectedTitleSnacksText, actualTitleSnacksText);
        }
    }



