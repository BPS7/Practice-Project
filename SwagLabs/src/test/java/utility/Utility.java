package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	static Properties prop;
	
	 public static void getScreenshot(String testID, WebDriver driver) throws IOException {
		 String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		   File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest=new File("C:\\Users\\hp\\Documents\\screenshot\\Chrome-"+timestamp+testID+".jpg");
         FileHandler.copy(src, dest);       
     }
	 
	 public static String getExceldata(String sheetName,int row, int column) throws EncryptedDocumentException, IOException {
		
			FileInputStream file = new FileInputStream("D:\\selenium\\SwagLabs\\Logindata\\swaglab.xlsx");
			String data=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
			return data;
		 
	 }
	 
	 public static void loginData() throws FileNotFoundException {
		 File src = new File("D:\\selenium\\SwagLabs\\Logindata\\login.properties");
		 
		 try {
			 FileInputStream file = new FileInputStream(src);
		     prop = new Properties();
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 public static String url() {
		 String url = prop.getProperty("url");
		 return url;
	}

}
