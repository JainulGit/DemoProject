package DemoSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allcheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.krninformatix.com/learn.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement>allcheck=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int si=allcheck.size();
		
		for (int i = 0; i < si; i++) {
			WebElement check=allcheck.get(i);
			check.click();
			Thread.sleep(1000);
			
		}
		
	}

}
