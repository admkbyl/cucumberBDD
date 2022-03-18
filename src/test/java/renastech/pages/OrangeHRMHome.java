package renastech.pages;



import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class OrangeHRMHome extends BrowserUtils {

	public OrangeHRMHome(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[.='Dashboard']")
	private WebElement dashboardMessage;

	
	public  void setDashboardMessage(){
		Assert.assertEquals("Dashboard", dashboardMessage.getText() );
	}

	
}