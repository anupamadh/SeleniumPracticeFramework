package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramesPage {
	private static WebDriver driver = null;
	By iframe_select = By.tagName("iframe");
	By linkText_click = By.xpath("//*[contains(text(),'Software Testing Tutorial')]");
	
	public IFramesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void iframeCount() {
		System.out.println("Number of iframes on the page = " + driver.findElements(iframe_select).size());
	}
	
	public void switchFrame() {
		driver.switchTo().frame(0);
		//click on a link
		driver.findElement(linkText_click).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//switch back to main page
	}
}
