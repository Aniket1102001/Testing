package first_seleniumframework;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Test_base;
import pages.Cart_page;
import pages.Checkout_step_one_page;
import pages.Checkout_step_two_page;
import pages.Complete_page;
import pages.Login_page;
import pages.inventory_page;
import utility.Screenshot;

public class Complete_page_test extends Test_base
{
	Login_page login;
	inventory_page invent ;
	Cart_page cart;
	Checkout_step_one_page check1;
	Checkout_step_two_page check2;
	Complete_page complete;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		login = new Login_page();
		invent = new inventory_page();
		cart = new Cart_page();
		check1= new Checkout_step_one_page();
		check2 = new Checkout_step_two_page();
		complete = new Complete_page();
		login.logintoApplication();
        invent.add6product();
        invent.goToCart();
        cart.ClickOnCheckoutBtn();
        check1.checkOutPageInformation();
        check2.finishBtn();
        
        
        
	}

@Test
public void completepagetitletest()
{
	String exptitle = "Checkout: Complete!";
	String acttitle = complete.completePageTitle();
	Assert.assertEquals(exptitle, acttitle);
	Reporter.log("complete page title is ="+acttitle);
}
@Test
public void 
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

