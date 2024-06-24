package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import base.Test_base;

public class Complete_page extends Test_base 
{
@FindBy(xpath = "//div[@class='app_logo']")private WebElement appLogo;
@FindBy(xpath = "//span[@data-test='title']")private WebElement completePageTitle;
@FindBy(xpath = "//img[@class='pony_express']")private WebElement ponyExpressImg;
@FindBy(xpath = "//button[@id='back-to-products']") private WebElement backTOProductBtn;


public Complete_page ()
{
	PageFactory.initElements(driver, this);
	
}

public String completePageTitle()
{
	return completePageTitle.getText();
}
}
 




