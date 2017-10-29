package yandexTest.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.pages.MainPage;

public class MainSteps extends BaseSteps {

    @Step("Выбрать маркет")
    public void clickMarket(){
        new MainPage().setMarketBtn();
    }

    @Step("Выбрать раздел Электроника")
    public void clickElectronic(){
        new MainPage().setElectricBtn();
    }

    @Step("Выбрать раздел Телевизоры")
    public void clickTV(){
        new MainPage().setTvBtn();
    }
}
