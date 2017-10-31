package yandexTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.steps.MarketSteps;

import java.util.List;

import static com.google.common.collect.FluentIterable.from;

public class MarketPage extends BasePage{

    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceInput;

    @FindBy(xpath = "//button[@class='button button_action_n-filter-apply button_size_s button_pseudo_yes button_theme_pseudo i-bem button_js_inited']")
    public WebElement applyBtn;

    @FindBy(xpath = "(//div[@class='n-filter-block__list-items i-bem'])[1]")
    public WebElement prodCheck;

    public MarketPage() {
        PageFactory.initElements(driver, this);
    }

    public void setPriceInput(String price) {
        fillField(priceInput, price);
    }

    public void setApplyBtn() {
        click(applyBtn);
    }

    public void setProdCheck(String prodName){
        for( WebElement elem : prodCheck.findElements(By.xpath("./div")))
            if (elem.getText().equals(prodName))
                click(elem);
    }
}
