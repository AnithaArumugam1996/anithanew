package xtras;

import org.openqa.selenium.chrome.ChromeDriver;

public class D1 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
		
	}

}
