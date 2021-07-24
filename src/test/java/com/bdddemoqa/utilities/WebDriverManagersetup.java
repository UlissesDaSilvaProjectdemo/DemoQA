package com.bdddemoqa.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagersetup {
	
	public void setBrowserManager(){

	
		   WebDriverManager.chromedriver().setup();
		   WebDriverManager.firefoxdriver().setup();
		   WebDriverManager.edgedriver().setup();
		   WebDriverManager.operadriver().setup();
		   WebDriverManager.phantomjs().setup();
		   WebDriverManager.iedriver().setup();
		   WebDriverManager.chromiumdriver().setup();
		 
		
	}

}
