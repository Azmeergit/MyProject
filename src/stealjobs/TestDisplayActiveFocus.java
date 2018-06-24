package stealjobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDisplayActiveFocus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=t72pWoesBNTD8weflrbYBw");
		if(driver.findElement(By.name("q")).isDisplayed())
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("nt displayed");
			
		}
		if(driver.findElement(By.name("q")).isEnabled())
		{
			System.out.println("Enables");
		}
		else
		{
			System.out.println("nt enabled");
		}
		if(driver.findElement(By.name("q")).isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("nt selected");
		}
	}

}
