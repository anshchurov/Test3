package yandexTest.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.pages.MainPage;
import yandexTest.pages.MarketPage;

public class MarketSteps {

    private MarketPage marketPage = new MarketPage();

    @Step("Ввести минимальную цену телевизора, равную {0}")
    public void enterPrice(String price) {
        marketPage.setPriceInput(price);
    }

    @Step("Выбрать производителей")// круче с параметрами, но это пусть будет в кукумбере
    public void chooseCorp(){
        marketPage.setLgCheck();
        marketPage.setSumsungCheck();
    }

    @Step("Принять фильтры")
    public void applyFilters(){
        marketPage.setApplyBtn();
    }
}
