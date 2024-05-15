package DemoSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement MO=driver.findElement(By.xpath("//span[text()='Headsets']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(MO).perform();
		
		act.contextClick().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		

	}

}
