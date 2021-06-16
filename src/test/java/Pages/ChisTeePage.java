package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.BaseClass.BASE_URL;

public class ChisTeePage extends BaseClass {

    @FindBy(xpath = "//li[@id = 'menu-item-955005370']")
    private WebElement rukyLink;

    @FindBy(xpath = "//a[@href = 'https://chistee.sk/hand-spray-lavender-50-ml/']")
    private WebElement produkt;

    @FindBy(xpath = "//button[@name = 'add-to-cart']")
    private WebElement doKosika;

    @FindBy(xpath = "//a[@title = 'Zobraziť košík']")
    private WebElement kosik;

    WebDriver driver;

    public ChisTeePage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    public void openPage(){
        driver.get(BASE_URL);
    }

    public void vyberRuky(){
        rukyLink.click();
    }

    public void vyberProdukt(){
        produkt.click();
    }

    public void supDoKosika(){
        doKosika.click();
    }

    public void klikNaKosik(){
        kosik.click();
    }
}
