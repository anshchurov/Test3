package yandexTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    @FindBy(xpath = "data-id='market'")
    public WebElement marketBtn;

    @FindBy(xpath = "//a[@class='link topmenu__link'][text()='Электроника']")
    public WebElement electricBtn;

    @FindBy(xpath = "//a[@class='link catalog-menu__list-item metrika i-bem metrika_js_inited'][text()='Телевизоры']")
    public WebElement tvBtn;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void setMarketBtn() {
        click(marketBtn);
    }

    public void setElectricBtn() {
        click(electricBtn);
    }

    public void setTvBtn() {
        click(tvBtn);
    }
}