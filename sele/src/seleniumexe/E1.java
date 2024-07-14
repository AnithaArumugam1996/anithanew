package seleniumexe;

import org.openqa.selenium.chrome.ChromeDriver;

public class E1 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		System.out.println(ob.executeScript("return document.tittle"));
		
		System.out.println(ob.executeScript("return document.URL"));
		
		
		ob.quit();
	}

}
