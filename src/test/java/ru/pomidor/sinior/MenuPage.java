package ru.pomidor.sinior;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
        public static final String BUTTON_PIZZA = "//a[@href='#block-views-products-block']";
        public static final String MENU_BUTTON_COMBO = "//a[@href='#block-views-products-block-1']";
        public static final String MENU_BUTTON_SALADS = "//a[@href='#block-views-products-block-2']";
        public static final String MENU_BUTTON_SOUPS = "//a[@href='#block-views-products-block-3']";
        public static final String MENU_BUTTON_PASTA = "//a[@href='#block-views-products-block-4']";
        public static final String MENU_BUTTON_SNACKS = "//a[@href='#block-views-products-block-5']";
        public static final String MENU_BUTTON_ROLLS = "//a[@href='#block-views-products-block-6']";
        public static final String MENU_BUTTON_DESERTS = "//a[@href='#block-views-products-block-7']";
        public static final String MENU_BUTTON_DRINKS = "//a[@href='#block-views-products-block-8']";


        private WebDriver driver;

        public void setDriver(WebDriver driver) {
                this.driver = driver;
        }

        public void clickButtonPizza() throws InterruptedException {
                By menuButtonPizzaBy = By.xpath(BUTTON_PIZZA);
                WebElement menuButtonPizzaWebElement = driver.findElement(menuButtonPizzaBy);
                Thread.sleep(5000);
                menuButtonPizzaWebElement.click();
        }
    }




