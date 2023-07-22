package selenium_practice;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip_exctr_prac {
	
	public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gokul\\eclipse-workspace\\selenium_practice\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();
	
// syntax for javascript executor
	
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	 
	 
	 
	 
	                           //--> Executescript	

	 
	 
	 
	 
// alert also created by JavascriptExecutor method 
	 
	 
	 
	 
	 
	 
// click id and sendkeys id 
	
//this code will be written in console and give enter means we will checked.
	 
	// jse.executeScript("document.getElementById('email').click()");//for click only means activate this line deactivate below line
	 jse.executeScript("document.getElementById('email').value='gokul'");// for use sendkey active this line deactive before line.
	 Thread.sleep(2000);
	 jse.executeScript("alert('Gokul confirm your mail id')");
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();

	 
	 
	 
//sendkeys id and xpath 
	 
	 
//this code will be written in console and give enter means we will checked.
	 
	 
	 WebElement passs = driver.findElement(By.xpath("//input[@id='pass']"));
	 jse.executeScript("arguments[0].value='gokul1234'",passs);
	 
	// jse.executeScript("document.getElementById('pass').value='gokul123'");
	 Thread.sleep(2000);
	 jse.executeScript("alert('Gokul confirm your password')");
	 Thread.sleep(2000);
	 driver.switchTo().alert().accept();
	 
	 Thread.sleep(5000);

	 
// scroll  
	 jse.executeScript("window.scrollBy(0,500)");// we only type this line fully
	 
	 Thread.sleep(5000);
		
//click x path
	 
	 WebElement createnewA = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	 jse.executeScript("arguments[0].click()",createnewA);
	
	 Thread.sleep(5000);

	 
	 
	 


	
}}
