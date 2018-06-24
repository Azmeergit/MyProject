package stealjobs;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class AppCalculator {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first input1");
		String x = sc.nextLine();
		System.out.println("enter second input2");
		String y = sc.nextLine();

		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");

		// Thread.sleep(5000);

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformName", "4.2.2");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		AndroidDriver driver;
		while (2 > 1) {
			try {
				driver = new AndroidDriver(u, dc);
				break;

			} catch (Exception e) {
				// no exception handling
			}

		}
	for (int i = 0; i < x.length(); i++) {
			char z = x.charAt(i);
			driver.findElement(By.xpath("//*[@text='" + z + "']")).click();
		}
	driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
	for (int i = 0; i < x.length(); i++) {
		char z = y.charAt(i);
		driver.findElement(By.xpath("//*[@text='" + z + "']")).click();
	}
	driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
	

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}
}
