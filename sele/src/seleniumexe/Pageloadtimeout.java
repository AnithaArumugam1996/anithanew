package seleniumexe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadtimeout {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		
		
		ob.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		ob.get("http://demoqa.com/");
		
		
	}

}
