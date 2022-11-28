package eFlowen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public static void main(String[] args) {									
		
	  	// declaration and instantiation of objects/variables		
	      System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	      WebDriver driver = new ChromeDriver();					
	      		
	      String baseUrl = "https://willowspace.app/";					
	      driver.get(baseUrl);					

	      // Get the WebElement corresponding to the Email Address(TextField)		
	      WebElement email = driver.findElement(By.id("email"));							

	      // Get the WebElement corresponding to the Password Field		
	      WebElement password = driver.findElement(By.name("password"));							

	      email.sendKeys("yesican8059@gmail.com");					
	      password.sendKeys("Abc@12345678");					
	      System.out.println("Text Field Set");					
	       
	   				
	      // Find the submit button		
	      WebElement login = driver.findElement(By.id("submit"));							
	                  		
	 				
	      login.click();			
	      System.out.println("Login Done with Click");					
	      		
	   				
	      // This step will result in an alert on screen
	      driver.findElement(By.className("ws_btn ws_btn_sm ws_btn_black close_lifetime")).click();
	      Alert simpleAlert = driver.switchTo().alert();
	      simpleAlert.accept();
	      
			//driver.close();		
	      		
	  }
}
