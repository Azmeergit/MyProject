package stealjobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTooltip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	WebElement e1=driver.findElement(By.name("q"));
	
	String s1=e1.getAttribute("title");
	System.out.println(s1);
	WebElement e2=driver.findElement(By.xpath("//*[@class='gsri_a']/parent::a"));
	String y=e2.getAttribute("aria-label");
	System.out.println(y);
	driver.close();
	
	}

}

