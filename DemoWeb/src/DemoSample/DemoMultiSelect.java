package DemoSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement multi=driver.findElement(By.id("cities"));
		Select dd=new Select(multi);
		dd.selectByIndex(0);
		Thread.sleep(2000);
		dd.selectByValue("1");
		Thread.sleep(2000);
		dd.selectByVisibleText("Delhi");
		
		List<WebElement> AS=dd.getAllSelectedOptions();

		int SI=AS.size();

		

		for (int i = 0; i <=SI; i++) {
			WebElement MS=AS.get(i);
			String te=MS.getText();
			System.out.println(te);


		}

	}

}
