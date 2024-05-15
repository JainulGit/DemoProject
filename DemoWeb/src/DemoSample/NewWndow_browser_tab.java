package DemoSample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWndow_browser_tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Tour Package ']")).click();
		
		Set<String>AW=driver.getWindowHandles();
		
		Iterator<String>TP=AW.iterator();
		
		String IRCTC=TP.next();
		
		String TP1=TP.next();
		
		driver.findElement(By.xpath("//span[text()='Air Package']")).click();

	}

}
