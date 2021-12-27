package stepDefn1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner1.Run;

public class Script {
	WebDriver driver;
	

	
	@Given("Chrome Browser & URL")
	public void chrome_browser_url() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.myhcl.com/bprhome/home/index");
        
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

        Run.email(driver).sendKeys("mohammed.adnanansari@hcl.com");
		
        Run.next(driver).click();
		
//		Hclelements.password(driver).sendKeys();
		
        Run.signin(driver).click();
		
        Run.yes(driver).click();
		
	   
	}

	@When("Enter iTime in Search Bar and Click on iTime Management System")
	public void enter_i_time_in_search_bar_and_click_on_i_time_management_system() throws InterruptedException {

		
		Run.itime(driver).sendKeys("iTime");
		
        
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li")));
		
		List<WebElement> ele3 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		for(WebElement list:ele3) {
			
			if(list.getText().equalsIgnoreCase("iTime (Time Sheet Management System)")) {
				
				list.click();
				break;
				
			}
		}
	 
		
	}

	@And("Enter Time Duration for current day and Click on Save Button")
	public void enter_time_duration_for_current_day_and_click_on_save_button() {
		

		
		Run.box(driver).sendKeys("9");
		
		
//		Actions a = new Actions(driver);
//		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Run.save(driver).click();
		
		
		
	}

	@Then("Data Saved Successfully")
	public void data_saved_successfully() {
		
		System.out.println("Successfully Saved");
		
		
	}


}
