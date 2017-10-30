package yandexTest.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.pages.MainPage;
import yandexTest.pages.MarketPage;

public class MarketSteps {

    @Step("Ввести минимальную цену телевизора, равную {0}")
    public void enterPrice(String price) {
        new MarketPage().setPriceInput(price);
    }

    @Step("Выбрать производителей")// круче с параметрами, но это пусть будет в кукумбере
    public void chooseCorp(){
        MarketPage marketPage = new MarketPage();
        marketPage.setLgCheck();
        marketPage.setSumsungCheck();
    }

    @Step("Принять фильтры")
    public void applyFilters(){
        new MarketPage().setApplyBtn();
    }
}
