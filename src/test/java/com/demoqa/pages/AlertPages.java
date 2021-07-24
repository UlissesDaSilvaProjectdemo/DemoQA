package com.demoqa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bdddemoqa.utilities.BrowserFactory;
 

public class AlertPages extends  BrowserFactory{


	By NewTabe=By.xpath("//*[@id=\"tabButton\"]");
	By NewTabWindows=By.xpath("//button[text()='New Window']");
	By NewWindowMwessage=By.xpath("//button[text()='New Window Message']"); 
	By On_click__Button_to_see_alert=By.id("alertButton");
	By On_click_alert_will_appear_after5_seconds = By.id("timerAlertButton");
	By On_click_confirm_box_will_appear_You_selected_Ok = By.id("confirmButton");
	By On_click_prompt_box_will_appear = By.id("promtButton");	 
	By Samll_Modal = By.xpath("//button[text()='Small modal']");
	By Large_Modal = By.xpath("//button[text()='Large modal']");

 
	
	  

	@Test()
	public void naviagatetoalertBrowserWindow() {
		  
  
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Browser Windows']"));

			WebElement client = elements.get(x);
			client.click();
			 

		}


	}


	@Test ()	

	public void Browser_Windonw_NewTab() {

		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		driver.findElement(NewTabe).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);


		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);

		driver.switchTo().window(childWindowId);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("child window pop up title"+driver.getTitle());

		driver.close();
		driver.switchTo().window(parentWindowId);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("parent window title"+driver.getTitle());



		String title = "This is a sample page";
		if(title.equals("This is a sample page")) {

			System.out.println("Valid page");

		}else
			System.out.println("Not vaid page");


		Assert.assertEquals("This is a sample page", title);

	}


	@Test ()	
	public void Browser_Windonw_NewWindow() {


		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		driver.findElement(NewTabWindows).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);


		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);

		driver.switchTo().window(childWindowId);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("child window pop up title"+driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowId);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("parent window title"+driver.getTitle());



		String title = "This is a sample page";
		if(title.equals("This is a sample page")) {

			System.out.println("Valid page");

		}else
			System.out.println("Not vaid page");


		Assert.assertEquals("This is a sample page", title);



	}







	@Test ()	
	public void Browser_NewWindow_Message() {

		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		driver.findElement(NewWindowMwessage).click();


		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);


		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);
		driver.switchTo().window(childWindowId);



		//System.out.println("child window pop up title"+driver.getTitle());

		//driver.close();

		driver.switchTo().window(parentWindowId);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("parent window title"+driver.getTitle());


		String title = "This is a sample page";
		if(title.equals("This is a sample page")) {

			System.out.println("Valid page");

		}else
			System.out.println("Not vaid page");


		Assert.assertEquals("This is a sample page", title);


		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,000)");

		 
	}

	 
	
	
	
	

	@Test ()	
	public void On_click__Button_to_see_alert() {
	//	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Alerts']"));
			WebElement client = elements.get(x);
			client.click();

		}

		driver.findElement(On_click__Button_to_see_alert).click();

	 

	
		
		Alert alert = driver.switchTo().alert();
		
		
		System.out.println(alert.getText());
		String title = alert.getText();
		if(title.equals("You clicked a button")){
			System.out.println("Valid Alert");
		}
		else{
			System.out.println("Not Valid alert");
		}

		alert.accept();



	}


	@Test ()	
	public void  On_click_alert_will_appear_after5_seconds() {
	//	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(On_click_alert_will_appear_after5_seconds).click();


		System.out.println(driver.getTitle());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String title = alert.getText();

		if(title.equals("This alert appeared after 5 seconds")){
			System.out.println("correct alert messg");
		}
		else{
			System.out.println("in-correct alert messg");
		}



		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();  
		Assert.assertEquals("This alert appeared after 5 seconds", title);


	} 






	@Test ()	
	public void On_click_prompt_box_will_appear() {
		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(On_click_confirm_box_will_appear_You_selected_Ok).click();



		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String title = alert.getText();
		if(title.equals("Do you confirm action?")){
			System.out.println("correct alert messg");
		}
		else{
			System.out.println("in-correct alert messg");
		}

		alert.accept(); //click on OK btn





	}

	@Test ()	
	public void  prompt_box_will_appear_Text_box() {

		 
		//driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(On_click_prompt_box_will_appear).click();



		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String title = alert.getText();

		if(title.equals("Please enter your name")){
			System.out.println("correct alert messg");
		}
		else{
			System.out.println("in-correct alert messg");
		}

		 
		 
		alert.accept(); //click on OK btn
		Assert.assertEquals("Please enter your name", title);




	}


	@Test ()	
	public void Frames(){

	//	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Frames']"));
			WebElement client = elements.get(x);
			client.click();



		}
		driver.switchTo().frame("frame1");
		int iframe_size = driver.findElements(By.xpath("//*[@id=\"frame1\"]")).size();
		System.out.println(iframe_size);

		String  title = "This is a sample page";
		if(title.equals("This is a sample page"))
		{
			System.out.println("Valid frmae1");

		}else {
			System.out.println("Not valid frame2");
		}

		Assert.assertEquals("This is a sample page",title);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,200)");	 


		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		int iframe_size2 = driver.findElements(By.xpath("//*[@id=\"frame2\"]")).size();
		System.out.println(iframe_size2);

		String  title2 = "This is a sample page";
		if(title.equals("This is a sample page"))
		{
			System.out.println("Valid frmae2");

		}else {
			System.out.println("Not valid frame2");
		}

		Assert.assertEquals("This is a sample page",title2);





	}



	@Test ()	
	public void NestedFrames()  {

	//	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,000)");


		 

	}

	// Modal Dialog page
	@Test ()	
	public void ModalDialogs_Large_Modal(){

		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Modal Dialogs']"));

			WebElement client = elements.get(x);
			client.click();

			driver.findElement(Large_Modal).click();
		}



	}


	@Test ()	
	public void ModalDialogs_Samll_Modal() {

	//	driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Modal Dialogs']"));

			WebElement client = elements.get(x);
			client.click();

			driver.findElement(Samll_Modal).click();
		}

	}

}
