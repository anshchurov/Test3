import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import yandexTest.pages.CheckingPage;
import yandexTest.steps.BaseSteps;
import yandexTest.steps.CheckingSteps;
import yandexTest.steps.MainSteps;
import yandexTest.steps.MarketSteps;

public class YaMarketTest extends BaseSteps{

    @Test
    @Title("Проверка телевизора в маркете")
    public void Test(){
        MainSteps mainSteps = new MainSteps();
        MarketSteps marketSteps = new MarketSteps();
        CheckingSteps checkingSteps = new CheckingSteps();

        mainSteps.clickMarket();
        mainSteps.clickElectronic();
        mainSteps.clickTV();

        marketSteps.enterPrice("20000");
        marketSteps.chooseCorp();
        marketSteps.applyFilters();

        checkingSteps.checkElements(12);
        checkingSteps.rememberTitle(1);
        checkingSteps.enterRememberedValue();
        checkingSteps.findProduct();
        checkingSteps.checkProductName();
    }
}
