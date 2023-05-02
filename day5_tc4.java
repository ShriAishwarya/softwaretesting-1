package com.demo.example.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_tc4 {
	public static void main( String[] args )
    {
     WebDriverManager.edgedriver().setup();
     WebDriver driver=new EdgeDriver();
     String url="https://www.abhibus.com/bus-ticket-booking";
     driver.get(url);
     driver.manage().window().maximize();y
     WebElement source=driver.findElement(By.xpath("//*[@id=\"source\"]"));
     source.sendKeys("Coimbatore",Keys.ENTER);
     WebElement destination=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
     destination.sendKeys("Chennai",Keys.ENTER);
     WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
     date.click();
     JavascriptExecutor js=(JavascriptExecutor)driver;
     js.executeScript(,date); 
    }

}
