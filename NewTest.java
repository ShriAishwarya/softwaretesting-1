package task1;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	@Test(priority=1)
	  public void TC_001() {
		 WebDriverManager.edgedriver().setup();
         WebDriver driver=new EdgeDriver();
         driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
         String title=driver.getTitle();
         System.out.println(title);
          Assert.assertEquals(title,"Guest Registeration Form - User Registration");
  }
}
