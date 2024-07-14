package seleniumexe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		
		//ob.executeScript("alert('time out')");
		
		ob.executeScript("window.confirm('time out')");
		
		Thread.sleep(3000);
		
		Alert a1 = ob.switchTo().alert();
		a1.accept();
		
		
		
	
	}
}
