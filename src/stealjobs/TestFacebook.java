package stealjobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("azmeer.mca1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("970azmeer");
		WebDriverWait w=new WebDriverWait(driver,100);
		driver.findElement(By.id("u_0_a")).submit();
		driver.close();
	}

}
