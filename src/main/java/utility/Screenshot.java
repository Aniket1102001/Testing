package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.github.dockerjava.api.model.Driver;

import base.Test_base;

public class Screenshot extends Test_base 
{
    // Date
	public static String getDate ()
	{
		return new SimpleDateFormat("DD-MM-YYYY ss-mm-HH").format(new Date());
		
	}
	// Screenshot
	public static void cs(String nameOfMethod) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\first_seleniumframework\\screenshort//"+nameOfMethod+""+getDate()+".jpeg");
		FileHandler.copy(source, dest);
	}
}
