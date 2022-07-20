package stepdefinition;

import org.testng.Assert;

import Browser.browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class first {
	@Given("open the browser")
	public void open_the_browser() {
		try {
			browser.OpenBrowser();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("enter the {string}")
	public void enter_the(String string) {
		try {
			browser.OpenURL(string);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("page is displayed")
	public void page_is_displayed() throws InterruptedException {
		try {
			String actualTitle = browser.GetTitle();
			Assert.assertEquals("Swag Labs", actualTitle);
			Thread.sleep(3000);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
		browser.BrowserClose();
	}
}
