package yandexTest.steps;

import ru.yandex.qatools.allure.annotations.Step;
import yandexTest.pages.CheckingPage;

public class CheckingSteps {

    private String rememberedTitle;

    @Step("Проверить, что элементов на странице {0}")
    public void checkElements(int elementCount) {
        if (!(new CheckingPage().checkNitems(elementCount)))
            System.out.println(String.format("Элементов не %s !!!", elementCount));
    }

    @Step("Запомнить {0}-й элемент в списке")
    public void rememberTitle(int productIndex){
        rememberedTitle = new CheckingPage().rememberProductForSearchBar(productIndex);
    }

    @Step("Ввести запомненное значение в поисковую строку")
    public void enterRememberedValue(){
        new CheckingPage().enterRememberedProduct(rememberedTitle);
    }

    @Step("Найти товар")
    public void findProduct(){
        new CheckingPage().findProduct();
    }

    @Step("Проверить что наименование товара соответствует запомненному значению")
    public void checkProductName(){
        new CheckingPage().checkProductTitle(rememberedTitle);
    }
}
