package mousehandling;


import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver dp= new ChromeDriver();
		dp.get("https://jqueryui.com/datepicker/");
		dp.switchTo().frame(0);
		dp.findElementById("datepicker").click();
		for(int i=0; i<3; i++)
		{
			dp.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		
		dp.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a").click();
		
		
		
	}

}
