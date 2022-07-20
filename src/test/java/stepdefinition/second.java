package stepdefinition;

import Browser.browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pages;

public class second {
	@Given("user on the webpage {string}")
	public void user_on_the_webpage(String string) {
		try {
			browser.OpenBrowser();
			browser.OpenURL(string);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@And("user gives username as {string}")
	public void user_gives_username_as(String string) {
		try
		{
			pages.enterusername(string);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("user gives password as {string}")
	public void user_gives_password_as(String string) {
		try
		{
			pages.enterthepassword(string);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@When("click on the LoginButton")
	public void click_on_the_login_button() {
		try
		{
			pages.clickonloginbutton();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("user navigates to product backlog page")
	public void user_navigates_to_product_backlog_page() throws InterruptedException{
		try
		{
			pages.usernavigatetheproductbacklogpage();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		browser.BrowserClose();
	}
	
}
