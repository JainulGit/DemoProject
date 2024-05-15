package DemoSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoURL {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		String expectedURL="https://demo.actitime.com/login.do";
	
		String actualURL=driver.getCurrentUrl();
		
		if (actualURL.equals(expectedURL)) {
			System.out.println("true");
		} else {
			System.out.println("fail");
		}
		
		

	}

}
