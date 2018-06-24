package stealjobs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class FirstExOnAppium {

	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u = new URL("http://0.0.0.0:4723/wd/hub");

		// Thread.sleep(5000);

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "Browser");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformName", "4.2.2");

		dc.setCapability("appPackage", "com.android.deskclock");
		dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
		AndroidDriver driver;
		while (2 > 1) {
			try {
				driver = new AndroidDriver<>(u, dc);
				break;

			} catch (Exception e) { // no exception handling }

			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
		driver.findElement(By.xpath("(//*[@class='android.widget.CheckBox'])[4]")).click();
		driver.pressKeyCode(AndroidKeyCode.HOME);
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

	}

}
