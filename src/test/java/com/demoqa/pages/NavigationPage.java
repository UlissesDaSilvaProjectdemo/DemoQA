package com.demoqa.pages;
//package com.demoqa.pages_v1;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import utility.BaseClass;
// 
// 
//
//public class NavigationPage extends BaseClass  {
//	
//	By navigateto_form_Page = By.xpath(" ");
//	By naviagatetoalertBrowserWindow = By.xpath(" ");
//	By naviagatetoAlert_Alerts = By.xpath("");
//	By naviagatetoAlert_Frames= By.xpath("");
//	By naviagatetoalert_NestedFrame = By.xpath("");
//	By naviagatetoaler_Modal_Dialog = By.xpath("");
//	By naviagatetoWidges_Autocomplete = By.xpath("//*[tName\"]");
//	By naviagatetoWidges__datapicker = By.xpath("//*[@id=\"firstName\"]");
//	By naviagatetoWidges__Slider = By.xpath("//*[@id=\"firstName\"]");
//	By naviagatetoWidges_Progress_Bar = By.xpath("//*[@id=\"firstName\"]");
//	By naviagatetoWidges_Tabs = By.xpath("//*[@id=\"firstName\"]");
//	By naviagatetoWidges_ToolTips = By.xpath("//*[@id=\"firstName\"]");
//	By naviagatetoWidges_Menu = By.xpath("//*[@id=\"firstName\"]");
//	By naviagatetoWidges_SelectMenu = By.xpath("//*[@id=\"firstName\"]");
//	By navigatetoInteraction_Sortable = By.xpath("//*[@id=\"firstName\"]");
//    By navigatetoInteraction_Selectable= By.xpath("");
//    By navigatetoInteraction_Resizable = By.xpath("");
//    By navigatetoInteraction_droppable = By.xpath("");
//    By navigatetoInteraction_Dragbale = By.xpath("");
//    By navigatetoBook_login = By.xpath("");
//    By navigatetoBook_BookStore = By.xpath("");
//    By navigatetoBook_Profile = By.xpath("");
//    By navigateto_BookStoreAPI= By.xpath("");
//   
//    
//	
//	@Test
//	public void navigateto_form_Page(){
//
//		//navigate_to_form
//		driver.findElement(By.xpath("//h5[text()='Forms']")).click();	
//		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox == //span[text()='Practice Form']
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Practice Form']"));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//			
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//
//	//@Test
//	public void naviagatetoalertBrowserWindow() {
//
//
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]")).click();
//		int elementsCount= driver.findElements(By.id("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//       
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");	  
//
//
//		//click on Browser Windonws_btn
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.id("//*[@id=\"item-0\"]/span"));
//		
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//		readconfig.naviagetbackwards();
//
//	}
//	 
//	// @Test
//	 public void naviagatetoAlert_Alerts() {
//		//navigate_to_form
//			driver.findElement(By.xpath(" ")).click();	
//			int elementsCount= driver.findElements(By.xpath("")).size();
//			System.out.println("Amount of elements: " + elementsCount);
//
//
//			//click on TextBox
//			for (int x = 0; x < elementsCount; x++) {
//				List<WebElement> elements = driver.findElements(By.xpath(" "));
//				WebElement client = elements.get(x);
//				client.click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//			}
//
//
//			readconfig.naviagetbackwards();
//	 }
//	 
//	// @Test
//	 public void naviagatetoAlert_Frames() {
//		//navigate_to_form
//			driver.findElement(By.xpath(" ")).click();	
//			int elementsCount= driver.findElements(By.xpath("")).size();
//			System.out.println("Amount of elements: " + elementsCount);
//
//
//			//click on TextBox
//			for (int x = 0; x < elementsCount; x++) {
//				List<WebElement> elements = driver.findElements(By.xpath(" "));
//				WebElement client = elements.get(x);
//				client.click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//			}
//
//
//			readconfig.naviagetbackwards();
//	 }
//	 
//	// @Test
//	 public void naviagatetoalert_NestedFrame() {
//		//navigate_to_form
//			driver.findElement(By.xpath(" ")).click();	
//			int elementsCount= driver.findElements(By.xpath("")).size();
//			System.out.println("Amount of elements: " + elementsCount);
//
//
//			//click on TextBox
//			for (int x = 0; x < elementsCount; x++) {
//				List<WebElement> elements = driver.findElements(By.xpath(" "));
//				WebElement client = elements.get(x);
//				client.click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//			}
//
//
//			readconfig.naviagetbackwards();
//	 }
//	 
//	// @Test
//	 public void naviagatetoaler_Modal_Dialog() {
//		 
//	 }
//
//
//
//	//@Test
//	public void naviagatetoWidges_Accordian() {
//		
//
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[2]")).click();
//
//		int elementsCount= driver.findElements(By.id("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");	  
//
//		//click on Acordian_btn
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.id("id=\"item-0\""));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//		readconfig.naviagetbackwards();
//
//	}
//    
//	//@Test
//	public void naviagatetoWidges_Autocomplete() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void naviagatetoWidges__datapicker() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void naviagatetoWidges__Slider() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void naviagatetoWidges_Progress_Bar() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void naviagatetoWidges_Tabs() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void naviagatetoWidges_ToolTips() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void naviagatetoWidges_Menu() {
//
//	}
//	@Test
//	public void naviagatetoWidges_SelectMenu() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	
//
//
//	//@Test
//	public void navigatetoInteraction_Sortable() {
//
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[3]")).click();
//
//		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/div/ul")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)");	  
//
//		//click on sortable_btn by text  //*[text()='Accordian']
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Sortable']"));
//			WebElement client = elements.get(x);
//			client.click();
//			 
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			 
//		}
//		readconfig.naviagetbackwards();
//	}
//	
//	//@Test
//	public void navigatetoInteraction_Selectable() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void navigatetoInteraction_Resizable() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void navigatetoInteraction_droppable() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//	//@Test
//	public void navigatetoInteraction_Dragbale() {
//		//navigate_to_form
//		driver.findElement(By.xpath(" ")).click();	
//		int elementsCount= driver.findElements(By.xpath("")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on TextBox
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath(" "));
//			WebElement client = elements.get(x);
//			client.click();
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//
//
//		readconfig.naviagetbackwards();
//	}
//
//
//
//	//@Test
//	public void navigatetoBook_login() {
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)");	  
//
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5")).click();
//		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
//		System.out.println("Amount of elements: " + elementsCount);
//
//
//		//click on login_btn
//		for (int x = 0; x < elementsCount; x++) {
//			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login'] "));;
//			WebElement client = elements.get(x);
//			
//			JavascriptExecutor js1 = (JavascriptExecutor) driver;
//			js1.executeScript("window.scrollBy(0,400)");	  
//			
//			client.click();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//
//		}
//		readconfig.naviagetbackwards();
//		
//		
//
//	}
//	
//	//@Test
//		public void navigatetoBook_BookStore() {
//			//navigate_to_form
//			driver.findElement(By.xpath(" ")).click();	
//			int elementsCount= driver.findElements(By.xpath("")).size();
//			System.out.println("Amount of elements: " + elementsCount);
//
//
//			//click on TextBox
//			for (int x = 0; x < elementsCount; x++) {
//				List<WebElement> elements = driver.findElements(By.xpath(" "));
//				WebElement client = elements.get(x);
//				client.click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//			}
//
//
//			readconfig.naviagetbackwards();
//		}
//		//@Test
//		public void navigatetoBook_Profile() {
//			//navigate_to_form
//			driver.findElement(By.xpath(" ")).click();	
//			int elementsCount= driver.findElements(By.xpath("")).size();
//			System.out.println("Amount of elements: " + elementsCount);
//
//
//			//click on TextBox
//			for (int x = 0; x < elementsCount; x++) {
//				List<WebElement> elements = driver.findElements(By.xpath(" "));
//				WebElement client = elements.get(x);
//				client.click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//			}
//
//
//			readconfig.naviagetbackwards();
//		}
//		//@Test
//		public void navigateto_BookStoreAPI() {
//			//navigate_to_form
//			driver.findElement(By.xpath(" ")).click();	
//			int elementsCount= driver.findElements(By.xpath("")).size();
//			System.out.println("Amount of elements: " + elementsCount);
//
//
//			//click on TextBox
//			for (int x = 0; x < elementsCount; x++) {
//				List<WebElement> elements = driver.findElements(By.xpath(" "));
//				WebElement client = elements.get(x);
//				client.click();
//				try {
//					Thread.sleep(3000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//
//			}
//
//
//			readconfig.naviagetbackwards();
//		}
//
//
//}
