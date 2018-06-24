package stealjobs;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\batch238\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
