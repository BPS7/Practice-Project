package framework.TestComponent;
import bankingguru99.testcase.Base_class;
import bankingguru99.testcase.Listnerclass;
import utilitiesOfbanking.Log;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import bankingguru99.AddnewCoustomer;
import bankingguru99.Confirmation;
import bankingguru99.DeleteCm;
import bankingguru99.EditCoustomer;
import bankingguru99.IframeHandle;
import bankingguru99.NewCm;
import bankingguru99.loginPage;
@Listeners(Listnerclass.class)
public class testclass extends Base_class {

	loginPage LP;
	AddnewCoustomer AddnewCoustomer;
	IframeHandle IframeHandle;
	NewCm NewCm ;
	Confirmation Confirmation ;
	EditCoustomer EditCoustomer;
	DeleteCm DeleteCm;
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		Log.info("url is opening");
		LP =new loginPage (driver);
		Log.info("enter userid");
		LP.setuserName(userID);
		Log.info("enter password");
		LP.setPassword(password);
		LP.submitButton();
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);	
		}	
	}
	@Test(dependsOnMethods={"loginTest"})
	public void addnewcustTest() throws InterruptedException {
		System.out.println("new customer");
		Thread.sleep(1000);
	    AddnewCoustomer = new AddnewCoustomer(driver);
		AddnewCoustomer.newCoustome();
		}
	@Test(dependsOnMethods={"addnewcustTest"})
	public void handleiframe() {
		IframeHandle = new IframeHandle(driver);
		IframeHandle.iframeH();
	}
	@Test(dependsOnMethods={"handleiframe"})
	public void createNewUSer() throws InterruptedException {
	 NewCm = new NewCm(driver);
	 Thread.sleep(2000);
	 NewCm.Name(name);
	 NewCm.Gender();
	 NewCm.Dob(dob);
	 NewCm.Addres(addres);
	 NewCm.City(city);
	 NewCm.State(state);
	 NewCm.Pin(pincode);
	 NewCm.Telephoneno(telephoneno);
	 NewCm.Email(email);
	 NewCm.Password(passwd);
	 NewCm.submitButton();
	 Thread.sleep(2000);
	 }
	@Test(dependsOnMethods={"createNewUSer"})
	public void confirmMessage() {
		Confirmation = new Confirmation(driver);
		Confirmation.heading();
	 Confirmation.id();
		 
		
	}
	@Test(dependsOnMethods={"confirmMessage"})
	public void EditCustomer() throws InterruptedException {
		
	 EditCoustomer = new EditCoustomer(driver);
	 EditCoustomer.editButton();
	 EditCoustomer.ID();
	 EditCoustomer.button();
	 EditCoustomer.changepin(changepin);
	 EditCoustomer.changemobileno(changepnum);
	 EditCoustomer.submitAfter();
	 EditCoustomer.alert();
	 
	
	}
	@Test(dependsOnMethods={"EditCustomer"})
	public void deleteCustomer() throws InterruptedException {
		 DeleteCm = new DeleteCm(driver);
		 DeleteCm.deleteCustomer();	
		 DeleteCm.userID();
		 DeleteCm.submit();
		 DeleteCm.alerts();
		 DeleteCm.logout();
		 DeleteCm.confirmlogout();
		
		
	}
}