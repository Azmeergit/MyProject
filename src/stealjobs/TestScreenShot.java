package stealjobs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\batch238\\ss.png");
		FileUtils.copyFile(src, des);
	}

}
