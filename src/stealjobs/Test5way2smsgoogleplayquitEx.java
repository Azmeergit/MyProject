package stealjobs;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test5way2smsgoogleplayquitEx {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		if (x.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (x.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		/*// element locating name,id
		driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(5000);
		
		ArrayList<String> whs = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(5000);
		for (int i = 0; i < whs.size(); i++) {
			System.out.println(whs.get(1));
		}
		driver.switchTo().window(whs.get(1));
		String c=driver.getCurrentUrl();
		if(c.contains("https"))
		{
			System.out.println("given url is secure");
			
		}
		else
		{
			System.out.println("given url is not secure");
		}
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(whs.get(0));*/
		//driver.findElement(By.name("username")).sendKeys("9686379873");
		//driver.findElement(By.name("password")).sendKeys("21155255");
		/*String x1 = driver.getTitle();
		System.out.println(x1);
		String y = driver.getCurrentUrl();
		System.out.println(y);
		if(y.contains("https"))
		{
			System.out.println("given url is secure");
			
		}
		else
		{
			System.out.println("given url is not secure");
		}
		Thread.sleep(5000);*/


		// element locating using xpath
		driver.findElement(By.id("loginBTN")).click();
		//driver.findElement(By.xpath("//*[text()='Send SMS' ]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
