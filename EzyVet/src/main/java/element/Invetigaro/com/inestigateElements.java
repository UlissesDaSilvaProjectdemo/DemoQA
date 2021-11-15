package element.Invetigaro.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ezyvet.demo.ezyvetBaseClass;

public class inestigateElements extends ezyvetBaseClass  {

	 
    By staffCount = By.xpath("//*[@name=\"staff_count\"]");
    By firstName = By.xpath("//*[@name=\"firstname\"]");
    
    
	@Test
	public void elementIframeIndex() {
		//driver.switchTo().frame(0);
		int size = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("//*[@name=\"firstname\"]")).size();
			System.out.println(total);
			    driver.switchTo().defaultContent();
			    
		}
			 
		
	}
	
	@Test
	public void IframeCounter() {
		
		int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
               
		// prints the total number of frames 
		driver.switchTo().frame(0); // Switching the Outer Frame    		
	    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

		//Printing the text in outer frame
		size = driver.findElements(By.tagName("iframe")).size();
	 
   // prints the total number of frames inside outer frame           
                                                                                                          
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(0); // Switching to innerframe
	    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		
		//Printing the text in inner frame
		driver.switchTo().defaultContent();
	}
		
	
	 
	
	@Test
	public void switchToIframe() {
		driver.switchTo().frame(0);
		driver.findElement(firstName).sendKeys("Test Frame");
		    
	}
		 


	@Test
	public void elementScrollDownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 
		driver.findElement(firstName).sendKeys("Ulisses@gmial.com");


	}


	@Test
	public void explicitWait() {
		//driver.findElement(FirstName).sendKeys("test");
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"firstname\"]")));
		element.sendKeys("test");
	}
	
	
	@Test
	public void radioButtonTogleoff() {
		  WebElement option1 = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));							
	        option1.click();			
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	}
	
	@Test
	public void UnorderlistElementFinder() {
		//driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,000)");	  
		
		int elementsCount= driver.findElements(By.xpath("//*[@name=\"firstname\"]")).size();
		System.out.println("Amount of elements: " + elementsCount);

		 
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//*[@name=\"firstname\"]"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	

}
