package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearch {
	WebDriver driver = null;


	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path" +projectPath);
		System.setProperty("webdriver.chrome.driver" , projectPath+ "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}

	@And("user on search page")
	public void user_on_search_page() {
		driver.get("https://www.google.com");
		System.out.println("search page");
	}

	@When("user enters text in search")
	public void user_enters_text_in_search() {
		driver.findElement(By.id("APjFqb")).sendKeys("abc");
		System.out.println("text enter");
	}

	@And("hits Enter")
	public void hits_enter() {
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println("enter button clicked");
	}

	@Then("user navigated to search result")
	public void user_navigated_to_search_result() {
		driver.getPageSource().contains("Academic Bank of Credits: ABC");
		System.out.println("navigated to search result");
	}


}