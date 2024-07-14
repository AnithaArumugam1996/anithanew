package mousehandling;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver m2= new ChromeDriver();
		m2.get("https://jqueryui.com/droppable/");
		m2.switchTo().frame(0);
		Actions dd= new Actions(m2);
		WebElement we1 = m2.findElementById("draggable");
		WebElement we2 = m2.findElementById("droppable");
		dd.dragAndDrop(we1, we2).build().perform();
		
		
		
	}

}
