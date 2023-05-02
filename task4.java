package com.demo.example.sample2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class task4 {
  @Test
  public void login() {
	  System.out.println("Logged in succesfully");
	  Assert.assertEquals(10,5);
  }
  @Test(dependsOnMethods= {"Login"})
  public void logout()
  {
	  System.out.println("log out");
  }
  
}

/* public void login() {
System.out.println("Logged in succesfully");
Assert.assertEquals(10,5);
}
@Test(dependsOnMethods= {"Login"})
public void logout()
{
System.out.println("log out");
}
*/
