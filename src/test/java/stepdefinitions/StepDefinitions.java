package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.AssertionFailedError;
import org.openqa.selenium.WebDriver;

import pages.BedrijvenPage;
import pages.HomePage;
import pages.ParticulierenPage;
import pages.PrivateBankingPage;
import pages.SearchModule;

import static org.junit.Assert.assertTrue;

public class StepDefinitions {
	private WebDriver driver;
	HomePage homePage;
	BedrijvenPage bedrijvenPage;
	public StepDefinitions() {
		this.driver = DriverManager.driver;
	}

	@Given("^I am on the Rabobank homepage$")
	public void onHomePage() {
		homePage = new HomePage(driver);
		assertTrue("Expecting the Rabobank logo to be visible", homePage.isLogoVisible());
	}

	@Given("^I navigate to particulieren$")
	public void toParticulieren() {

		ParticulierenPage particulierenPage = new ParticulierenPage(driver);
		homePage.toParticulieren();
		particulierenPage.isParticulierenElementVisible();
	}

	@When("^I navigate to particulieren page$")
	public void i_navigate_to_particulieren_page() {
		ParticulierenPage particulierenPage = new ParticulierenPage(driver);
		homePage.toParticulieren();
		particulierenPage.isParticulierenElementVisible();
	}
	@When("^I search for (.*)$")
	public void searchFor(String searchTerm) {
		ParticulierenPage particulierenPage = new ParticulierenPage(driver);
		particulierenPage.enterValueInSearchField(searchTerm);
	}

	@Then("^searchresults contain page with title (.*)$")
	public void searchResultContains(String title) throws InterruptedException {
		SearchModule searchModule = new SearchModule(driver);
		searchModule.checkAndClickThroughCookieWall();
		if (searchModule.searchModuleElementIsVisible()) {
			assertTrue("Search results did not contain " + title, searchModule.searchResults(title));
		} else
			throw new AssertionFailedError("Unable to find search results");
	}

	@When("^I select (.*) to filter the search results$")
	public void filterSearchResultsByType(String filterValue) {
		SearchModule searchModule = new SearchModule(driver);
		searchModule.selectDropDownValue(filterValue);
	}

	@Then("^I should be able to validate Contact us Section$")
	public void i_should_be_able_to_validate_Contact_us_Section() {
		assertTrue(homePage.isContactUsSectionVisible());
	}

	@When("^I navigate to Private banking page$")
	public void i_navigate_to_Personal_banking_page() {

		PrivateBankingPage privateBanking = homePage.toPrivateBanking();
		privateBanking.isPrivateBankingElementVisible();
	}

	@When("^I navigate to bedrijven page$")
	public void i_navigate_to_bedrijven_page() {

		BedrijvenPage bedrijvenPage = homePage.toBedrijven();
		bedrijvenPage.isBedrijvenElementVisible();
	}
	
	@Then("^\"([^\"]*)\" option should be there in Contacts$")
	public void option_should_be_there_in_Contacts(String option) {
	   assertTrue(homePage.isContactOptionVisible(option));
	}
}
