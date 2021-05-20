package automationPractice.Utils;

import automationPractice.Pages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utils<Public> extends BasePage {

    public static void waitForPageLoad() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }

    //Modified code
    public static boolean isDisplayed(WebElement element) {return element.isDisplayed();}
 }

