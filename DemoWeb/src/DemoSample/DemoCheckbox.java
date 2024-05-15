package DemoSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		
		
		
		
		/*boolean checkbox=driver.findElement(By.id("rem")).isSelected();
		
		System.out.println(checkbox);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("rem")).click();
		
		boolean checkbox1=driver.findElement(By.id("rem")).isSelected();

		System.out.println(checkbox1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("rem")).click();
		
		boolean checkbox2=driver.findElement(By.id("rem")).isSelected();
		
		System.out.println(checkbox2);*/
		
	}

}
