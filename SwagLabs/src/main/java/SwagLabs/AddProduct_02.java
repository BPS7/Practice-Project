package SwagLabs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProduct_02 {

	public  AddProduct_02(WebDriver driver){
		PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//div[@class='inventory_item_name']")
List<WebElement> listOfWebelement;
@FindBy(xpath = "//select[@class='product_sort_container']")
WebElement staticDropDown;
@FindBy(id = "add-to-cart-sauce-labs-backpack")
WebElement addtocart;
@FindBy(id="shopping_cart_container")
WebElement carticon;
	
public void addToProduct() throws InterruptedException {
	
	//WebElement staticDropDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	Select range = new Select(staticDropDown);
	       range.selectByIndex(3);
	Thread.sleep(5000);
	String[] itemsNeeded = {"Backpack"};		          
	List<String> itemneededList = Arrays.asList(itemsNeeded);
	//List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	Iterator<WebElement> productName = listOfWebelement.iterator();
	while(productName.hasNext()) {
		String item = productName.next().getText();
		 String[]Product= item.split(" ");
	       String x = Product[Product.length-1];
		if(itemneededList.contains(x)) {
			System.out.println("Product match found");
			addtocart.click();
			//driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		}
	}
}
//driver.findElement(By.id("shopping_cart_container")).click();
	public void cart() {
	carticon.click();
	
	}
}


