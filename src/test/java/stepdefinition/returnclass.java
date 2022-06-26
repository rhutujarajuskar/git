package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class returnclass {

	WebDriver driver;
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://uniformm1.upskills.in/admin/");
	}

	@When("user enter valid credentnials")
	public void user_enter_valid_credentnials() {
	    driver.findElement(By.id("input-username")).sendKeys("Admin");;
	    driver.findElement(By.id("input-password")).sendKeys("Admin@123");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("validation message appears")
	public void validation_message_appears() {
	    System.out.println("hiiiiiiiiiiiiiii");
	}

	
	@Given("open Product Returns page")
	public void open_Product_Returns_page(io.cucumber.datatable.DataTable dataTable) {
	

		driver.findElement(By.xpath("//i[@class='fa fa-indent fa-lg']")).click();
		driver.findElement(By.xpath("//i[@class= 'fa fa-shopping-cart fa-fw']")).click();
		//driver.findElement(By.xpath("//ul[@class='collapse in']/li[@class='active open']")).click();
		
		////ul[@class='collapse in']/li[@class='active open']/a[text()='Returns']
	}

}
