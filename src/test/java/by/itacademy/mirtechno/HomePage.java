package by.itacademy.mirtechno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private WebDriver driver;

    public static final String MAIN_PAGE_SITE_FOOTER_COPYRIGHT_PATH = "//div[@data-id='323']/p/span[1]";
    public static final String MAIN_PAGE_SITE_FOOTER_COPYRIGHT_TEXT = "ООО «МирТехноЛайн»";

    public String getMainPageSiteFooterCopyrightText(){
        WebElement mainPageSiteFooterCopyrightWebElement = driver.findElement(By.xpath(HomePage.MAIN_PAGE_SITE_FOOTER_COPYRIGHT_PATH));
        new Actions(driver)
                .scrollToElement(mainPageSiteFooterCopyrightWebElement)
                .scrollByAmount(0, 100)
                .perform();

        String actual = mainPageSiteFooterCopyrightWebElement.getText();
        return actual;
    }
}
