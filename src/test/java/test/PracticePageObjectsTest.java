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
	tearDown();
	
}
public static void radiobuttonTest() {
	PracticePageObjects practicePageObj = new PracticePageObjects(driver);
	practicePageObj.clickRadioButton();
	try {
		Thread.sleep(3000);
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
		Thread.sleep(3000);
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
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
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
