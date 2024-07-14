package Selenavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class nav1 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe" );
		//System.setProperty("webdriver.chrome.dr"E:\\Anitha-Java\\CHROME DRIVER\\chromedriver-win64\\chromedriver.exe"iver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    
	   //open seleniumeasy.com in new tab   
	 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
	 
	 
	 

	 
	 //get the control of first tab:  driver.getwiindowhandle()=> parent
	 //get the contorl pf both tabs:  driver.getwindowhandles()=> s={google.com,seleniumeasy.com}
	 
	 String parent=driver.getWindowHandle();// control will be in the parent window //google
	 // collecting all the handle
	  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
	 
	  
	  
	  
	  //step3: itearte through the set
	  //hasnext
	  // next
	 
	  Iterator<String> I1 = s1.iterator();  // hasNext , next()

	  // hasnext=> whether content is there
	  // next -> read the content 
	  
	 
	 while(I1.hasNext())// whether any content is there 
	    {
	      String child_window=I1.next();
	      if(!parent.equals(child_window))// picking the seleniumeasy.com
	    	  { // control is moved to child window 
	        driver.switchTo().window(child_window);
	        System.out.println(driver.getTitle());
	        Thread.sleep(4000);
	        driver.findElementByLinkText("Maven").click();
	        Thread.sleep(4000);
	        driver.close();
	      } 
	       
	     /*parent=googl.com   s={google.com, seleniumeasy.com}
	      * 
	      * first iteration: I1 points to first element in set , I1 points to google.com
	      * I1.hasnext=> content
	      *     I1.next reads google.com and store in child_Window
	      *     child_Window=gpoogle
	      *     if parent!=child_Window
	      *        google!=google
	      *        
	      *        
	      * second iteration: I1 points to second element in set, I1 points to seleniumeasy.com
	      * I1.hasnext=> content
	      *    I1.next reads google.com and store in child_Window
	      *    child_window=seleniumeasy.com
	      *    if parent!=childW_indow
	      *      google!=seleniumeasy.com
	      *         switching control to seleniumeasy.com
	      *         title
	      *         4 seconds
	      *         Maven
	      *         4 seconds
	      *         close , the seleniumeasy.com
	      *     * */
	    
	  }

	    driver.switchTo().window(parent);//google 
	    System.out.println(driver.getTitle());// google
	  
	    Thread.sleep(5000);
	    driver.findElementByLinkText("Images").click();
	    Thread.sleep(5000);
	    driver.quit();
	}


}
