package stealjobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailProramRevison {

	public static void main(String[] args) throws InterruptedException {
	/*	System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driver.findElement(By.name("identifier")).sendKeys("shaikazmeer552@gmail.com");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("21155255");
	driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
}