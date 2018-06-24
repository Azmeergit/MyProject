package stealjobs;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class TestSikuli1 {

	public static void main(String[] args) throws Exception {
		Screen s = new Screen();
		s.click("Capture.png");
		Thread.sleep(5000);
		s.doubleClick("Capture1.png");
		Thread.sleep(5000);
		s.rightClick("Capture2.png");
		for (int i = 1; i <= 2; i++) {
			s.type(Key.DOWN);
			Thread.sleep(2000);
		}
		s.click();

	}

}
