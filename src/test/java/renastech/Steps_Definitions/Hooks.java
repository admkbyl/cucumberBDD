package renastech.Steps_Definitions;

import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BrowserUtils {

	
	@Before
	public void setup() {
		Driver.getDriver();
		BrowserUtils.setWaitTime();
		driver.manage().window().maximize();
		driver.get(ConfigurationsReader.getProperties("urlHRM"));
	}
}