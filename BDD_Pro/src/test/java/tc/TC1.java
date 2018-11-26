package tc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import net.thucydides.core.annotations.findby.By;

public class TC1 {
	
	ChromeDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signin.click();
		Thread.sleep(3000);
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
		
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));
		email.sendKeys("jitenderahuja06@gmail.com");
		Thread.sleep(3000);
		
		WebElement nextemail = driver.findElement(By.xpath("//span[text()='Next']"));
		nextemail.click();
		Thread.sleep(3000);
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("@naukrijob");
		Thread.sleep(3000);
		
		WebElement nextpwd = driver.findElement(By.xpath("//span[text()='Next']"));
		nextpwd.click();
		Thread.sleep(3000);
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		System.out.println("URL of current page is: "+driver.getCurrentUrl());
		driver.close();
	}


}