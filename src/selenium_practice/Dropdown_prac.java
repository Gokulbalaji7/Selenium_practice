package selenium_practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_prac {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gokul\\eclipse-workspace\\selenium_practice\\Driver\\chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

// select program using index
		WebElement firstline = obj.findElement(By.id("dropdown1"));
		Select g1 = new Select(firstline);// we should type this syntax dor all
		g1.selectByIndex(1);
		Thread.sleep(1000);

// select program using text
		WebElement secondline = obj.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
		Select g2 = new Select(secondline);// we should type this syntax
		g2.selectByVisibleText("Appium");
		Thread.sleep(1000);

// select program using value
		WebElement thirdline = obj.findElement(By.xpath("//*[@id=\"dropdown3\"]"));
		Select g3 = new Select(thirdline); // we should type this syntax
		g3.selectByValue("3");
		Thread.sleep(1000);

// get the number of dropdown options
		WebElement fourthline = obj.findElement(By.className("dropdown"));
		Select g4 = new Select(fourthline);
		List<WebElement> gg = g4.getOptions();
		int size = gg.size();
		System.out.println(size);

// we want total list of dropdowns - texts
		WebElement fifthline = obj.findElement(By.className("dropdown"));
		Select gok = new Select(fifthline);
		List<WebElement> gg1 = gok.getOptions();
		// select the option foreach - iterate over an array or iterable
		for (WebElement we : gg1) {
			System.out.println(we.getText());
		}

		
// doubt we want total list of dropdowns-texts
// see reference fifthline
		
				// WebElement eighthline = obj.findElement(By.className("dropdown"));
				// String text = eighthline.getText();
				// System.out.println(text);

		
		
// use sendkey
		WebElement sixthline = obj.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		sixthline.sendKeys("Loadrunner");

// select multiple programs
		WebElement seventhline = obj.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select g6 = new Select(seventhline);
		g6.selectByIndex(1);
		g6.selectByIndex(2);


	}

}
