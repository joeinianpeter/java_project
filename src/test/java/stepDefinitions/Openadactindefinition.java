package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Openadactindefinition {

	public WebDriver driver;

	@Given("user adactin.com")
	public void user_adactin_com() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\joe\\eclipse-workspace\\adactincucumber\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");

	}

	@When("user  the username {string}")
	public void user_the_username(String username) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(username);
	}

	@When("user  the password {string}")
	public void user_the_password(String password) {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("logged in successfully");
	}

	@Given("user enters the location")
	public void user_enters_the_location() {
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(2);
	}

	@Given("user enters the hotel")
	public void user_enters_the_hotel() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s = new Select(hotel);
		s.selectByValue("Hotel Hervey");
	}

	@Given("user enters the room type")
	public void user_enters_the_room_type() {
		WebElement room = driver.findElement(By.id("room_type"));
		Select s = new Select(room);
		s.selectByIndex(2);
	}

	@Given("user enters the number of rooms")
	public void user_enters_the_number_of_rooms() {
		WebElement rooms = driver.findElement(By.id("room_nos"));
		Select s = new Select(rooms);
		s.selectByVisibleText("2 - Two");
	}

	@Given("user enters check in date")
	public void user_enters_check_in_date() {
		WebElement indate = driver.findElement(By.id("datepick_in"));
		indate.sendKeys("03-05-2022");
	}

	@Given("user enters check out date")
	public void user_enters_check_out_date() {
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		outdate.sendKeys("05-05-2022");
	}

	@Given("user enters adults per room")
	public void user_enters_adults_per_room() {
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s = new Select(adults);
		s.selectByVisibleText("3 - Three");
	}

	@Given("user entes childerns per room")
	public void user_entes_childerns_per_room() {
		WebElement childrens = driver.findElement(By.id("child_room"));
		Select s = new Select(childrens);
		s.selectByVisibleText("2 - Two");
	}

	@Then("user clicks on search button")
	public void user_clicks_on_search_button() {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@Then("user clicks on select button")
	public void user_clicks_on_select_button() {
	WebElement select = driver.findElement(By.id("radiobutton_0"));
	select.click();
	}
	@Then("user clicks on continue")
	public void user_clicks_on_continue() {
    WebElement contin = driver.findElement(By.id("continue"));
    contin.click();
	}

}
