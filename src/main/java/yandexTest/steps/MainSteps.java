package yandexTest.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.pages.MainPage;

public class MainSteps {

    private MainPage mainPage = new MainPage();

    @Step("Выбрать маркет")
    public void clickMarket(){
        mainPage.setMarketBtn();
    }

    @Step("Выбрать раздел Электроника")
    public void clickElectronic(){
        mainPage.setElectricBtn();
    }

    @Step("Выбрать раздел Телевизоры")
    public void clickTV(){
        mainPage.setTvBtn();
    }
}
