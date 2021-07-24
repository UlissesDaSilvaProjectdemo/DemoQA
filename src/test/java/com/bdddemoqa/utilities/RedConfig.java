package com.bdddemoqa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RedConfig {
	
	Properties pro;
	public RedConfig() {
		File src = new File("./configuration/config.properties");
		try {
			FileInputStream fls = new FileInputStream(src);
			pro = new Properties();
			pro.load(fls);
		    } catch (IOException e) {
			System.out.println("Exception is: " + e.getMessage());
		}

	}
	  
	
	
	
	
	
	
 
	

	public String baseUrl() {
		String url=pro.getProperty("baseUrl");
		return url;
	} 
	public String username() {

		String username=pro.getProperty("username");
		return username;

	} 
	public String password() {
		String password=pro.getProperty("password");
		return password;

	} 

	public String ChromeDriver() {

		String ChromeDriver=pro.getProperty("ChromeDriver");
		return ChromeDriver;

	}
	public  String FirefoxDriver() {

		String FrieFoxDriver=pro.getProperty("FiireFoxDriver");
		return FrieFoxDriver;

	}
	
	public  String IEDriver() {

		String IEDriver=pro.getProperty("IEDriver");
		return IEDriver;

	}
	
	public String naviagetbackwards(){
		String navigateback=pro.getProperty("https://demoqa.com/");
		return navigateback;
	}


}
