package yandexTest.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckingPage extends BasePage {


    @FindBy(xpath = "//div[@class='n-snippet-card2__title']" )
    public List<WebElement> products;

    @FindBy(id = "header-search")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findBtn;

    @FindBy(xpath = "//h1[@class='title title_size_28 title_bold_yes']")
    public WebElement productTitle;

    public CheckingPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean checkNitems(int productCount){
        return products.size() == productCount;
    }

    public String rememberProductForSearchBar(int productIndex){
        String productName = products.get(productIndex).findElement(By.xpath("./a")).getText();
        return productName;
    }

    public void enterRememberedProduct(String productName){
        fillField(searchInput, productName);
    }

    public void findProduct(){
        click(findBtn);
    }

    public void checkProductTitle(String rememberedTitle){
        Assert.assertEquals("Наименование товара не совпадает с введённым!",
                productTitle.getText(), rememberedTitle);
    }
}
