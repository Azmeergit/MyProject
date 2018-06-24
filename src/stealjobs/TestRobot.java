package stealjobs;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.seleniumhq.org");
	WebDriverWait wdw=new WebDriverWait(driver, 100);
	wdw.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Download")));
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement e=driver.findElement(By.linkText("Download"));
	Actions a=new Actions(driver);
	a.contextClick(e).build().perform();
	Robot r=new Robot();
	for(int i=1;i<=2;i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
	}
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	driver.quit();
	}

}
