package DemoSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//p-calendar[contains(@class,'ng-dirty')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ng-tns-c58-10 ui-state-high')]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//i[contains(@class,'sc-cSHVUG NyvQv icon')]")).click();
		//String CD=driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']//text[2]")).getText();
		//System.out.println(CD);
		//driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
