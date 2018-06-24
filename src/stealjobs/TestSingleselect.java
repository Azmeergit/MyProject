package stealjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSingleselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in");
		WebElement e = driver.findElement(By.name("nights"));
		Select s = new Select(e);
		// checking dropdown multi select or single select
		if (s.isMultiple()) {
			System.out.println("multi select dropdown");
		} else {
			System.out.println("single select drop down");
		}
		// s.selectByVisibleText("2Nights+3Days");
		// System.out.println(s);
		// s.selectByIndex(4);
		// s.selectByValue("13Nights / 14Days");
		int c = s.getOptions().size();
		for (int i = 0; i < c; i++) {
String s1=s.getOptions().get(i).getText();
System.out.println(s1);
		}

	}

}
