package stealjobs;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class AppTauchAction {

	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");

		// Thread.sleep(5000);

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformName", "4.2.2");
		dc.setCapability("appPackage", "com.android.deskclock");
		dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
		AndroidDriver driver;
		while (2 > 1) {
			try {
				driver = new AndroidDriver(u, dc);
				break;

			} catch (Exception e) {
				// no exception handling
			}

		}

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
		int w = driver.manage().window().getSize().getWidth();
		int h = driver.manage().window().getSize().getHeight();
		TouchAction ta = new TouchAction(driver);
		int x1 = (int) w / 2;
		int y1 = (int) (h * 0.9);
		int x2 = (int) w / 2;
		int y2 = (int) (h * 0.7);
		while (2 > 1) {
			try {
				//Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@text='BANGALORE']")).click();
				break;
			}

			catch (Exception e) {
				ta.press(x1, y1).moveTo(x2-x1, y2-y1).release().perform();
			}
		}

		// driver.pressKeyCode(AndroidKeyCode.HOME);
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
