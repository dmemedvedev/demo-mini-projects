package ru.pomidor.sinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PastaTest extends BaseTest {
    @BeforeEach
    public void closePopup() throws InterruptedException {
        By buttonCloseBy = By.xpath(CityChooseModalPage.BUTTON_CLOSE_XPATH);
        WebElement buttonCloseWebElement = driver.findElement(buttonCloseBy);
        Thread.sleep(5000);
        buttonCloseWebElement.click();
    }

    @Test
    public void testClickOnPastaOpenPastaBlock() throws InterruptedException {
        By menuButtonPizzaBy = By.xpath(MenuPage.MENU_BUTTON_PASTA);
        WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
        Thread.sleep(5000);
        menuButtonPizzaWebElement.click();

        By titlePastaBy = By.xpath(PastaPage.TITLE_PASTA_XPATH);
        WebElement titlePastaWebElement = driver.findElement(titlePastaBy);
        String actualTitlePastaText = titlePastaWebElement.getText();
        String expectedTitlePastaText = "Паста";

        Assertions.assertEquals(expectedTitlePastaText, actualTitlePastaText);
    }
}

