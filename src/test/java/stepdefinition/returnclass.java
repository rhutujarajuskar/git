package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class returnclass {

	WebDriver driver;
@Given("user is on homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://uniformm1.upskills.in/admin/");
}


@When("user provides valid credentials {string} {string}")
public void user_provides_valid_credentials(String uname, String upass) {
	driver.findElement(By.id("input-username")).sendKeys(uname);
    driver.findElement(By.id("input-password")).sendKeys(upass);

}

@When("user clicks on submit button")
public void user_clicks_on_submit_button() {
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@When("open Product Returns page")
public void open_Product_Returns_page() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='button-menu']/i")).click();
	
	Thread.sleep(1000);
	WebElement sc=driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart fa-fw']"));
	sc.click();
	Thread.sleep(1000);
	WebElement r=driver.findElement(By.xpath("//ul[@class='collapse in']/li/a[text()='Returns']"));
    r.click();
    Thread.sleep(1000);
}

@Given("Add Product Return details {string} {string} {string} {string} {string} {string}")
public void add_Product_Return_details(String orderID, String Firstname, String lastname, String email, String telephone, String product) {
      driver.findElement(By.xpath("//a[@class='btn btn-primary']/i[@class='fa fa-plus']")).click();
	  driver.findElement(By.id("input-order-id")).sendKeys(orderID);
      driver.findElement(By.id("input-firstname")).sendKeys(Firstname);
	  driver.findElement(By.id("input-lastname")).sendKeys(lastname);
	  driver.findElement(By.id("input-email")).sendKeys(email);
	  driver.findElement(By.id("input-telephone")).sendKeys(telephone);
	  driver.findElement(By.id("input-product")).sendKeys(product);
	
}

@Given("user clicks on save")
public void user_clicks_on_save() {
	  driver.findElement(By.id("//i[@class='fa fa-save']")).click();
}

@When("user need to edit the Product Returns information")
public void user_need_to_edit_the_Product_Returns_information() {
	driver.findElement(By.xpath("//a[@class='btn btn-primary']/i[@class='fa fa-pencil']")).click();
}


@Given("edit the details  {string} {string} {string} {string} {string} {string}")
public void edit_the_details(String orderID1, String Firstname1, String lastname1, String eamil1, String telephone1, String product1) {
	driver.findElement(By.id("input-order-id")).sendKeys(orderID1);
    driver.findElement(By.id("input-firstname")).sendKeys(Firstname1);
	  driver.findElement(By.id("input-lastname")).sendKeys(lastname1);
	  driver.findElement(By.id("input-email")).sendKeys(eamil1);
	  driver.findElement(By.id("input-telephone")).sendKeys(telephone1);
	  driver.findElement(By.id("input-product")).sendKeys(product1);
}

@Then("click on save")
public void click_on_save() {
	 driver.findElement(By.id("//i[@class='fa fa-save']")).click();
}

}
