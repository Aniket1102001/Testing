package first_seleniumframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.checker.signature.qual.ClassGetName;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import base.Test_base;
import pages.Login_page;
import pages.inventory_page;
import utility.Readdata;
import utility.Screenshot;

public class Login_page_test extends Test_base 
{
Login_page login;
@BeforeMethod
public void setup() throws IOException
{
	initialization();
	login = new Login_page();
	

}
@Test
public void logintoApplicationtest() throws IOException
{
	String expurl = Readdata.readexcel(0, 0);//https://www.saucedemo.com/inventory.html(0,0)//
	String acturl = login.logintoApplication();
	Assert.assertEquals(expurl, acturl);
	Reporter.log("login succesfull = " + acturl);
}



@Test
public void verifyurlofapplicationtest() throws EncryptedDocumentException, IOException
{
	String expurl = Readdata.readexcel(0, 0);//"https://www.saucedemo.com/(0,1)//
	String acturl = login.verifyurlofapplication();
	Assert.assertEquals(expurl, acturl);
	
}


@Test
public void verifytitleofapplicationtest() throws EncryptedDocumentException, IOException
{
	String exptitle = Readdata.readexcel(0, 2);//Swag Labs(0,2)//
	String acttitle = login.verifytitleofapplication();
	Assert.assertEquals(exptitle, acttitle);
	
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
