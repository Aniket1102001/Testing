package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import base.Test_base;

public class Cart_page extends Test_base
{ 
// Object Repository
@FindBy(xpath = "//div[@class='app_logo']")private WebElement appLogo;
@FindBy(xpath = "//span[@class='title']")private WebElement title;
@FindBy(xpath = "//div[@class='cart_quantity_label']")private WebElement cartQuantityLabel;
@FindBy(xpath = "//button[@name='checkout']")private WebElement checkOutBtn;
@FindBy(xpath = "//button[@name='continue-shopping']")private WebElement continueShoppingBtn;
@FindBy(xpath = "//div[@class='cart_desc_label']")private WebElement cartDesclabel;
//Calling
public Cart_page()
{
	PageFactory.initElements(driver,this );
}
//Method
public String verifypagetitle()
{
	return title.getText() ;
	
}
public String  verifyapplogo()
{
	return appLogo.getText();
	
}
public String verifycartQuantityLabel()
{
	return cartQuantityLabel.getText();
	
}
public String ClickOnCheckoutBtn()
{
	checkOutBtn.click();
	return driver.getCurrentUrl();
	
}
public String continueShoppingBtn()
{
	continueShoppingBtn.click();
	return driver.getCurrentUrl();
}
public String cartDesclabel()
{
	return cartDesclabel.getText();
}



}













