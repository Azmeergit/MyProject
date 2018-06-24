package stealjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHoliSelector {

	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
			/*System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com");*/
			Thread.sleep(5000);
			/*WebElement e=driver.findElement(By.xpath("//*[text()='Women']"));
			Thread.sleep(5000);
			Actions a=new Actions(driver);
			Thread.sleep(5000);
			a.moveToElement(e).build().perform();*/
			Actions a= new Actions(driver);
			WebElement e=driver.findElement(By.name("q"));
			Thread.sleep(5000);
			a.sendKeys(e,"kalam").build().perform();
			for(int i=0;i<=4;i++)
			{
				a.sendKeys(Keys.DOWN).build().perform();
				Thread.sleep(5000);
			}
			a.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(10000);
			driver.close();
	}

}
