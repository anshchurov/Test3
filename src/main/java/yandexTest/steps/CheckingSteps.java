package yandexTest.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.pages.CheckingPage;

public class CheckingSteps {

    private String rememberedTitle;
    private CheckingPage checkingPage = new CheckingPage();

    @Step("Проверить, что элементов на странице {0}")
    public void checkElements(int elementCount) {
        if (!(checkingPage.checkNitems(elementCount)))
            System.out.println(String.format("Элементов не %s !!!", elementCount));
    }

    @Step("Запомнить {0}-й элемент в списке")
    public void rememberTitle(int productIndex){
        rememberedTitle = checkingPage.rememberProductForSearchBar(productIndex);
    }

    @Step("Ввести запомненное значение в поисковую строку")
    public void enterRememberedValue(){
        checkingPage.enterRememberedProduct(rememberedTitle);
    }

    @Step("Найти товар ")
    public void findProduct(){
        checkingPage.findProduct();
    }

    @Step("Проверить что наименование товара соответствует запомненному значению")
    public void checkProductName(){
        checkingPage.checkProductTitle(rememberedTitle);
    }
}
