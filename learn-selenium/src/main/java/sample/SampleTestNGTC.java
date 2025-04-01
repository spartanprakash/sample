package sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SampleTestNGTC {

	@Test
	public void runLogin() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		System.out.println("hvhjgkghjgkhgh");
	}
	
}
