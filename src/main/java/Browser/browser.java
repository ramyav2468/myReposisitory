package Browser;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import demo.demolog;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static ExtentReports extents = new ExtentReports();
	public static ExtentHtmlReporter reporter = new ExtentHtmlReporter("./ExtentReports/extentreport1.html");

	public static WebDriver OpenBrowser() {
		demolog.sample(2);
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("open browser");
		logger.log(Status.INFO, "opening the browser");
		
		try {
			demolog.sample(1);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(50));
			
			logger.log(Status.PASS, "browser opened successfully");			
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			
			logger.log(Status.FAIL, "browser failed to open");
		}
		extents.flush();
		return driver;
	}

	public static void OpenURL(String web_url) {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("open the webpage");
		logger.log(Status.INFO, "opening the webpage");
		try {
			demolog.sample(1);
			driver.get(web_url);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
			logger.log(Status.PASS, "webpage opened successfully");
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "webpage failed to open");
		}
		extents.flush();
	}

	public static String GetTitle() {
			return driver.getTitle();
	}
		

	public static void BrowserClose() {
		extents.attachReporter(reporter);
		ExtentTest logger = extents.createTest("close the browser");
		logger.log(Status.INFO, "closing the browser");
		try {
			demolog.sample(1);
			driver.quit();
			logger.log(Status.PASS, "browser has been closed successfully");
			demolog.sample(5);
		} catch (Exception e) {
			demolog.sample(3);
			e.printStackTrace();
			logger.log(Status.FAIL, "browser failed to close");
		}
		extents.flush();
	}
}
