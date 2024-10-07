package ru.pomidor.sinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SoupTest extends BaseTest {

        @BeforeEach
        public void closePopup() throws InterruptedException {
            By buttonCloseBy = By.xpath(CityChooseModalPage.BUTTON_CLOSE_XPATH);
            WebElement buttonCloseWebElement = driver.findElement(buttonCloseBy);
            Thread.sleep(5000);
            buttonCloseWebElement.click();
        }

        @Test
        public void testClickOnSoupOpenSoupBlock() throws InterruptedException {
            By menuButtonPizzaBy = By.xpath(MenuPage.MENU_BUTTON_SOUPS);
            WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
            Thread.sleep(5000);
            menuButtonPizzaWebElement.click();

            By titleSoupBy = By.xpath(SoupsPage.TITLE_SOUPS_XPATH);
            WebElement titleSoupWebElement = driver.findElement(titleSoupBy);
            String actualTitleSoupText = titleSoupWebElement.getText();
            String expectedTitleSoupText = "Супы";

            Assertions.assertEquals(expectedTitleSoupText, actualTitleSoupText);
        }
    }

