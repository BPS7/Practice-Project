package test.components;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import SwagLabs.Login_01;
import SwagLabs.Logout_class_07;
import SwagLabs.AddProduct_02;
import SwagLabs.C_complete_06;
import SwagLabs.C_overview_05;
import SwagLabs.Cartpage_03;
import SwagLabs.Enter_information_04;
import utility.BaseClass;
import utility.Utility;

public class Login_test_001 extends BaseClass   {
	String TestID;
	Login_01 lg;
	AddProduct_02 ap;
	Cartpage_03 cp;
	Enter_information_04 ei;
	C_overview_05 co;
	C_complete_06 cc ;
	Logout_class_07 lgc;
	   String username ;
	   String passwo ;
	   String url;
	@Test
	public void login_test_01() throws EncryptedDocumentException, IOException {
   TestID="-TestID-01";
   username = Utility.getExceldata("SwagLabs",1,1);
   passwo = Utility.getExceldata("SwagLabs",1,2);
   Utility.loginData();
   url=Utility.url();
   lg = new Login_01(driver);
   lg.baseurl(url);
   lg.username(username);
   lg.passw(passwo);
   lg.submit();
}
	
	@Test(dependsOnMethods = "login_test_01")
	public void addtoCart_02() throws InterruptedException {
		TestID="-TestID-02";
	    ap = new AddProduct_02(driver);
		ap.addToProduct();
		ap.cart();	
	}
	@Test(dependsOnMethods = "addtoCart_02")
	public void cartPage_03() {
		TestID="-TestID-03";
		cp = new Cartpage_03(driver);
		cp.inventoryItem();
		cp.checkOut();
	}
	@Test(dependsOnMethods = "cartPage_03")
	public void enterInformation_04() {
		TestID="-TestID-04";
	    ei=new Enter_information_04(driver);
		ei.firstname();
		ei.lastname();
		ei.postalCode();
		ei.continueButton();
	}
	@Test(dependsOnMethods = "enterInformation_04")
	public void overview_05() {
		TestID="-TestID-05";
		co= new C_overview_05(driver);
		co.overview();
		co.finish();
	}
	@Test(dependsOnMethods = "overview_05")
	public void complete_06() {
		TestID="-TestID-06";
		cc = new C_complete_06(driver);
		cc.orderstatus();
	
	}
	@Test(dependsOnMethods = "complete_06")
	public void logout_07() throws InterruptedException {
		TestID="-TestID-07";
		lgc= new Logout_class_07(driver);
		lgc.Logout();
	}
	@AfterMethod
	public void onTestFailure(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.getScreenshot(TestID, driver);
		}

	}
	
}
