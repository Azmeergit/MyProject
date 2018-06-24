package stealjobs;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppTestDynamic {

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

		String s1 = driver.getRemoteAddress().getPath();
		System.out.println(s1);
		String s2 = driver.getRemoteAddress().getProtocol();
		System.out.println(s2);
		int s3 = driver.getRemoteAddress().getPort();
		System.out.println(s3);
		String s4=driver.getDeviceTime();
		System.out.println(s4);
		String s5=driver.getPlatformName();
		System.out.println(s5);
		Long l=driver.getDisplayDensity();
		System.out.println(l);
		driver.openNotifications();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@content-desc='Settings']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='About phone']")).click();
		String s8=driver.findElement(By.xpath("//*[@text='6.0.1 MMB29M']")).getAttribute("text");
		Thread.sleep(5000);
		//String s8=driver.findElement(By.xpath("@bounds='[468,508][677,574]'")).getAttribute("text");
		Thread.sleep(5000);
		System.out.println(s8);
		
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
		
		

	}

}
