package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebookwithheaderdef {
	
	
	public WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joe\\eclipse-workspace\\adactincucumber\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@When("user enter the valid credentials")
	public void user_enter_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> asMap = dataTable.asMaps(String.class, String.class);
		String username = asMap.get(0).get("username");
		String password = asMap.get(0).get("password");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
	}
	@Then("it should be logged in")
	public void it_should_be_logged_in() {
		 System.out.println("failed");
	}




}
