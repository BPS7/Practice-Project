package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TextTEst  {
	JavascriptExecutor js;
	 WebDriverWait wait;
	 WebDriver driver;
	@BeforeTest
	public void intiallize_browser() {
		 		 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	 driver = new ChromeDriver();	
	 driver.manage().window().maximize();
	 
	 }
	@Test
	public void test() throws InterruptedException, MalformedURLException, IOException {
	 driver.get("https://demoqa.com/elements");
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,300)");
	 //windowhandles
	 driver.findElement(By.xpath("(//div[@class='icon'])[1]"));
	 driver.findElement(By.xpath("//span[text()='Links']")).click();
	 driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
	 Set<String> window = driver.getWindowHandles();
	            Iterator<String> id = window.iterator();
	            String parentID = id.next();
	            String childID = id.next();
	            System.out.println(driver.switchTo().window(childID).getCurrentUrl());
	            driver.close();
	            driver.switchTo().window(parentID);
	            driver.findElement(By.cssSelector("a[id='created']")).click();
	            Thread.sleep(2000);
	            System.out.println(driver.findElement(By.cssSelector("p[id='linkResponse']")).getText());
	       	    js.executeScript("window.scrollBy(0,500)");
	       	//broken link
	            driver.findElement(By.xpath("//span[text()='Broken Links - Images']")).click();
	            Thread.sleep(2000);
	            js.executeScript("window.scrollBy(0,300)");
	            WebElement link = driver.findElement(By.xpath("//a[text()='Click Here for Broken Link']"));
	            SoftAssert a =new SoftAssert();
	  	          String url= link.getAttribute("href");
	  	          System.out.println(url);
	  	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
	  	          conn.setRequestMethod("HEAD");
	  	          conn.connect();
	  	          int respCode = conn.getResponseCode();
	  	          System.out.println(respCode);    
	  	          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);        
	  	 //broken images
	  	        List<WebElement> images = driver.findElements(By.tagName("img"));
	  	        System.out.println("Total number of Images on the Page are " + images.size());	
	  	        for(WebElement image:images) {
	  	        	String imageUrl = image.getAttribute("src");
	  	        	URL urlimg = new URL(imageUrl);
	  	            HttpURLConnection httpURLConnect=(HttpURLConnection)urlimg.openConnection();
	  	            httpURLConnect.setConnectTimeout(5000);
	  	            httpURLConnect.connect();
	  	          if(httpURLConnect.getResponseCode()>=400)
	              {
	              	System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
	              }    
	              else{
	                  System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
	              } 
	  	          
	  	        try {
	                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
	                if (imageDisplayed) {
	                    System.out.println("DISPLAY - OK");
	                }
	                else {
	                	System.out.println(imageUrl);
	                     System.out.println("DISPLAY - BROKEN");
	                }
	            } 
	            catch (Exception e) {
	            	System.out.println("Error Occured");
	            }
	  	        }
 
      //Buttons              	 
	   driver.findElement(By.xpath("//span[text()='Buttons']")).click();
	   Thread.sleep(2000);
	   Actions cursor = new Actions(driver);
	   cursor.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().build().perform();
	   Thread.sleep(2000);
	   System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
	   cursor.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().build().perform();
	   Thread.sleep(2000);
	   System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
	   Thread.sleep(2000);
	   //Dyanamic Properties
	  // js.executeScript("window.scrollBy(0,450)");
	   WebElement scroll = driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
	   js.executeScript("arguments[0].scrollIntoView(true)", scroll);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[text()='Dynamic Properties']")).click();
	    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("enableAfter"))));
	   System.out.println(driver.findElement(By.id("enableAfter")).isEnabled());
	    System.out.println(driver.findElement(By.id("colorChange")).getText());
	}
	@AfterTest
	public void tear_down() {
		driver.quit();
	    	

	}
}