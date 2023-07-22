package selenium_practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling_single {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_practice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/index.html");

		
		
		Actions ac = new Actions(driver);

		WebElement g1 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/ul/li[2]/a"));
		ac.contextClick(g1).build().perform();// contextclick means right click it is in mouse action

		Thread.sleep(2000);

		
		
		
		Robot ro = new Robot();

		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(2000);

		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
	
		
		
// single window handling	
		
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		
		
		for (String string : childwindow) {
			
			if (string.equals(parentwindow)) {
				
			} else {
				driver.switchTo().window(string);

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
