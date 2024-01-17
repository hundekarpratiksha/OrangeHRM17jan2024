package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStep {
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	     driver.manage().deleteAllCookies();
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	@When("user enter valid creentials")
	public void user_enter_valid_creentials() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.name("//button[text()=' Login ']")).click();
		}
	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

}
