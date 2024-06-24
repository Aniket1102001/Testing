package first_seleniumframework;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Test_base;
import pages.Login_page;
import utility.Screenshot;

public class Verifymulticredstest extends Test_base
{
	Login_page login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		login = new Login_page();
		

	}
	@DataProvider(name = "validation")
	public Object [][] getData()
	{
		return new Object [][]
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"}
				};
		
	}
	@Test(dataProvider = "validation")
	public void verifyMultiCredentialtest(String un,String password)
	{
		SoftAssert s = new SoftAssert();
		String expURL = "https://www.saucedemo.com/inventory.html";
		String actURL = login.verifyMultiCredentials(un, password);
		s.assertEquals(expURL, actURL);
		s.assertAll();
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
