package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PracticePage;

public class PracticePageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		setUp();
		elements_locate();
		tearDown();
	}
	
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	public static void elements_locate() {
		PracticePage.radiobutton_click(driver).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Clicked on radio button");
	}
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
