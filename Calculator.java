package com.demo.example.sample2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Calculator {
	int a=10,b=2,c;
  @Test
  public void add() {
	  c=a+b;
	  Assert.assertEquals(12,c);
  }
  @Test
  public void sub() {
	  c=a-b;
	  Assert.assertEquals(8,c); 
  }
  @Test
  public void multi() {
	  c=a*b;
	  Assert.assertEquals(20,c);  
  }
  @Test
  public void div() {
	  c=a/b;
	  Assert.assertEquals(5,c);  
  }
}
