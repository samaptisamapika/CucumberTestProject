package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrivateBankingPage {

    private WebDriver driver;
    private int timeOut = 10;

    private By vermogensLink = By.xpath("//a[contains(text(), 'Vermogens- management')]");

   


    public PrivateBankingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void isPrivateBankingElementVisible(){
        WebDriverWait waitTime = new WebDriverWait(driver,timeOut);
        waitTime.until(ExpectedConditions.visibilityOf(driver.findElement(vermogensLink)));
        driver.findElement(vermogensLink).isDisplayed();
    }

   
}
