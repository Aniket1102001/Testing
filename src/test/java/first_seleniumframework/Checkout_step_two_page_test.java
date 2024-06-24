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
import pages.Login_page;
import pages.inventory_page;
import utility.Screenshot;

public class Checkout_step_two_page_test extends Test_base
{
	Login_page login;
	inventory_page invent ;
	Cart_page cart;
	Checkout_step_one_page check1;
	Checkout_step_two_page check2;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		login = new Login_page();
		invent = new inventory_page();
		cart = new Cart_page();
		check1= new Checkout_step_one_page();
		check2 = new Checkout_step_two_page();
		login.logintoApplication();
        invent.add6product();
        invent.goToCart();
        cart.ClickOnCheckoutBtn();
        check1.checkOutPageInformation();
}
	@Test
	public void appLogoLabel()
	{
		String exptitle = "Swag Labs";
		String acttitle = check2.appLogoLabel();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two label is="+acttitle);
	}
	@Test
	public void pageTitle()
	{
		String exptitle = "Checkout: Overview";
		String acttitle = check2.pageTitle();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two title is="+acttitle);
	}
	@Test
	public void cartQuantityLabel()
	{
		String exptitle ="QTY";
		String acttitle = check2.cartQuantityLabel();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two label is="+acttitle);
	}
	@Test
	public void descLabel()
	{
		String exptitle ="Description";
		String acttitle = check2.descLabel();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two label is="+acttitle);
	}
	@Test
	public void paymentInfoLabel()
	{
		String exptitle ="Payment Information:";
		String acttitle = check2.paymentInfoLabel();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two label is="+acttitle);
	}
	@Test
	public void shippingInfoLabel()
	{
		String exptitle ="Shipping Information:";
		String acttitle = check2.shippingInfoLabel();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two label is="+acttitle);
	}
	@Test
	public void totalInfoLabel()
	{
		String exptitle ="Price Total";
		String acttitle = check2.totalInfoLabel();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("check out page two label is="+acttitle);
	}
	@Test
	public void finishBtn()
	{
		String expURL = "https://www.saucedemo.com/checkout-complete.html";
		String actURL = check2.finishBtn();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("checkout complete page Url is ="+actURL);
	}
	@Test
	public void menuBtn()
	{
	    boolean result = check2.menuBtn();
	    Assert.assertEquals(result, true);
	    Reporter.log("menu button is present");
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
	
	
	
	
	
	
