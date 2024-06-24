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
import pages.Login_page;
import pages.inventory_page;
import utility.Screenshot;

public class Cart_page_test extends Test_base
{

Login_page login;
inventory_page invent ;
Cart_page cart;
@BeforeMethod
public void setup() throws IOException
{
	initialization();
	login = new Login_page();
	invent = new inventory_page();
	cart = new Cart_page();
	login.logintoApplication();
	invent.goToCart();
	
	
}	
	
@Test
public void verifypagetitleTest()
{
	String exptitle = "Your Cart";
	String acttitle = cart.verifypagetitle();
	Assert.assertEquals(exptitle, acttitle);
	Reporter.log("cart page title is ="+acttitle);
	
}
@Test
public void verifyapplogoTest()
{
	String exptitle = "Swag Labs";
	String acttitle = cart.verifyapplogo();
	Assert.assertEquals(exptitle, acttitle);
	Reporter.log("cart page app logo title is ="+acttitle);
}
@Test
public void verifycartQuantityLabelTest()
{
	String exptitle = "QTY";
	String acttitle = cart.verifycartQuantityLabel();
	Assert.assertEquals(exptitle, acttitle);
	Reporter.log("label of product quantity is="+acttitle);
	
}
@Test
public void cartDesclabel()
{
	String exptitle = "Description";
	String acttitle = cart.cartDesclabel();
	Assert.assertEquals(exptitle, acttitle);
	Reporter.log("label of product description="+acttitle);
	
	
}
@Test
public void clickonbtn()
{
	String expURL ="https://www.saucedemo.com/checkout-step-one.";
	String actURL = cart.ClickOnCheckoutBtn();
	Assert.assertEquals(expURL, actURL);
	Reporter.log("After clicking on checkout button get URL="+actURL);
}
@Test
public void continueShoppingBtn()
{
	String expURL ="https://www.saucedemo.com/inventory.html";
	String actURL = cart.continueShoppingBtn();
	Assert.assertEquals(expURL, actURL);
	Reporter.log("After clicking on continue shopping btn get URL="+actURL);
	
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





