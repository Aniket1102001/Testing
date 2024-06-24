package first_seleniumframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.google.common.util.concurrent.AbstractScheduledService;

import base.Test_base;
import pages.Login_page;
import pages.inventory_page;
import utility.Readdata;
import utility.Screenshot;

public class inventory_page_test extends Test_base
{
Login_page login;
inventory_page invent ;
@BeforeMethod
public void setup() throws IOException
{
	initialization();
	login = new Login_page();
	invent = new inventory_page();
	login.logintoApplication();
}
    @Test
    public void verifytwitterlogo()
    {
    	 boolean result = invent.verifytwitterlogo();
    	 Assert.assertEquals(result, true);
    	 Reporter.log("twitter logo is present = "  + result);
    	 
    	
    }
    
    
    @Test
    public void add6product() throws EncryptedDocumentException, IOException 
    {
    	String expcount = Readdata.readexcel(0, 3);//6//(0,3)//
    	String actcount = invent.add6product();
    	Reporter.log("total products add to cart ="+actcount);
    	Assert.assertEquals(expcount,actcount);
    }
    @Test
    public void remove2productstest() throws EncryptedDocumentException, IOException 
    {
    	String expcount = Readdata.readexcel(0, 4);//4//(0,4)//
    	String actcount = invent.remove2products();
    	Assert.assertEquals(expcount,actcount);
    	Reporter.log("total products after remove to cart = "+ actcount);
    	
    }
    @Test
    public void verifypagetitle() throws EncryptedDocumentException, IOException
    {
    	String exptitle = Readdata.readexcel(0, 5);//Products(0,5) //			
    	String acttitle = invent.verifypagetitle();
    	Assert.assertEquals(exptitle, acttitle);
    	Reporter.log("inventory page title is ="+acttitle);
    }
    @Test
    public void goToCartTest()
    {
    	String expURL = "https://www.saucedemo.com/cart.html";
    	String actURL = invent.goToCart();
    	Assert.assertEquals(expURL, actURL);
    	Reporter.log("cart page URL ="+actURL);
    }
    @AfterMethod
    public void closebrowser (ITestResult it) throws IOException

    {
    	if(it.FAILURE == it.getStatus())
    	{
    		Screenshot.cs(it.getName());
    	}
    	driver.close();
}
}
