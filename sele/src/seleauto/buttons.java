package seleauto;

import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		ob.findElementByLinkText("Images").click();
		
	}

}

