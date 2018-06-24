package stealjobs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestW2smsWaitFrameRobot {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html?");

		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("9686379873");
		driver.findElement(By.name("password")).sendKeys("21155255");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));
		driver.findElement(By.id("mobile")).sendKeys("9052388236");
		driver.findElement(By.id("message")).sendKeys("HI azmeer msg for you");
		driver.findElement(By.id("Send")).click();

		driver.switchTo().defaultContent();

		if (driver.findElement(By.xpath("//*[@class='install-but']")).isDisplayed()) {

			driver.findElement(By.xpath("//*[@class='install-but']")).click();
			Thread.sleep(5000);
			Robot r = new Robot();
			for (int i = 1; i <= 2; i++) {
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(5000);
			}

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
		}
		driver.switchTo().frame("frame");
		try {
			if(driver.findElement(By.xpath("//*[text()='Message has been submitted successfully.']")).isDisplayed())
			{
				System.out.println("msg send successfully");
			}
		}
		catch (Exception e) {
			System.out.println("msg was not send");
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='out louti']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.close();
		

	}

}
