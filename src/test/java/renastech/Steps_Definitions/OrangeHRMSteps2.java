package renastech.Steps_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import renastech.pages.RecruitmentPage;
import renastech.pages.Verification;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import static renastech.utils.Driver.driver;

public class OrangeHRMSteps2  {
	
	RecruitmentPage recruitmentPage = new RecruitmentPage();
	
	@Given("The user wants to go to orangeHRM application")
	public void the_user_wants_to_go_to_orange_hrm_application() {
		
		Driver.getDriver();
		BrowserUtils.setWaitTime();
		driver.get(ConfigurationsReader.getProperties("urlHRM"));
		driver.manage().window().maximize();
		System.out.println("The website is launched");
		
		
	}
	
	@When("The user wants to enter username and password")
	public void the_user_wants_to_enter_username_and_password() {
		
		BrowserUtils.setWaitTime();
		//driver.get(ConfigurationsReader.getProperties("username"));
		//driver.get(ConfigurationsReader.getProperties("password"));
		
		System.out.println("Enter username and password");
		
		WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
		WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}
	
	@Given("The user wants to to go login")
	public void the_user_wants_to_to_go_login() {
		
		WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();
		
	}
	
	@Then("Th  user wants to navigate recruitment")
	public void th_user_wants_to_navigate_recruitment() {
		BrowserUtils.setWaitTime();
		RecruitmentPage recruitmentPage = new RecruitmentPage();
		recruitmentPage.setRecruitment();
		
		
	}
	
	@Then("Th user wants to add a candidate")
	public void th_user_wants_to_add_a_candidate() {
		
		RecruitmentPage recruitmentPage = new RecruitmentPage();
		recruitmentPage.setAddCandidate();
	}
	
	@Then("the user wants to enter first name as {string} and last name {string}")
	public void the_user_wants_to_enter_first_name_as_and_last_name(String string, String string2) {
	
		/*
		OrangeHRMLogin orangeHRMHome= new OrangeHRMLogin();
        orangeHRMHome.setUsername();
        orangeHRMHome.setPassword();
		 */
		RecruitmentPage recruitmentPage = new RecruitmentPage();
		recruitmentPage.setCandidateName();
		recruitmentPage.setCandidateLastName();
	}
	
	@Then("Th user wants to enter email as {string}")
	public void th_user_wants_to_enter_email_as(String string) {
	
	}
	
	@Then("The user wants to consent to keep data")
	public void the_user_wants_to_consent_to_keep_data() {
		RecruitmentPage recruitmentPage = new RecruitmentPage();
		recruitmentPage.setCandidateEmail();
	}
	
	@Then("The user wants to save")
	public void the_user_wants_to_save() {
		RecruitmentPage recruitmentPage = new RecruitmentPage();
		recruitmentPage.setSaveButton();
	}
	
	@Then("The user wants to verify that the user is created")
	public void the_user_wants_to_verif_that_the_user_is_created() {
		recruitmentPage.setVerifyingSave();
		
	}
}
