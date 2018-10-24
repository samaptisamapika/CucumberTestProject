package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    protected WebDriver driver;

    AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    public abstract ExpectedCondition getPageLoadCondition();

    public void waitUntilLoaded() {
        int timeOut = 5;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(getPageLoadCondition());
    }
}
