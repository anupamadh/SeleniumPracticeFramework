package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PracticePageObjects;

public class PracticePageObjectsTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		setUp();
		radiobuttonTest();
		autoCompleteTest();
		staticDropdownTest();
		checkboxTest();
		numberOfCheckboxesTest();
		switchWindowTest();
		switchTabTest();
		switchAlertTest();
		selectTableCellTest();
		checkShowHideTest();
		mouseHoverTest();
		tearDown();

	}
	public static void radiobuttonTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.clickRadioButton();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Clicked on radio button");
	}

	public static void autoCompleteTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.selectAutoComplete();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Selected Singapore");
	}

	public static void staticDropdownTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.selectStaticDropdown();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Selected Option2");
	}
	public static void numberOfCheckboxesTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.checkboxCount();
	}
	public static void checkboxTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.clickCheckBox();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchWindowTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.switchWindow();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchTabTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.switchTab();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void switchAlertTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.switchAlert();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectTableCellTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.selectTableCell();
	}
	
	public static void checkShowHideTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.checkShowHide();
	}
	
	public static void mouseHoverTest() {
		PracticePageObjects practicePageObj = new PracticePageObjects(driver);
		practicePageObj.mouseHover();
	}
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	}

	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}
