package stealjobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDragAnddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));

		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);

		a.dragAndDrop(e1, e2).build().perform();
		
		driver.switchTo().defaultContent();
		driver.close();

	}

}
