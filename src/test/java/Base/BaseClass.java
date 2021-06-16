package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;
    public static final String BASE_URL ="https://www.chistee.sk/";

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe" );
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
