package stealjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.get("http://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("azm@gmail.com");
		driver.findElement(By.id("identifierNext"));
		String s = driver.findElement(By.xpath("//*[@aria-live='assertive'])[1]")).getText();
		System.out.println("success");
		Thread.sleep(10000);
		System.out.println(s);
		Thread.sleep(5000);
		driver.close();
	}
}
