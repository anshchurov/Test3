package yandexTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yandexTest.steps.MarketSteps;

public class MarketPage extends BasePage{

    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceInput;

    @FindBy(xpath = "//label[@for='glf-7893318-153074']")
    public WebElement lgCheck;

    @FindBy(xpath = "//label[@for='glf-7893318-153061']")
    public WebElement samsungCheck;

    @FindBy(xpath = "//button[@class='button button_action_n-filter-apply button_size_s button_pseudo_yes button_theme_pseudo i-bem button_js_inited']")
    public WebElement applyBtn;

    public MarketPage() {
        PageFactory.initElements(driver, this);
    }

    public void setPriceInput(String price) {
        fillField(priceInput, price);
    }

    public void setLgCheck() {
        click(lgCheck);
    }

    public void setApplyBtn() {
        click(applyBtn);
    }

    public void setSumsungCheck() {

        click(samsungCheck);

    }
}
