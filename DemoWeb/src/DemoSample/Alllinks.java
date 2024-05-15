package DemoSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alllinks {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		int SI=allLinks.size();
		
		for (int i = 0; i <=SI; i++) {
			WebElement AL=allLinks.get(i);
			String te=AL.getText();
			System.out.println(te);
			
		}
	}

}
