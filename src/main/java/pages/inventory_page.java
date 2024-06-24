package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Test_base;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utility.Handle_dropdownlist;

public class inventory_page extends Test_base
{
    //object repository 
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']")private WebElement backpackbtn;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bike-light']")private WebElement bikelightbtn;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement bolttshirt;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-fleece-jacket']")private WebElement jacket;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-onesie']")private WebElement onesie;
	@FindBy(xpath = "//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement tshirtred;
	@FindBy(xpath = "//span[@class='title']")private WebElement pagetitle;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement carticon;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")private WebElement cartcount;
	@FindBy(xpath = "//a[text()='Twitter']")private WebElement twitterlogo;
	@FindBy(xpath = "//select[@class='product_sort_container']")private WebElement dropdown;
	@FindBy(xpath = "//button[@name='remove-sauce-labs-bolt-t-shirt']") private WebElement removebolttshirt;
	@FindBy(xpath ="//button[@name='remove-sauce-labs-fleece-jacket']") private WebElement removejacket;
	//calling
	public inventory_page ()
	{
		PageFactory.initElements(driver, this);
	}
	//method
	public String verifypagetitle()
	{
		return pagetitle.getText() ;
		
	}
	public boolean verifytwitterlogo()
	{
		return twitterlogo.isDisplayed();
		
	}
	public String add6product()
	{
		Handle_dropdownlist.handleselect(dropdown, "Price (low to high)");
		backpackbtn.click();
		bikelightbtn.click();
		bolttshirt.click();
		jacket.click();
		onesie.click();
		tshirtred.click();
		return carticon.getText();
	}
	public String remove2products()
	
	{
		add6product();
		removebolttshirt.click();
		removejacket.click();
		return cartcount.getText();
	}
	public String goToCart()
	{
		carticon.click();
		return null;
		
		
	}
}
