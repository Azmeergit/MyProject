package stealjobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSynchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.findElement(By.linkText("6")).click();
	//WebDriverWait w= new WebDriverWait(driver, 100);
	FluentWait f=new FluentWait(driver).pollingEvery(5, TimeUnit.SECONDS).withTimeout(100, TimeUnit.SECONDS);
	f.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
	driver.close();
	}

}
