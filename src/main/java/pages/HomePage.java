package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends AbstractPage {

    @FindBy(css = ".logo")
    private WebElement raboLogo;

    @FindBy(css = ".page-header .customermenu a")
    private List<WebElement> customerMenuLinks;
    
    @FindBy(xpath="//div[@class='content']/h3[text()='Contact']")
    private WebElement contactUs;
    
    @FindBy(css=".s14-establishment>a")
    private WebElement contactusOption;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        waitUntilLoaded();
    }

    @Override
    public ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(raboLogo);
    }

    public Boolean isLogoVisible() {
        return raboLogo.isDisplayed();
    }

    public void toParticulieren() {
        customerMenuLinks.stream().filter(w -> w.getText().equals("Particulieren")).findFirst().ifPresent(WebElement::click);
    }
    
    public PrivateBankingPage toPrivateBanking() {
        customerMenuLinks.stream().filter(w -> w.getText().equals("Private Banking")).findFirst().ifPresent(WebElement::click);
        return new PrivateBankingPage(driver);
    }
    
    public BedrijvenPage toBedrijven() {
        customerMenuLinks.stream().filter(w -> w.getText().equals("Bedrijven")).findFirst().ifPresent(WebElement::click);
        return new BedrijvenPage(driver);
    }
    
    public boolean isContactUsSectionVisible() {
    	return contactUs.isDisplayed();
    }
    
    public boolean isContactOptionVisible(String option) {
    	 return contactusOption.getText().equalsIgnoreCase(option);
    }
}
