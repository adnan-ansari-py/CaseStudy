package runner1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	
@CucumberOptions(features="src/test/java/Features1",glue="stepDefn1")

public class Run extends AbstractTestNGCucumberTests {
	
public static WebElement email(WebDriver driver) {
		
		return driver.findElement(By.id("i0116"));
		}
	
	
	public static WebElement next(WebDriver driver) {
		
		return driver.findElement(By.id("idSIButton9"));
		}
	

	public static WebElement password(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("i0118"));
	}
	
	public static WebElement signin(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"lightbox\"]/div[3]/div/div[2]/div/div[4]/div[2]/div/div/div/div"));
	}
	
	public static WebElement yes(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"lightbox\"]/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]"));
	}
	
	public static WebElement itime(WebDriver driver) {
		
	return driver.findElement(By.id("txtSearch"));
	}
	
	public static WebElement box(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"mCSB_5_container\"]/span/div[2]/div/div/div/div/div/div[2]/div/div/div/div/input"));
	}
	
	public static WebElement save(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\"le_apply\"]"));
	}
	
}

