package stepDefinition;
import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;
import org.apache.commons.configuration.ConfigurationException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
public class SampleStepdefinition {

	private WebDriver driver;
	public java.lang.String baseUrl;
	java.lang.String baseUrl2 = "https://www.yahoo.com/";
	By firstname =By.cssSelector("#FirstName");
	By lastname = By.cssSelector("#LastName");
	
	
	
	@Given("^I am on the gmail Registration page$")
	public void launch() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Training\\chromedriver_win32\\chromedriver.exe");  
		driver = new FirefoxDriver();
		baseUrl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(baseUrl);  
	}

	@When("^I enter the details$")
	public void details() throws Throwable {
		driver.findElement(firstname).clear();
		driver.findElement(firstname).sendKeys("Daniyal");
      driver.findElement(lastname).clear();
      driver.findElement(lastname).sendKeys("Syed");
      driver.findElement(By.cssSelector("#GmailAddress")).clear();
      driver.findElement(By.cssSelector("#GmailAddress")).sendKeys("SyedDaniyall11111@gmail.com");
      driver.findElement(By.cssSelector("#Passwd")).clear();
		driver.findElement(By.cssSelector("#Passwd")).sendKeys("Daniyal1!");
		driver.findElement(By.cssSelector("#PasswdAgain")).clear();
		driver.findElement(By.cssSelector("#PasswdAgain")).sendKeys("Daniyal1!");
		   
	}
	
		@Then("^I validate the text$")
	public void validate() throws Throwable {
	
			java.lang.String actualtext = driver.findElement(By.xpath("//*[@id=\"BirthdayLabel\"]")).getText();
			System.out.println(actualtext);
			
			java.lang.String expectedtext = "Bthday";
			
			assertEquals(expectedtext, actualtext);
   
	}
		
		public void close() throws Throwable {
			
			driver.quit();
   
	}
	
}
