package ru.pomidor.sinior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {
        private WebDriver driver;

        public static final String TITLE_PIZZA_XPATH = "//section[@id='block-views-products-block']//h2";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }
}