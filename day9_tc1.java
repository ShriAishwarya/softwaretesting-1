package day9;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
// day 9= task 1
public class day9_tc1 {
  @Test(dataProvider="dp",priority=1)
  public void add(int n1,int n2,int expected) {
     int actual=n1+n2;
     Assert.assertEquals(expected,actual);
  }
  @Test
  public void sub(int n1,int n2,int expected) {
	  int actual=n1-n2;
	  Assert.assertEquals(expected,actual);
	  
  }
  @DataProvider
  public Object[][] dp(){
	  return new Object[][] {
		  new Object[] {1,2,3},
		  new Object[] {2,3,5},
		  new Object[] {4,2,2}
	  };
  }
}
