package stealjobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInvisibleItem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		List<WebElement> l = driver
				.findElements(By.xpath("//*[contains(@class,'dropdown selection multiple')][1]/div[2]/div"));
		System.out.println(l.size());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * for(int i=0;i<l.size();i++) {
		 * js.executeScript("var x=arguments[0].textContent;alert(x)",l.get(i));
		 * //Thread.sleep(5000); String y=driver.switchTo().alert().getText();
		 * System.out.println(y);
		 * 
		 * driver.switchTo().alert().dismiss(); }
		 * js.executeScript("alert('custum msg');");
		 * driver.switchTo().alert().dismiss();
		 */
		js.executeScript("window.scrollTo(0,document.body.ScrollHeight);");
		Thread.sleep(10000);
		js.executeScript("window.scrollTo(document.body.ScrollHeight,0);");
		Thread.sleep(10000);
		WebElement e = driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
		Thread.sleep(10000);
		js.executeScript("arguments[0].ScrollIntoView();", e);
		// driver.close();

	}

}
