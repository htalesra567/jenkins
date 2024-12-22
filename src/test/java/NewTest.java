import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
  
	  WebDriver driver = new ChromeDriver();
		
		driver.get("https://testpages.eviltester.com/styled/javascript-countdown-test.html");
	
	
		driver.findElement(By.xpath("/html/body/div/div[3]/div[3]/input")).sendKeys("10");
		Thread.sleep(1000);
		driver.findElement(By.id("reset-timer")).click();
  }
}
