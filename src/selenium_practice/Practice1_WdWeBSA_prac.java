package selenium_practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1_WdWeBSA_prac {
	
	
public static void main(String[] args) throws Throwable {

		
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gokul\\eclipse-workspace\\selenium_practice\\Driver\\chromedriver.exe");
		


		
	

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-Origins=*");
	
	WebDriver obj = new ChromeDriver(option);
	
	
	
	
	
// 1. webdriver methods
		
		obj.get("https://www.google.com/");
		
		obj.manage().window().maximize();
		Thread.sleep(2000);
		
		Dimension size = obj.manage().window().getSize();
		System.out.println(size);
		
		obj.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		obj.navigate().back();
		
		String title = obj.getTitle();
		System.out.println(title);
		
		String currentUrl = obj.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
//4. alert create	
		
		JavascriptExecutor gg = (JavascriptExecutor)obj; 
		Object g1 = gg.executeScript("alert('welcome to google by Gokul')");	
		Thread.sleep(3000);
		Alert clk = obj.switchTo().alert();
		clk.accept();
		
		
		
		
// 2. webelement locators and webelement methods,   button program include
		
		WebElement findElement = obj.findElement(By.name("q"));
		findElement.sendKeys("https://www.facebook.com/" + Keys.ENTER);
		
		Thread.sleep(2000);
		
	    WebElement findElement2 = obj.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
	    findElement2.click();
		
		Thread.sleep(2000);
		obj.navigate().refresh();
		
		
		
		
		
		
		WebElement findElement3 = obj.findElement(By.id("email"));
		String attribute = findElement3.getAttribute("aria-label");
		System.out.println(attribute);
		
		WebElement findElement4 = obj.findElement(By.id("email"));
		boolean enabled = findElement4.isEnabled();
		System.out.println(enabled);
		
		WebElement findElement5 = obj.findElement(By.id("email"));
		boolean displayed = findElement5.isDisplayed();
		System.out.println(displayed);
		
		WebElement findElement6 = obj.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		String text = findElement6.getText();
		System.out.println(text);
		
		WebElement findElement7 = obj.findElement(By.id("email"));
		String tagName = findElement7.getTagName();
		System.out.println(tagName);
		
		WebElement findElement10 = obj.findElement(By.id("email"));
		findElement10.sendKeys("Gokul@gmail.com");
		
		WebElement findElement11 = obj.findElement(By.id("pass"));
		findElement11.sendKeys("1234567");
		
		Thread.sleep(2000);
		
		WebElement findElement9 = obj.findElement(By.id("pass"));
		Dimension size2 = findElement9.getSize();
		int height = size2.height;
		int width = size2.width;
		System.out.println("height is "+ height);
		System.out.println("width is "+ width);
		
		WebElement findElement8 = obj.findElement(By.id("email"));
		Point location = findElement8.getLocation();
		int x = location.x;
		int y = location.y;
		System.out.println("x value is - " + x);
		System.out.println("y value is -_" + y);
		
		Thread.sleep(2000);
		
		
		
		
//3. screenshot		

		
		TakesScreenshot ts = (TakesScreenshot) obj;
		
		File sourcefilee = ts.getScreenshotAs(OutputType.FILE);
			File designationn = new File("C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\screenshots\\google.png");

		File designationn2 = new File("C:\\Users\\gokul\\eclipse-workspace\\selenium_Rough work\\screenshots\\fb.png");
		
		Thread.sleep(2000);
		
		FileUtils.copyFile(sourcefilee, designationn);
		
		FileUtils.copyFile(sourcefilee, designationn2);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Thread.sleep(4000);
//		obj.close();
	}}

// in end of prgrm close or quit program la use panna program run ana apram console la last la
//-> [WARNING]: Timed out connecting to Chrome, retrying.  ipdinu varum adhu no problem		
	

	
	
