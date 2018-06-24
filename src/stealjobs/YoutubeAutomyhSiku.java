package stealjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YoutubeAutomyhSiku {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "E:\\batch238\\drivers\\geckodriver.exe"); FirefoxDriver driver = new
		 * FirefoxDriver();
		 */
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("abdul kalam sir speech");

		// Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@aria-label='Search']")).click();
		driver.findElement(By.id("video-title")).click();

	}

}
