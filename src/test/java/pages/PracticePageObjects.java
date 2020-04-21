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
	By tab_switch = By.id("opentab");
	By alert_switch = By.id("name");
	By alert_button = By.id("alertbtn");
	By confirm_button = By.id("confirmbtn");
	/** Web Table -accessing the 3rd row, 3rd column. 
	 * It should be able to access the value at that cell which is 30.
	 * The 1st row is the header row.
	 */
	By cell_select = By.xpath("//table/tbody/tr[4]/td[3]");
	By show_button = By.id("show-textbox");
	By hide_button = By.id("hide-textbox");
	By show_hide_text = By.id("displayed-text");
	
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
		String handle= driver.getWindowHandle();
		Set handles = driver.getWindowHandles();
		for (String handle1 : driver.getWindowHandles()) {
	          System.out.println(handle1);
	          driver.switchTo().window(handle1);
	 
	          }
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(handle);
	}
	
	public void switchTab() {
		driver.findElement(tab_switch).click();
		String handle= driver.getWindowHandle();
		Set handles = driver.getWindowHandles();
		for (String handle1 : driver.getWindowHandles()) {
	          System.out.println(handle1);
	          driver.switchTo().window(handle1);
	 
	          }
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(handle);
	}
	
	public void switchAlert() {
		driver.findElement(alert_switch).click();
		driver.findElement(alert_switch).sendKeys("Anupama");
		driver.findElement(alert_button).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		driver.findElement(alert_switch).click();
		driver.findElement(alert_switch).sendKeys("Anupama");
		driver.findElement(confirm_button).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
	}
	
	public void selectTableCell() {
		String innerText = driver.findElement(cell_select).getText();
		System.out.println("Table Cell = "+ innerText);
	}
	
	public void checkShowHide() {
		driver.findElement(show_button).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Boolean isPresentShow = driver.findElement(show_hide_text).isDisplayed();
		if (isPresentShow) {
			System.out.println("Show button clicked.Show Hide element is displayed");
		}
		else
		{
			System.out.println("Show button clicked.Show Hide element is NOT displayed");
		}
		driver.findElement(hide_button).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Boolean isPresentHide = driver.findElement(show_hide_text).isDisplayed();
		if (isPresentHide) {
			System.out.println("Hide button clicked.Show Hide element is displayed");
		}
		else
		{
			System.out.println("Hide button clicked.Show Hide element is NOT displayed");
		}
	}
}
