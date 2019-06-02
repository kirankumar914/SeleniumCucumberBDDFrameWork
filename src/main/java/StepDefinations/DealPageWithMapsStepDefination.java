package StepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class DealPageWithMapsStepDefination {
	
	WebDriver driver;

	@Then("User enetrs login username and password$")
	public void user_enetrs_login_username_and_passwrod(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			
			           System.out.println(data.get("username"));
			           System.out.println(data.get("password"));
						driver.findElement(By.name("username")).sendKeys(data.get("username"));
						driver.findElement(By.name("password")).sendKeys(data.get("password"));
			
					}
	}
	
	@Then("^user enter deal details$")
	public void user_enters_contacts_details(DataTable dealData) {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

}
}
