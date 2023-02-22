package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Home;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeSD {
	WebDriver driver = null;
	Home home;

	
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
		driver.close();
		driver.quit();
		}
    
    @When("user clicks on Home page option")
public void user_clicks_on_home_page_option() {	
	home = new Home(driver);
    home.HomeClick();	
}
	
@Then("user is directed to Home  page")
public void user_is_directed_to_home_page() {
   System.out.println("User is on Home page");
}

@When("user is able to view ATM services")
public void user_is_able_to_view_atm_services() {
	WebElement e = home.ViewAtmServices();
	System.out.println(e.getText());
   
}

@When("User is able to view   Withdrawal funds, Transfer funds, check balances, make deposits  of Online services")
public void user_is_able_to_view_withdrawal_funds_transfer_funds_check_balances_make_deposits_of_online_services() {
	WebElement o1 = home.ATMOption1();
	System.out.println(o1.getText());
	WebElement o2 = home.ATMOption2();
	System.out.println(o2.getText());
	WebElement o3 = home.ATMOption3();
	System.out.println(o3.getText());
	WebElement o4= home.ATMOption4();
	System.out.println(o4.getText());
	
}

@Then("All the contents of ATM services are present")
public void all_the_contents_of_atm_services_are_present() {
  System.out.println("All the contents of ATM services are present");
  
}

@When("user is able to view  Online services")
public void user_is_able_to_view_online_services() {
	WebElement W = home.ViewONlineServices();
	System.out.println(W.getText());
	
}

@When("User is able to view  Bill pay,Account History,Transfer funds of Online services")
public void user_is_able_to_view_bill_pay_account_history_transfer_funds_of_online_services() {
	WebElement o1 = home.OnlineOption1();
	System.out.println(o1.getText());
	WebElement o2 = home.OnlineOption2();
	System.out.println(o2.getText());
	WebElement o3 = home.OnlineOption3();
	System.out.println(o3.getText());
	
}

@Then("All the contents of Online services are present")
public void all_the_contents_of_online_services_are_present() {
   System.out.println("All the contents of Online services are present");
   
}

@Then("User is directed to the page")
public void user_is_directed_to_the_page() {
   System.out.println("User is directed to the page");
   
}
@When("User is able to view Latest News image")
public void user_is_able_to_view_latest_news_image() {
	home.isLNimagePresent();
}

@Then("The presence of Latest news image is guaranteed")
public void the_presence_of_latest_news_image_is_guaranteed() {
	  System.out.println("The presence of Latest news image is guaranteed");
	 
	 
}

@Then("user is directed to Home page")
public void user_is_directed_to_home_page1() {
 System.out.println("user is directed to Home page");
 
}

	


}
