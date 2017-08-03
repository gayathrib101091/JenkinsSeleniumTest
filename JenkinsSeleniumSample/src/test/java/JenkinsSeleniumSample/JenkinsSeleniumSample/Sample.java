package JenkinsSeleniumSample.JenkinsSeleniumSample;
	
	import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.firefox.FirefoxDriver;		
	import org.testng.Assert;		
	import org.testng.annotations.Test;	
	import org.testng.annotations.BeforeTest;	
	import org.testng.annotations.AfterTest;		
	public class Sample {		
		    public WebDriver driver;		
			@Test				
			public void testEasy() {	
				driver.get("https://www.flipkart.com");  
				String title = driver.getTitle();				 
				Assert.assertTrue(title.contains("Online Shopping India")); 	
				System.out.println("Test passed");
				System.out.println("1");
			}	
			@BeforeTest
			public void beforeTest() {	
			    driver = new FirefoxDriver();  
			}		
			@AfterTest
			public void afterTest() {
				driver.quit();			
			}		
	}	

