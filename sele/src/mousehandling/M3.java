package mousehandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver m3= new ChromeDriver();
		m3.get("https://jqueryui.com/slider/");
        m3.switchTo().frame(0);
        Actions dd= new Actions(m3);
        WebElement web = m3.findElementById("slider");
        dd.dragAndDropBy(web, 200, 0).build().perform();
        
		
	}



}
