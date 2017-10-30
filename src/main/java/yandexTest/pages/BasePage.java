package yandexTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void waiting(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    protected void click(WebElement element) {
        waiting(element);
        element.click();
    }


}
