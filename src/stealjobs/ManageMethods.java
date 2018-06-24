package stealjobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args )throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\batch238\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		int h=driver.manage().window().getSize().getHeight();
		int w=driver.manage().window().getSize().getWidth();
		System.out.println(w+" "+h);
		//Thread.sleep(5000);
		Dimension d=new Dimension(400, 600);
		driver.manage().window().setSize(d);
		//Thread.sleep(5000);
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+""+y);
		//Thread.sleep(5000);
		Point p=new Point(300,300);
		driver.manage().window().setPosition(p);
		driver.close();
		
		
		
		
	}

}
