package stealjobs;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter runding plotform name");
		String p=sc.nextLine();
		WebDriver driver=null;
		if(p.equalsIgnoreCase("computer")) {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
		else {
			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
			URL u = new URL("http://0.0.0.0:4723/wd/hub");

			// Thread.sleep(5000);

			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			dc.setCapability("deviceName", "9b6ce08e7d63");
			dc.setCapability("platformName", "android");
			dc.setCapability("platformVersion", "6.0.1");
			dc.setCapability("appPackage", "com.android.contacts");
			dc.setCapability("appActivity", "com.android.contacts.activities.TwelveKeyDialer");

			while (2 > 1) {
				try {
					driver = new AndroidDriver(u, dc);
					break;

				} catch (Exception e) {
					// no exception handling
				}

			}
		}
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS); 
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("abdul");
		driver.findElement(By.name("lastName")).sendKeys("kalam");
		driver.findElement(By.name("phone")).sendKeys("9999888875");
		driver.findElement(By.name("userName")).sendKeys("apj@abdulkalam");
		driver.findElement(By.name("address1")).sendKeys("abdulkalam");
		driver.findElement(By.name("address2")).sendKeys("dhanushkoti road");
		driver.findElement(By.name("city")).sendKeys("rameshwaram");
		driver.findElement(By.name("state")).sendKeys("tamil nadu");
		driver.findElement(By.name("postalCode")).sendKeys("65678");
		WebElement e =  driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("apjkalam");
		driver.findElement(By.name("password")).sendKeys("batch238");
		driver.findElement(By.name("confirmPassword")).sendKeys("batch238");
		driver.findElement(By.name("register")).click();

		 driver.close();
if(!p.equalsIgnoreCase("computer")) {

	Runtime.getRuntime().exec("taskkill /F /IM node.exe");
	Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	
}
	}

}
