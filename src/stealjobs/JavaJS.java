package stealjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaJS {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.id("identifierId"));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("var x=arguments[0].textcontent;alert(x);", e);
		String y=driver.switchTo().alert().getText();
		System.out.println(y);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		// driver.close();
	}

}
