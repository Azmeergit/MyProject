package stealjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();*/
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@jsname='YPqjbf']")).sendKeys("shaikazmeer552@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("21155255");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id(":mp")).sendKeys("azmer.tech@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("checking for gmail");
		Thread.sleep(5000);
		driver.findElement(By.id(":nc")).sendKeys("body of the gmail");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		
	}

}
