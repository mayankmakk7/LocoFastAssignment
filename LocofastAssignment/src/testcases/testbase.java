package testcases;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class testbase {

	public static WebDriver driver;
//	public static Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"/src/data/plateIQData.xls");

	   
	public void init() {
		System.out.println("launching Chrome browser"); 
	    String currentDirectory = System.getProperty("user.dir");
	   // System.out.println(currentDirectory+"/src/data/chromedriver");
		System.setProperty("webdriver.chrome.driver",currentDirectory+"/src/data/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver = new ChromeDriver(options);
	}
	
}
