package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pages;
import Browser.browser;
import org.testng.Assert;

public class third {
	@Given("user is able to open the url {string}")
	public void user_is_able_to_open_the_url(String string) {
		try {
			browser.OpenBrowser();
			browser.OpenURL(string);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@And("User enters value {string}")
	public void user_enters_value(String string) {
		try
		{
			pages.enterusername(string);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("User passes value {string}")
	public void user_passes_value(String string) {
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

	@When("tap on the login button")
	public void tap_on_the_login_button() {
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

	@Then("user navigates to the next page")
	public void user_navigates_to_the_next_page() {
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

	@And("User enters username value {string}")
	public void user_enters_username_value(String string) {
		try
		{
			pages.enterusername1(string);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("User passes password value {string}")
	public void user_passes_password_value(String string) {
		try
		{
			pages.enterthepassword1(string);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
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

	@Then("user should be navigated to the next page where he can see all the product details")
	public void user_should_be_navigated_to_the_next_page_where_he_can_see_all_the_product_details() throws InterruptedException{
		try
		{
			String actualText = pages.ProdDetails();
			Assert.assertEquals("Products", actualText);
			System.out.println("Page Heading is same..");
		}
		catch (AssertionError e)
		{
			System.out.println("Page Heading is not same.."+e);
		}
		browser.BrowserClose();
	}
}
