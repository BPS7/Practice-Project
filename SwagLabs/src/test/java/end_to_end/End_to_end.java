package end_to_end;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End_to_end {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\SwagLabs\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//login
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//homepage and add item to cart
		WebElement staticDropDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select range = new Select(staticDropDown);
		       range.selectByIndex(3);
		Thread.sleep(5000);
		String[] itemsNeeded = {"Backpack"};		          
		List<String> itemneededList = Arrays.asList(itemsNeeded);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		Iterator<WebElement> productName = list.iterator();
		while(productName.hasNext()) {
			String item = productName.next().getText();
			 String[]Product= item.split(" ");
		       String x = Product[Product.length-1];
			if(itemneededList.contains(x)) {
				System.out.println("Product match found");
				driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			}
		}
	driver.findElement(By.id("shopping_cart_container")).click();
	//cartpage
	String cart = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
	Assert.assertTrue(true, cart);
	driver.findElement(By.id("checkout")).click();
	//CHECKOUT: YOUR INFORMATION
	driver.findElement(By.id("first-name")).sendKeys("Bhanu");
	driver.findElement(By.id("last-name")).sendKeys("Pratap");
	driver.findElement(By.id("postal-code")).sendKeys("462023");
	driver.findElement(By.id("continue")).click();
	//CHECKOUT: OVERVIEW
	String overview = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
	Assert.assertTrue(true, overview);
	driver.findElement(By.id("finish")).click();
	//Checkout complete
	String orderstatus = driver.findElement(By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']")).getText();
	System.out.println(orderstatus);
	Assert.assertEquals("THANK YOU FOR YOUR ORDER",orderstatus);
	//logout
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("logout_sidebar_link")).click();

	}}
