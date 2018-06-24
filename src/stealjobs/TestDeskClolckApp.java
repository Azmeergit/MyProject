package stealjobs;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class TestDeskClolckApp {

	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");

		// Thread.sleep(5000);

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "9b6ce08e7d63");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "6.0.1");
		dc.setCapability("appPackage", "com.android.contacts");
		dc.setCapability("appActivity", "com.android.contacts.activities.TwelveKeyDialer");

		AndroidDriver driver;

		while (2 > 1) {
			try {
				driver = new AndroidDriver(u, dc);
				break;

			} catch (Exception e) {
				// no exception handling
			}

		}
		
		Thread.sleep(10000);
		String x = "7729856022";
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			String z = "";
			switch (ch) {
			case 0:
				z = "zero";
				break;
			case 1:
				z = "one";
				break;
			case 2:
				z = "two";
				break;
			case 3:
				z = "three";
				break;
			case 4:
				z = "four";
				break;
			case 5:
				z = "five";
				break;
			case 6:
				z = "six";
				break;
			case 7:
				z = "seven";
				break;
			case 8:
				z = "eight";
				break;
			case 9:
				z = "nine";
				break;
			default:
				System.out.println("check number currectly");
			}
			driver.findElement(By.xpath("*//[@contenr-desc='" + z + "'])")).click();
		}
		Runtime.getRuntime().exec("taskKill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
