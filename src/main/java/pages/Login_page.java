package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Test_base;
import utility.Readdata;

public class Login_page extends Test_base 
{
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UserTxtBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement PassWordTxtBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	public Login_page()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String logintoApplication() throws IOException
	{
		UserTxtBox.sendKeys(Readdata.readpropertyfile("Username"));
		PassWordTxtBox.sendKeys(Readdata.readpropertyfile("Password"));
		loginBtn.click();
		return driver.getCurrentUrl();
		
	}
	public String verifyMultiCredentials(String un,String password)
	{
		UserTxtBox.sendKeys(un);
		PassWordTxtBox.sendKeys(password);
		loginBtn.click();
		return driver.getCurrentUrl();
	}
	
	
    public String verifyurlofapplication()
    {
    	return driver.getCurrentUrl();
    }
    public String verifytitleofapplication()
    {
    	return driver.getTitle();
    }
}
