package DemoSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoText {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.actitime.com/login.do");


		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();

		Thread.sleep(10000);

		String ExpectedText = driver.findElement(By.xpath("(//div[text()='Switch to actiPLANS'])[1]")).getText();

		String ActualText = "Switch to actiPLANS";

		if(ExpectedText.equals(ActualText)) {

			System.out.println("True");
		}

		else {

			System.out.println("False");

		}

	}

}
