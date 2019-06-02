package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Util.TestUtil;

public class DriverBase {
	public static WebDriver driver;
	public static Properties prop;
	/*TestBase() class constructor :This  is used to initialize the properties object to 
	 * fetch config env varaibales from config.properties.
	 */
	
	public DriverBase()
	{
	
		prop=new Properties();	
		try {
			System.out.println("i am hear");
			FileInputStream	ip = new FileInputStream(
System.getProperty("C:\\Users\\NAVYA\\eclipse-workspace\\com.qa.bddframework\\src\\main\\java\\Properties\\config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
	//initialization method 
	
	public static void initializaton()
	{
		String browserName=prop.getProperty("broswer");
		
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NAVYA\\AutomationTools\\ChromeDriverDownloadFile\\chromedriver.exe");	
		driver=new ChromeDriver();
		}else if(browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NAVYA\\AutomationTools\\GeckoDriverDownloadFile\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
	
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
