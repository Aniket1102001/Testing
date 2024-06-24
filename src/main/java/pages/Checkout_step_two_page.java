package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import base.Test_base;

public class Checkout_step_two_page  extends Test_base
{
     @FindBy(xpath = "//div[@class='app_logo']")private WebElement appLogoLabel;
     @FindBy(xpath = "//span[@class='title']")private WebElement pageTitle;
     @FindBy(xpath = "//div[@class='cart_quantity_label']")private WebElement cartQuantityLabel;//QTY
     @FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement descLabel;//description
     @FindBy(xpath = "//div[@data-test='payment-info-label']") private WebElement paymentInfoLabel;
     @FindBy(xpath = "//div[@data-test='shipping-info-label']")private WebElement shippingInfoLabel;
     @FindBy(xpath = "//div[@data-test='total-info-label']")private WebElement totalInfoLabel;
     @FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement menuBtn;
     @FindBy(xpath = "//button[@id='cancel']") private WebElement cancelBtn;
     @FindBy(xpath = "//button[@id='finish']") private WebElement finishBtn;

     public Checkout_step_two_page()
     {
	      PageFactory.initElements(driver,this);
     }
     public String appLogoLabel()
     {
    	 return appLogoLabel.getText();
     }
     public String pageTitle()
     {
    	 return pageTitle.getText();
     }
     public String cartQuantityLabel()
     {
		return cartQuantityLabel.getText();
    	 
     }
     public String descLabel()
     {
		return descLabel.getText();
    	 
     }
     public String paymentInfoLabel()
     {
		return paymentInfoLabel.getText();
    	 
     }
     public String shippingInfoLabel()
     {
		return shippingInfoLabel.getText();
    	 
     }
     public String totalInfoLabel()
     {
		return totalInfoLabel.getText();
    	 
     }
     public boolean menuBtn()
     {
		 boolean Btn = menuBtn.isDisplayed();
		return Btn;
		    		
     }
     public String cancelBtn()
     {
    	 cancelBtn.click();
		return null;
     }
     public String finishBtn()
     {
    	 finishBtn.click();
		return driver.getCurrentUrl();
     }    
}    
    
     
     
     
     
     
     
     
     
     
     
     
     
