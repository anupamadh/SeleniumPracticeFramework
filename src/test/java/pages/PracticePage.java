package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	private static WebElement element = null;
	
	public static WebElement radiobutton_click(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[@value='radio1']"));
		return element;
		
	}
}
