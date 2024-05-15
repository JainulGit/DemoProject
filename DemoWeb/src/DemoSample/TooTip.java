package DemoSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TooTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/apple-phones-48.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String TT=driver.findElement(By.xpath("//img[contains(@src,'apple-iphone-15-pro-max')]")).getAttribute("src");
		System.out.println(TT);
	}

}

