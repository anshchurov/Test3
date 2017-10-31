package yandexTest.utils;

import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.junit.AllureRunListener;
import yandexTest.steps.BaseSteps;

/**
 * Created by 777 on 08.05.2017.
 */
public class AllureListener extends AllureRunListener {

    @Override
    public void testFailure(Failure failure){
        takeScreenshot();
        super.testFailure(failure);
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) BaseSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

}
