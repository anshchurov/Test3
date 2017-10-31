import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import yandexTest.steps.BaseSteps;
import yandexTest.steps.CheckingSteps;
import yandexTest.steps.MainSteps;
import yandexTest.steps.MarketSteps;

public class YaMarketTest extends BaseSteps{

    @Test
    //@Title("Проверка телевизора в маркете")
    public void Test(){

        MainSteps mainSteps = new MainSteps();
        MarketSteps marketSteps = new MarketSteps();
        CheckingSteps checkingSteps = new CheckingSteps();

        mainSteps.clickMarket();
        mainSteps.clickElectronic();
        mainSteps.clickTV();

        marketSteps.enterPrice("20000");
        String[] prodNames = {"Samsung", "LG"};
        marketSteps.chooseCorp(prodNames);
        marketSteps.applyFilters();

        checkingSteps.checkElements(12);
        checkingSteps.rememberTitle(0);
        checkingSteps.enterRememberedValue();
        checkingSteps.findProduct();
        checkingSteps.checkProductName();
    }
}
