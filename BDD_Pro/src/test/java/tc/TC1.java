package tc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.findby.By;

public class TC1 {
	
	ChromeDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ZEAHDCE\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com");
	   driver.manage().window().maximize();
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
	   WebElement user=driver.findElement(By.id("email"));
	   user.sendKeys("Deepak");
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Deepak");
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();
	}


}
