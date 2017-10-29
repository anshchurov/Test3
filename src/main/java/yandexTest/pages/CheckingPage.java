package yandexTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public boolean check12items(int productCount){
        return products.size() == productCount;
    }

    public void enterProductForSearchBar(int productIndex){
        productName = products.get(productIndex).findElement(By.xpath("./a")).getText();
        fillField(searchInput, productName);
    }

    public void findProduct(){
        click(findBtn);
    }


}
