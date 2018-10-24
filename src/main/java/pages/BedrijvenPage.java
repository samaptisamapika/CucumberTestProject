package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BedrijvenPage {

    private WebDriver driver;
    private int timeOut = 10;

    private By financierenLink = By.xpath("//a[contains(text(), 'Financieren')]");

   


    public BedrijvenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void isBedrijvenElementVisible(){
        WebDriverWait waitTime = new WebDriverWait(driver,timeOut);
        waitTime.until(ExpectedConditions.presenceOfElementLocated(financierenLink));
        driver.findElement(financierenLink).isDisplayed();
    }

   
}
