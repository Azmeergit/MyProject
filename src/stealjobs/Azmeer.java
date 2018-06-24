package stealjobs;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Azmeer {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\chromedriver.exe");
		ChromeDriver driver = null;
		try {
			driver = new ChromeDriver();
			// driver.get("https://www.google.com");
			// driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
			driver.get("https://semantic-ui.com/modules/dropdown.html");
			// driver.get("https://www.gmail.com");
			 Thread.sleep(15000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			/*js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
			Thread.sleep(20000);
			js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
			Thread.sleep(15000);*/
			WebElement e=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
			 js.executeScript("argument[0].scrollInToView();",e);

		}

		catch (Exception e) {

			e.getMessage();
		}

		driver.close();

	}

}
