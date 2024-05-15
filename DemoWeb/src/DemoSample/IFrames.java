package DemoSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).sendKeys("jainul");
		
		driver.findElement(By.name("rep")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		WebElement frm=driver.findElement(By.xpath("//frame[@src='third.html']"));
		
		driver.switchTo().frame(frm);
		driver.findElement(By.name("check")).click();
		

	}

}
