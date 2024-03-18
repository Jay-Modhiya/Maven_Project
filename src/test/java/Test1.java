	


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class Test1 {		
	    private WebDriver driver;		
		@Test		
		public void testEasy() {
			WebDriver driver;

	        // TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAY MODHIYA\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Semister 6 (B. Tech IT)\\DevOps Lab\\selenium-java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			driver = new ChromeDriver();

	        

			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAY MODHIYA\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Semister 6 (B. Tech IT)\\DevOps Lab\\selenium-java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			driver = new ChromeDriver();
			  
		   
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}
