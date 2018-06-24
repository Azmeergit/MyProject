package stealjobs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteGmailWithRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\batch238\\drivers\\chromedriver.exe"); ChromeDriver driver = new
		 * ChromeDriver();
		 */
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, 100);
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		driver.findElement(By.id("identifierId")).sendKeys("shaikazmeer552");
		driver.findElement(By.id("identifierNext")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("21155255");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
		driver.findElement(By.name("to")).sendKeys("apj@abdulkalam.com");
		driver.findElement(By.name("subjectbox")).sendKeys("promise");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@aria-label='Message Body'])[2]")));
		driver.findElement(By.xpath("(//*[@aria-label='Message Body'])[2]")).sendKeys("HI Sir,\nI am Azmeer");
		driver.findElement(By.xpath(("//*[@aria-label='Attach files']"))).click();
		// select data into clip board
		StringSelection x = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//*[text()='Send']")).click();
		w.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*contains(text().'Your message has been sent')")));

		driver.findElement(By.xpath("//*[@aria-label='Account Information']/preceding::*[3]")).click();
		driver.findElement(By.linkText("Sign out"));

	}

}
