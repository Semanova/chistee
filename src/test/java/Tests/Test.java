package Tests;

import Base.BaseClass;
import Pages.ChisTeePage;
import org.openqa.selenium.WebDriver;

public class Test extends BaseClass {

    @org.junit.Test
    public void testChisteeePage() throws InterruptedException {
    ChisTeePage chisTeePage = new ChisTeePage();
        chisTeePage.openPage();
        chisTeePage.vyberRuky();
        chisTeePage.vyberProdukt();
        chisTeePage.supDoKosika();
        Thread.sleep(2000);
        chisTeePage.klikNaKosik();
    }


}
