package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PracticePageObjects {
	private static WebDriver driver = null;
	By radiobutton_click = By.xpath("//input[@value='radio1']");
	By autocomplete_select = By.id("autocomplete");
	
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

}
