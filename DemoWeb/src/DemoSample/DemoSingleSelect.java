package DemoSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.krninformatix.com/sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement single=driver.findElement(By.id("city"));
		Select dd=new Select(single);
		dd.selectByIndex(1);
		Thread.sleep(3000);
		dd.selectByValue("3");
		Thread.sleep(3000);
		dd.selectByVisibleText("Delhi");

		List<WebElement> options=dd.getOptions();

		WebElement te=options.get(0);
		System.out.println(te);


	}

}
