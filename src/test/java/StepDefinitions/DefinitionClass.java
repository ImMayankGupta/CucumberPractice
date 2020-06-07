package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionClass {
	
	public WebDriver driver;
	
	@Given("^Open the application www\\.automationpracrtice\\.com$")
	public void open_the_application_www_automationpracrtice_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://senchatutorials.in/");
	}

	@When("^Search t-shirt$")
	public void search_t_shirt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^can see result$")
	public void can_see_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
