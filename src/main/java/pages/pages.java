package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Browser.browser;
import demo.demolog;

public class pages extends browser {

	public static void enterusername(String user) {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("enter first username");
		logger.log(Status.INFO, "enter the username 1");
		try {
			demolog.sample(1);
			driver.findElement(By.id("user-name")).sendKeys(user);
			logger.log(Status.PASS, "username 1 has been entered successfully");
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "username 1 has not been entered");
		}
		extents.flush();
	}

	public static void enterthepassword(String pass) {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("enter first password");
		logger.log(Status.INFO, "enter the password 1");
		try {
			demolog.sample(1);
			driver.findElement(By.id("password")).sendKeys(pass);
			logger.log(Status.PASS, "password 1 has been entered successfully");
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "password 1 has not been entered");
		}
		extents.flush();
	}
	
	public static void enterusername1(String user) {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("enter second username");
		logger.log(Status.INFO, "enter the username 2");
		try {
			demolog.sample(1);
			driver.findElement(By.id("user-name")).sendKeys(user);
			logger.log(Status.PASS, "username 2 has been entered successfully");
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "username 2 has not been entered");
		}
		extents.flush();
	}

	public static void enterthepassword1(String pass) {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("enter second password");
		logger.log(Status.INFO, "enter the password 2");
		try {
			demolog.sample(1);
			driver.findElement(By.id("password")).sendKeys(pass);
			logger.log(Status.PASS, "password 2 has been entered successfully");
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
		}
	}

	public static void clickonloginbutton() {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("click on login");
		logger.log(Status.INFO, "click on login button");
		try {
			demolog.sample(1);
			driver.findElement(By.id("login-button")).click();
			logger.log(Status.PASS, "next page is loaded");
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "next page is not loaded");
		}
		extents.flush();
	}

	public static String usernavigatetheproductbacklogpage() throws InterruptedException {
		String abcde = driver.getTitle();
		return abcde;
	}
	
	public static String ProdDetails() throws InterruptedException
	{
		String text = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
		return text;
	}

}