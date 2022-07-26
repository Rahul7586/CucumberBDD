package testdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinations {
	
	WebDriver driver;
	@Given("Open the browser and lunch the application")
	public void open_the_browser_and_lunch_the_application() {
		System.out.println("Step 1 : Lunch the application");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enter userid and password")
	public void user_enter_userid_and_password() {
		System.out.println("Step 2 : Enter the login details");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Step 3 : User click on login");
	    driver.findElement(By.xpath("//input[@id ='btnLogin']")).click();
	}

	@Then("User landing on home page")
	public void user_landing_on_home_page() {
		System.out.println("Step 4 : landed on home page");
		driver.close();
	}
	
	
	
}
