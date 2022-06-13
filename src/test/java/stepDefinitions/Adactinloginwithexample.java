package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinloginwithexample {
	public WebDriver driver;
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joe\\eclipse-workspace\\adactincucumber\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	}
	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}
	@Then("it should login redirect to users account")
	public void it_should_login_redirect_to_users_account() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}



}
