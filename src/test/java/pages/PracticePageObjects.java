package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticePageObjects {
	private static WebDriver driver = null;
	By radiobutton_click = By.xpath("//input[@value='radio1']");
	By autocomplete_select = By.id("autocomplete");
	By staticdropdown_select = By.id("dropdown-class-example");
	By checkbox_click = By.id("checkBoxOption3");
	By checkbox_count= By.cssSelector("input[type='checkbox']");
	By window_switch = By.id("openwindow");
	
	public PracticePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickRadioButton() {
		driver.findElement(radiobutton_click).click();
	}
	
	public void selectAutoComplete() {
		driver.findElement(autocomplete_select).clear();
		driver.findElement(autocomplete_select).sendKeys("si");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i =1; i <= 7; i++) {
		driver.findElement(autocomplete_select).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(autocomplete_select).sendKeys(Keys.RETURN);
	}
	
	public void selectStaticDropdown() {
		WebElement element = driver.findElement(staticdropdown_select);
		Select s = new Select(element);
		s.selectByValue("option2");
	}
	
	public void clickCheckBox() {
		System.out.println(driver.findElement(checkbox_click).isSelected());
		driver.findElement(checkbox_click).click();
		System.out.println(driver.findElement(checkbox_click).isSelected());
	}

	public void checkboxCount() {
		System.out.println("No. of checkboxes = " + driver.findElements(checkbox_count).size());
	}
	
	public void switchWindow() {
		driver.findElement(window_switch).click();
		Set handles = driver.getWindowHandles();
		for (String handle1 : driver.getWindowHandles()) {
			 
	          System.out.println(handle1);
	 
	          driver.switchTo().window(handle1);
	 
	          }
		
	}
}
