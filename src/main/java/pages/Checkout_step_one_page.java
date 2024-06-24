package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import base.Test_base;
import net.bytebuddy.asm.Advice.This;

public class Checkout_step_one_page extends Test_base
{
@FindBy(xpath = "//input[@id='first-name']")private WebElement firstNameTxtBox;
@FindBy(xpath = "//input[@id='last-name']") private WebElement lastNameTxtBox;
@FindBy(xpath = "//input[@id='postal-code']") private WebElement postalCodeBox;
@FindBy(xpath = "//input[@id='continue']")private WebElement continueBtn;
@FindBy(xpath = "//div[@class='app_logo']")private WebElement appLogoLabel;
@FindBy(xpath = "//span[@class='title']")private WebElement checkOutPageTitle;
@FindBy(xpath = "//button[@name='cancel']")private WebElement cancelBtn;

public  Checkout_step_one_page()
{
	PageFactory.initElements(driver,this);
}
public String checkOutPageInformation()
{
	firstNameTxtBox.sendKeys("Aniket");
	lastNameTxtBox.sendKeys("Chaudhari");
	postalCodeBox.sendKeys("425502");
	continueBtn.click();
	return driver.getCurrentUrl();
	

}
public void appLogoLabel()
{
	appLogoLabel.getText();
}
public void checkOutPageTitle()
{
	checkOutPageTitle.getText();
}

}
