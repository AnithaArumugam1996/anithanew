package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class E3 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		ob.executeScript("document.body.style.zoom='200%'");
		Thread.sleep(4000);
		ob.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(4000);
		ob.executeScript("document.body.style.zoom='75%'");
		Thread.sleep(4000);
		
	}

}
