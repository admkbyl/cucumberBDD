package renastech.Steps_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

import java.util.List;

public class OrangeHRMSteps {
	
	
	@Given("The user wants to go orangeHRM application")
	public void the_user_wants_to_go_orange_hrm_application() {
		
		System.out.println("This is login step");
		Driver.getDriver().get("https://opensource-demo.orangehrmlive.com");
		
	}
	
	@When("The user wants  enter username ans password")
	public void the_user_wants_enter_username_ans_password() {
		
		System.out.println("Enter username and password");
		
		WebElement username = Driver.getDriver().findElement(By.id("txtUsername"));
		WebElement password = Driver.getDriver().findElement(By.id("txtPassword"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
	}
	
	@Then("The user wants to click login")
	public void the_user_wants_to_click_gin() {
		System.out.println("Click login button");
		
		WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();
		
		
	}
	
	@Then("The user should  able to navigate dashboard")
	public void the_user_should_able_to_navigate_dashboard() {
		System.out.println("The user should be able to see dashboard");
		
		WebElement dashboard = Driver.getDriver().findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
		dashboard.click();
		
		Assert.assertTrue(dashboard.isDisplayed());
		//Driver.getDriver().close();
		
	}
	
	@When("the user wants to enter username as {string} and the password as {string}")
	public void the_user_wants_to_enter_username_as_and_the_password_as(String username, String password) {
		
		System.out.println("This is a username: " + username);
		System.out.println("This is a password: " + password);
		
		WebElement userName = Driver.getDriver().findElement(By.id("txtUsername"));
		WebElement passWord = Driver.getDriver().findElement(By.id("txtPassword"));
		
		
		userName.sendKeys(username);
		passWord.sendKeys(password);
	}
	
	@Then("The user wants to go to the PIM page")
	public void the_user_wants_to_go_to_the_pim_page() {
		
		WebElement pimPage = Driver.getDriver().findElement(By.id("menu_pim_viewPimModule"));
		pimPage.click();
		
	}
	
	@Then("The user wants to see add employee page")
	public void the_user_wants_to_see_add_employee_page() {
		
		WebElement addEmployee = Driver.getDriver().findElement(By.id("menu_pim_addEmployee"));
		addEmployee.click();
		
	}
	
	@Then("The user wants to add user name as {string}")
	public void the_user_wants_to_add_user_name_as(String name) {
		WebElement usernameBox = Driver.getDriver().findElement(By.id("firstName"));
		usernameBox.sendKeys(name);
		
	}
	
	@Then("The user wants to add user last name as {string}")
	public void the_user_wants_to_add_user_last_name_as(String lastname) {
		WebElement lastnameBox = Driver.getDriver().findElement(By.id("lastName"));
		lastnameBox.sendKeys(lastname);
		
	}
	
	@Then("The user wants to save the information")
	public void the_user_wants_to_save_the_information() {
		
		WebElement saveClick = Driver.getDriver().findElement(By.id("btnSave"));
		saveClick.click();
		
		
	}
	
	@Then("The user should be able to see {string}")
	public void the_user_should_be_able_to_see(String personalDetailText) {
		
		WebElement personalDetails = Driver.getDriver().findElement(By.xpath("//h1[.='Personal Details']"));
		Assert.assertEquals(personalDetails.getText(), personalDetailText);
		
		
	}
	
	@Then("The user wants to click edit")
	public void the_user_wants_to_click_edit() {
		
		WebElement editButton = Driver.getDriver().findElement(By.id("btnSave"));
		editButton.click();
	}
	
	@Then("the user wants to update Driver's License Number as \"{int}-{int}-{int}")
	public void the_user_wants_to_update_driver_s_license_number_as(Integer int1, Integer int2, Integer int3) {
		WebElement driversLicenses = Driver.getDriver().findElement(By.id("personal_txtLicenNo"));
		driversLicenses.sendKeys("123-456-789");
	}
	
	@Then("the user wants to update Driver's License Expiry Date")
	public void the_user_wants_to_update_driver_s_license_expiry_date() {
		WebElement expiryDate = Driver.getDriver().findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])"));
		expiryDate.click();
		
		Select select = new Select(Driver.getDriver().findElement(By.cssSelector(".ui-datepicker-month")));
		select.selectByVisibleText("Dec");
		Select select1 = new Select(Driver.getDriver().findElement(By.cssSelector(".ui-datepicker-year")));
		select1.selectByVisibleText("2023");
		
		List<WebElement> daySelect = Driver.getDriver().findElements(By.cssSelector("a[class='ui-state-default"));
		for (WebElement day : daySelect) {
			String str = day.getText();
			if (str.equalsIgnoreCase("25")) {
				day.click();
			}
		}
		
		
		//expiryDate.sendKeys(1);
		
		
	}
	
	@Then("the user wants to update Marital Status")
	public void the_user_wants_to_update_marital_status() {
		
		Select select = new Select(Driver.getDriver().findElement(By.id("personal_cmbMarital")));
		select.selectByVisibleText("Single");
		
		
	}
	
	@Then("the user wants to update Nationality")
	public void the_user_wants_to_update_nationality() {
		
		
		Select select1 = new Select(Driver.getDriver().findElement(By.xpath("(//select[@id='personal_cmbNation'])")));
		select1.selectByVisibleText("Turkish");
	}
	
	@Then("the user wants to update Date of Birth")
	public void the_user_wants_to_update_date_of_birth() {
		
		WebElement dateBirth = Driver.getDriver().findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]"));
		dateBirth.click();
		
		Select select3 = new Select(Driver.getDriver().findElement(By.cssSelector(".ui-datepicker-month")));
		select3.selectByVisibleText("Feb");
		Select select1 = new Select(Driver.getDriver().findElement(By.cssSelector(".ui-datepicker-year")));
		select1.selectByVisibleText("1990");
		
		List<WebElement> daySelect = Driver.getDriver().findElements(By.cssSelector("a[class='ui-state-default"));
		for (WebElement day : daySelect) {
			String str = day.getText();
			if (str.equalsIgnoreCase("2")) {
				day.click();
			}
		}
		
		
	}
	
	@Then("the user wants to update Gender")
	public void the_user_wants_to_update_gender() {
		
		WebElement genderme = Driver.getDriver().findElement(By.xpath("(//input[@id='personal_optGender_1'])[1]"));
		genderme.click();
	}
	
	@Then("The user add attachment and upload a sample file And verify the file")
	public void the_user_add_attachment_and_upload_a_sample_file_and_verify_the_file() {
		
		
		Driver.getDriver().findElement(By.id("btnAddAttachment")).click();
		WebElement file = Driver.getDriver().findElement(By.id("ufile"));
		file.sendKeys("/Users/ademkabayel/Downloads/doc.txt");
		
		Driver.getDriver().findElement(By.id("btnSaveAttachment")).click();
		WebElement doc = Driver.getDriver().findElement(By.cssSelector("a[class='fileLink tiptip']"));
		Assert.assertTrue(doc.isDisplayed());
	}
}