package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook {
public WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joe\\eclipse-workspace\\adactincucumber\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@When("user enters the username and password")
	public void user_enters_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials = dataTable.transpose().asList(String.class);
		String username = credentials.get(0);
		String password = credentials.get(1);
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
	}
	@Then("user will not be able to login")
	public void user_will_not_be_able_to_login() {
	 System.out.println("failed");
	}

}
