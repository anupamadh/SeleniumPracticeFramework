package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.IFramesPage;

public class IFramesPageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp();
		numberOfIframesCount();
		switchFrameTest();
		tearDown();

	}
	
	public static void numberOfIframesCount() {
		IFramesPage iframeObj = new IFramesPage(driver);
		iframeObj.iframeCount();
	}
	
	public static void switchFrameTest() {
		IFramesPage iframeObj = new IFramesPage(driver);
		iframeObj.switchFrame();
	}
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
