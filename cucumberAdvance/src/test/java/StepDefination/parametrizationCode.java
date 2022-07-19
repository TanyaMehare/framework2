package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class parametrizationCode {

	WebDriver driver = null;

	@Given("User is on login page")
	public void User_is_on_login_page() {
		System.out.println("Inside:User is on login page");
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
	}

	@When("^User enters([^\"]*) and ([^\"]*)$")
	public void User_enters_username_and_password(String username, String password) {
		System.out.println("Inside:User enters" + username + password);
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("Clicks on login page")
	public void Clicks_on_login_page() throws InterruptedException {
		System.out.println("Inside:Clicks on login page");

		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
	}

	@Then("^User is navigated to the home page and enter ([^\"]*)$")
	public void User_is_navigated_to_the_home_page(String country) throws InterruptedException {
		System.out.println("Inside:User is navigated to the home page and enter country" + country);
		// select country india
		Select drpcountry = new Select(driver.findElement(By.id("country")));
		drpcountry.selectByVisibleText(country);
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
		driver.quit();

	}
}
