package first_seleniumframework;

import java.io.IOException;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Test_base;
import net.bytebuddy.asm.Advice.This;
import pages.Cart_page;
import pages.Checkout_step_one_page;
import pages.Login_page;
import pages.inventory_page;
import utility.Screenshot;

public class Checkout_step_one_page_test extends Test_base
{
	Login_page login;
	inventory_page invent ;
	Cart_page cart;
	Checkout_step_one_page check1;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		login = new Login_page();
		invent = new inventory_page();
		cart = new Cart_page();
		check1= new Checkout_step_one_page();
		login.logintoApplication();
        invent.add6product();
        invent.goToCart();
        cart.ClickOnCheckoutBtn();
	}
@Test
public void  checkOutPageInformationTest()
{
	String expURL = "https://www.saucedemo.com/checkout-step-two.html";
	String actURL = check1.checkOutPageInformation();
	Assert.assertEquals(expURL, actURL);
	Reporter.log("check out page Url is="+actURL);
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
