package stealjobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testway2sms {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		if(x.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\batch238\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("http://site24.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(5000);
		
	//driver.close();
	}

}
