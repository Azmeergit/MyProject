package stealjobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmailAccount {

	public static void main(String[] args) throws Exception {
	/*	System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("techazmeer271");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("21155255");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		
		List<WebElement> rl=driver.findElements(By.xpath("(//*[@role='tabpanel'])[1]/descendant ::table/tbody/tr"));
		System.out.println(rl.size());
		List<WebElement> cl=rl.get(1).findElements(By.tagName("td"));
		List<WebElement> el=cl.get(1).findElements(By.tagName("div"));
		el.get(0).click();
		driver.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant ::table/tbody/tr[3]/td[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@title,'Google Account: Azmeer shaik')]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		
		
		
	}

}
