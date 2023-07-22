package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_Mouse_prac {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokul\\eclipse-workspace\\selenium_practice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
	
		
		driver.get("http://www.greenstechnologys.com/index.html");
		
// click and contextclick
		
		
		Actions ac = new Actions(driver);
		
		Thread.sleep(2000);
		
		WebElement g1 = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/ul/li[2]/a"));
		ac.click(g1).build().perform();// used to click
	
		Thread.sleep(2000);

		WebElement g2 = driver.findElement(By.xpath("//a[@href='courses.html'][1]"));
		ac.contextClick(g2).build().perform();// contextclick is used only for rightclick
		
		Thread.sleep(2000);
		
		ac.doubleClick().build().perform();// it will perform the current element g2
		
		
// doubt in drag&drop and move to element		
		
		
	
		
	}

}
