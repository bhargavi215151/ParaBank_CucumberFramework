package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	  
	WebDriver driver;
	
	    private By click_Home = By.xpath("//a[contains(text(),'Home')]");
		private By View_ATMS = By.xpath("//li[contains(text(),'ATM Services')]");
		private By ATM_option1 = By.xpath("//a[contains(text(),'Withdraw Funds')]");
		private By ATM_option2 = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/ul[1]/li[3]/a[1]");
		private By ATM_option3 = By.xpath("//a[contains(text(),'Check Balances')]");
		private By ATM_option4 = By.xpath("//a[contains(text(),'Make Deposits')]");
		private By View_Online = By.xpath("//li[contains(text(),'Online Services')]");
		private By Online_option1 = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/ul[2]/li[2]/a[1]");
		private By Online_option2 = By.xpath("//a[contains(text(),'Account History')]");
		private By Online_option3 = By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/ul[2]/li[4]/a[1]");
		private By LN_image = By.xpath("//h4[contains(text(),'Latest News')]");
		
		
		
		
		public Home(WebDriver driver) {
			this.driver = driver;
		}
			
		public void HomeClick() {
			driver.findElement(click_Home).click();
		}
		
		public WebElement ViewAtmServices() {
			return driver.findElement(View_ATMS);
		}
		
		public WebElement ATMOption1() {
			return driver.findElement(ATM_option1);
			
		}
		public WebElement ATMOption2() {
			return driver.findElement(ATM_option2);
			
		}public WebElement ATMOption3() {
			return driver.findElement(ATM_option3);
			
		}public WebElement ATMOption4() {
			return driver.findElement(ATM_option4);
			
		}
		
		
		public WebElement ViewONlineServices() {
			return driver.findElement(View_Online);
		}
		
		public WebElement OnlineOption1() {
			return driver.findElement(Online_option1);
			
		}
		public WebElement OnlineOption2() {
			return driver.findElement(Online_option2);
			
		}public WebElement OnlineOption3() {
			return driver.findElement(Online_option3);
			
		}
		
		
	    public boolean isLNimagePresent() {
	    	 return driver.findElement(LN_image).isDisplayed();
	    }
}



