package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip_exctr_kabila_prac {


	

	public static void main(String[] args) throws Throwable {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gokul\\eclipse-workspace\\selenium_practice\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");

	driver.manage().window().maximize();
	


	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	js.executeScript("document.getElementById('email').value='Gokul'");
	
	
	WebElement fab = driver.findElement(By.xpath("//input[@type='password']"));
	js.executeScript("arguments[0].value='gokul123@'", fab);
	js.executeScript("alert('welcome to google')");
	
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,500)");

	WebElement kabi = driver.findElement(By.xpath("//input[@type='text']"));
	js.executeScript("arguments[0].setAttribute('style','background:pink');",kabi);
	
	
	
	}}
	
