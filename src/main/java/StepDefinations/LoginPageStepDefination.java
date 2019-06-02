package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.LoginPage;
import TestBase.DriverBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDefination {
	
	WebDriver driver;
	
	@Given("^user is already available loginpage.$")
	public void user_is_already_on_loginPage()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NAVYA\\AutomationTools\\GeckoDriverDownloadFile\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("https://classic.crmpro.com/login.cfm");
	}
	
	@When("^title of the login page is Free CRM.$")
	public void titile_of_the_login_page()
	{
		 String title = driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals("CRMPRO Log In Screen", title);
	}
	
	//Regular Expression: for data driven testing.
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\" 
	
	@Then("^User enetrs login deatils i\\.e\\. \\\"(.*)\\\" and \\\"(.*)\\\".$")
	public void user_enetrs_login_deatils_i_e_username_and_passwrod(String username,String password) {
		
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	
	}

	@Then("^User clicks on submit button\\.$")
	public void user_clicks_on_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	   
	}

	@Then("^user is in HomePage\\.$")
	public void user_is_in_HomePage() {
		String homePageTitle=driver.getTitle();
		Assert.assertEquals("CRMPRO", homePageTitle);	  
	}
	
	@Then("^close the browser\\.$")
	public void close_the_browser(){
	    driver.quit();
	    
	}

}
