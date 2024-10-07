package papajohns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {
    private WebDriver driver;

    public static final String TITLE_PIZZA_XPATH = "//div[@class='_2wZr_g8akJwAOdNpJdYEN2']";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }
}
