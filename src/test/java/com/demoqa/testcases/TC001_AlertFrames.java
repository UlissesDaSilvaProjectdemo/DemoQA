package com.demoqa.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bdddemoqa.utilities.BrowserFactory;
import com.demoqa.pages.AlertPages;

public class TC001_AlertFrames extends BrowserFactory{

	AlertPages lertpages = new AlertPages(driver);

	@Test
	public void TC001_AlertFramesTest() {
		lertpages.setBrowserFactory();
		lertpages.naviagatetoalertBrowserWindow();
		lertpages.Browser_NewWindow_Message();
		lertpages.Browser_Windonw_NewWindow();
		lertpages.On_click__Button_to_see_alert();
		lertpages.On_click_alert_will_appear_after5_seconds();
		lertpages.On_click_prompt_box_will_appear();
		lertpages.Browser_Windonw_NewTab();
		lertpages.Frames();
		lertpages.NestedFrames();
		lertpages.ModalDialogs_Large_Modal();
		lertpages.ModalDialogs_Samll_Modal();
		lertpages.quitbrowser();
		
		



	}


	 


}