package yandexTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import yandexTest.steps.BaseSteps;

public class BasePage {

    WebDriver driver = BaseSteps.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void waiting(WebElement element) {
        Wait<WebDriver>wait = new WebDriverWait(driver, 5, 1000);
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
