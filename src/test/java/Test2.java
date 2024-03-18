import org.openqa.selenium.By;			
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;			
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;			

public class Test2 {		
    WebDriver driver;			

	    // Method 1: Open Brower say Firefox			
	    @Test		
	    public void openBrowser() {	
	    	
	    	WebDriver driver;

	        // TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAY MODHIYA\\OneDrive - MIT Art, Design & Technology University, Pune\\Documents\\Semister 6 (B. Tech IT)\\DevOps Lab\\selenium-java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			driver = new ChromeDriver();
				
	    }		

	    // Method 2: Launch Google.com			
	    @Test		
	    public void launchGoogle() {				
	        driver.get("http://www.google.co.in");						
	    }		
        
	    // Method 3: Perform a search using "Facebook"			
	    @Test		
	    public void peformSeachAndClick1stLink() {				
	        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");								
	    }		

	    // Method 4: Verify Google search page title.			
	    @Test		
	    public void FaceBookPageTitleVerification() throws Exception {				
	        driver.findElement(By.xpath(".//*[@value='Search']")).click();						
	        Thread.sleep(3000);		
	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);				
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