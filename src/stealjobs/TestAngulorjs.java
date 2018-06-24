package stealjobs;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAngulorjs {

	public static void main(String[] args) {
		
		String x="Kalam";
	
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://angularjs.org/");
		WebDriverWait w=new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.xpath("//*[@ng-model='yourName']"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		
	}
		
}