package day9;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//day 9 = task 2 and 3

public class day9_tc2 {
	WebDriver driver;
	  @Test
	  public void tc_001() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
		  
	  }
	  @Test
	  public void tc_002() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
	  }
	  @Test
	  public void tc_003() {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  driver.get("https://www.godaddy.com/en-in");
		  driver.manage().window().maximize();
	  }
}


