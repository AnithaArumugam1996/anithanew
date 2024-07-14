package mousehandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Mouse Handling
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver m= new ChromeDriver();
		m.get("http://www.mycontactform.com");
		WebElement ele = m.findElementByName("btnSubmit");
		Actions ac= new Actions(m);
		//ac.click(ele).build().perform();
		/* ac.clickAndHold(ele).build().perform();
		Thread.sleep(4000);
		ac.release(ele).build().perform(); */
		ac.moveToElement(ele).click().build().perform();
		
		
		
	}

}
