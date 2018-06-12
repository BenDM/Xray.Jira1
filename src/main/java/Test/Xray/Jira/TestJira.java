package Test.Xray.Jira;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestJira {

	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		baseUrl = "http://www.google.de";

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

	@Test
	public void Test1() {
		Assert.assertTrue(true);
		ITestResult result = Reporter.getCurrentTestResult();
		result.setAttribute("test", "FT-7");
	}

	@Test
	public void Test2() {
		Assert.assertTrue(false);
		// ITestResult result = Reporter.getCurrentTestResult();
		// result.setAttribute("test", "FT-8");
	}

	@Test
	public void Test3() {
		Assert.assertTrue(true);
		// ITestResult result = Reporter.getCurrentTestResult();
		// result.setAttribute("test", "FT-9");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
