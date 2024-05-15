package DemoSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTitle {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		String ExpectedTitle="actiTIME - Login";
		String ActualTitle="actiTIME - Login";
		
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("This is success");
		} else {
			System.out.println("This is failure");
		}

	}

}
