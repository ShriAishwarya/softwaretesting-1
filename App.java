package com.demo.example.sample;
// day 4 task 1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
        
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Aishwaryas");
       driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Prabhu");
       driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aish@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("aish@123");
       
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
    
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
 
    }
}
