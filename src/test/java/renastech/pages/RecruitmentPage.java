package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static renastech.utils.Driver.driver;

public class RecruitmentPage {

	public RecruitmentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	private WebElement recruitment ;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	private WebElement addCandidate;
	
	@FindBy (xpath = "//input[@id='addCandidate_firstName']")
	private WebElement candidateName;
	
	@FindBy(id = "addCandidate_lastName")
	private WebElement candidateLastName;
	
	@FindBy(id = "addCandidate_email")
	private WebElement candidateEmail;
	
	@FindBy(id = "addCandidate_consentToKeepData")
	private WebElement keepData;
	
	@FindBy(id = "btnSave")
	private WebElement saveButton;
	
	@FindBy(id = "resultTable")
	private WebElement verifyingSave;
	
	public void setRecruitment (){
	recruitment.click();
		}
	
	public void setAddCandidate(){
		addCandidate.click();
	}
	
	public void setCandidateName(){
		
		candidateName.sendKeys("Adem");
	}
	public void setCandidateLastName(){
		candidateLastName.sendKeys("Kaba");
	}
	public void setCandidateEmail(){
		candidateEmail.sendKeys("aamcikali@otuzbir.com");
	}
	public void setKeepData(){
		keepData.click();
	}
	public void setSaveButton(){
		saveButton.click();
	}
	public void setVerifyingSave(){
		setVerifyingSave();
	}
	
}
