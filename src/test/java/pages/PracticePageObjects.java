package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticePageObjects {
	private static WebDriver driver = null;
	By radiobutton_click = By.xpath("//input[@value='radio1']");
	
	public PracticePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public void clickRadioButton() {
		driver.findElement(radiobutton_click).click();
	}

}
