package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {
	
    WebDriver driver;
   
   
	private By Click_Product = By.xpath("//*[text() = 'Products']");
	private By Search_entry  = By.xpath("//header/div[1]/div[1]/div[2]/div[3]/div[2]/form[1]/label[1]/input[1]");
	private By Click_Search = By.xpath("//span[@class='search-icon']");
	private By Logo_present = By.xpath("/html/body/header/div[2]/div/div[1]/a/img");
	private By Click_solution = By.xpath("//header/div[2]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");
	private By select_DropDown = By.xpath("//a[contains(text(),'Static Analysis')]");
	private By clicks_Language = By.xpath("//select[@id='gtranslate_selector']");
	private By select_language = By.id("gtranslate_selector");
	
		
	public Product(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ProductClick(){
		driver.findElement(Click_Product).click();
	}
	 
	public void SearchClick() {
		driver.findElement(Click_Search).click();
	}

    public boolean isLogoPresent() {
    	 return driver.findElement(Logo_present).isDisplayed();
    }
    
   public void  SendData() throws InterruptedException {
	 WebElement key = driver.findElement(Search_entry);
	 key.sendKeys("Industries");
	 Thread.sleep(2000);
	 key.sendKeys(Keys.ENTER);
	  }
  
   public void solutionsClick() {
	   driver.findElement(Click_solution).click();
   }
   
   public void SelectDropDown() {
	   driver.findElement(select_DropDown).click();
   }
   
   public void LanguageClick() {
	   driver.findElement(clicks_Language).click();
   }
  public void Language_select() throws InterruptedException {
	  WebElement ele = driver.findElement(select_language);  
		 Select eng = new Select(ele); 
		 Thread.sleep(2000);
		 eng.selectByVisibleText("Español");
		 Thread.sleep(2000);
  }
  
   
}