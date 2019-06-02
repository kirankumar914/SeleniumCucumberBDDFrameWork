package StepDefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealPageStepDefination {
	
WebDriver driver;
		
//	@Then("User enetrs login username and passowrd.$")
//	public void user_enetrs_login_username_and_passwrod(DataTable credentials) {
//			List<List<String>> data = credentials.raw();
//		 driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
	
	@Then("^user moves to New deal page\\.$")
	public void user_moves_to_New_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	  
	}

//	@Then("^user enter deal details\\.$")
//	public void user_enter_deal_details(DataTable dealData ) {
//		 List<List<String>> dealValues =  dealData.raw();
//		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//	    
//	}

}
