package yandexTest.steps;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import yandexTest.utils.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    public WebDriver driver;
    public Properties properties = TestProperties.getInstance().getProperties();

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void before() throws Exception {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(properties.getProperty("app.url"));
    }
    @After
    public void after() {
        driver.quit();
    }
}
