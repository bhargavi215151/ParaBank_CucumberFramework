package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Product;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductsSD2Demo {
	 WebDriver driver = null;
	 Product Prod;
		
	 @Before
	    public void browserSetup() {
			System.out.println("Browser setup");
			String projectPath = System.getProperty("user.dir");
			 System.out.println("project path is:" +projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    	driver =  new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
	    	driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	    	}
		 
		@After
		public void teardown() {
			System.out.println("closing the window");
			driver.close();
			driver.quit();
			}
	 
	
	 @Given("User launches the application")
	public void user_launches_the_application() {
		 System.out.println("User launches the URL");

	 
	 }

	@When("user clicks on products option")
	public void user_clicks_on_products_option() {
	 Prod = new Product(driver);
		Prod.ProductClick();
	}


	@Then("user is directed to Products page")
	public void user_is_directed_to_products_page() {
		System.out.println("User is on Products page");
	}


	@And("User views and clicks on search field")
	public void user_views_and_clicks_on_search_field() throws InterruptedException {
		 Prod.SearchClick();
		Thread.sleep(2000);
	}

	@Then("Search button is clickable")
	public void search_button_is_clickable() {
	   System.out.println("User is able to click search button");
	  
	  
	}
	@Then("Presence of logo is confirmed")
	public void presence_of_logo_is_confirmed() {
		System.out.println("Logo is present");
		
		
	}
	@And("User is able to view parasoft logo")
	public void user_is_able_to_view_parasoft_logo() {
		Prod.isLogoPresent();
	
	}
	
	 @When("user enters text into the search box and clicks enter")
	 public void user_enters_text_into_the_search_box_and_clicks_enter() throws InterruptedException {
		 Prod.SendData();

	 }

	 @Then("search field is valid")
	 public void search_field_is_valid() {
	     System.out.println("serach field is working fine");
	 }
    
	 @When("clicks on solution")
	 public void clicks_on_solution() {
	     Prod.solutionsClick();
	 }

	 @When("selects a drop down option")
	 public void selects_a_drop_down_option() {
	     Prod.SelectDropDown();
	 }

	 @Then("dropdown is working fine")
	 public void dropdown_is_working_fine() {
	     System.out.println("dropdown is working fine");
	     
	 }
	     

	 @When("user clicks on Language dropdown")
	 public void user_clicks_on_language_dropdown() {
	     Prod.LanguageClick();
	 }
	 @When("user selects on English language")
	 public void user_selects_on_english_language() throws InterruptedException {
	   Prod.Language_select();
	  
	 }

   @Then("the language of page is changed to english")
    public void the_language_of_page_is_changed_to_english() {
    System.out.println("The language of page is changed to english");

   }

	 }

