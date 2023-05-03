package day10;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day10_tc4 {
		WebDriver driver;
		// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter("user/build/name/");
		ExtentReports extent = new ExtentReports();
	     static ExtentTest test;

	  
	@Parameters("browser")
	  @BeforeMethod()
	  public void browserSelection(String browser) {
		  extent.attachReporter(spark);
	      spark.config().setDocumentTitle("My testing document");
	      spark.config().setReportName("My test reports");
	      spark.config().setTheme(Theme.DARK);
	    if(browser.equals("edge")) {
	    	WebDriverManager.edgedriver().setup();
	    	//ChromeOptions co=new ChromeOptions();
	    	//co.addArguments("--remote-allow-origins=*");
	    	driver=new EdgeDriver();
	    	driver.manage().window().maximize();
	    	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    	driver.get(url);
	    	driver.manage().window().maximize();
	    }
	    else if(browser.equalsIgnoreCase("chrome")) {
	    	//WebDriverManager.edgedriver().setup();
	    	driver =new ChromeDriver();
	    	driver.manage().window().maximize();
	    	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  	  driver.manage().window().maximize();
	  	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    }
	  }
	  @Test
	  public void TC_001() throws InterruptedException {
		  Thread.sleep(3000);
		  WebElement uname=driver.findElement(By.name("username"));
		  WebElement pwd=driver.findElement(By.name("password"));
		  WebElement submit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		  uname.sendKeys("Admin");
		  pwd.sendKeys("admin123");
		  submit.click();
		  test=extent.createTest("TC_001","Test case for checking login using correct loging and password");
		  //test.log(Status.PASS);
		  
	  }
	  @Test
	  public void TC_002() {
		  test=extent.createTest("TC_002","this is second test case");
	  }
	  @AfterMethod()
	  public void afterMethod(ITestResult result) throws AWTException, IOException{
		  if(result.getStatus()==ITestResult.FAILURE) {
			  test.log(Status.FAIL,result.getName());
		  }
		  else if(result.getStatus()==ITestResult.SUCCESS) {
			  test.log(Status.PASS,result.getName());
		  }
		  else {
			  test.log(Status.SKIP,result.getName());
		  }
	  }
	  @AfterSuite
	  public void afterMethod() {
		  extent.flush();
	  }
	
  }

