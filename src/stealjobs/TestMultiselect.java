package stealjobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMultiselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
	}

}
