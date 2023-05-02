package day9;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day9_tc4 {
	WebDriver driver;
	  @Parameters("browsers")
	  @BeforeTest
	  public void browserSelection(String browser) {
	    if(browser.equalsIgnoreCase("chrome")) {
	    	WebDriverManager.edgedriver().setup();
	    	ChromeOptions co=new ChromeOptions();
	    	co.addArguments("--remote-allow-origins=*");
	    	driver=new ChromeDriver(co);
	    }
	    else if(browser.equalsIgnoreCase("edge")) {
	    	WebDriverManager.edgedriver().setup();
	    	driver =new EdgeDriver();
	    }
	  }
	  @Test
	  public void TC_001() {
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	  }
}
