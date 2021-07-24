package com.bdddemoqa.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshoot  {

	 public void Takescreenshoot(WebDriver driver, String Screenshoot_name) throws IOException {
		 
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/"+Screenshoot_name+".png"));
		 
	}
	

}
