package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handle_dropdownlist 
{
   public static void handleselect(WebElement ele, String value)
   {
	   Select s = new Select(ele);
	   s.selectByVisibleText(value);
   }
}
