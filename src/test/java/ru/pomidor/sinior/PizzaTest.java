package ru.pomidor.sinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PizzaTest extends BaseTest{

    @BeforeEach
    public void closePopup() throws InterruptedException {
        By buttonCloseBy = By.xpath(CityChooseModalPage.BUTTON_CLOSE_XPATH);
        WebElement buttonCloseWebElement = driver.findElement(buttonCloseBy);
        Thread.sleep(5000);
        buttonCloseWebElement.click();
    }
     //new MenuPage(driver).clickButtonPizza();
    @Test

    public void testClickOnPizzaOpenPizzaBlock() throws InterruptedException {
        By menuButtonPizzaBy = By.xpath(MenuPage.BUTTON_PIZZA);
        WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
        Thread.sleep(5000);
        menuButtonPizzaWebElement.click();

        By titlePizzaBy = By.xpath(PizzaPage.TITLE_PIZZA_XPATH);
        WebElement titlePizzaWebElement = driver.findElement(titlePizzaBy);
        String actualTitlePizzaText = titlePizzaWebElement.getText();
        String expectedTitlePizzaText = "Пицца";

        Assertions.assertEquals(expectedTitlePizzaText, actualTitlePizzaText);
    }
}
