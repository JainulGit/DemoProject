package DemoSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DemoDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile proof=new FirefoxProfile();
		proof.setPreference("browser.helperApps.neverAsk.saveToDisk;", "application/zip");
		proof.setPreference("browser.download.folderList;",1);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", "");
		
		driver.findElement(By.xpath("//a[text()='4.15.0']")).click();
		
	}

}
