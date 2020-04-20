import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	static WebDriver driver;
public static void main(String[] args) {
	
	setUp();
	tearDown();
}

public static void setUp() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
}

public static void tearDown() {
	driver.close();
	driver.quit();
}
}
