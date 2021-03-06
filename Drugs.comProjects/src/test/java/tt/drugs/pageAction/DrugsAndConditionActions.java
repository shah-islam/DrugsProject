package tt.drugs.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import tt.drugs.pageElements.ConditionAndDiseasesElements;
import tt.utilities.SetupDrivers;

public class DrugsAndConditionActions {
	
	ConditionAndDiseasesElements drugsEle;
	
	public  DrugsAndConditionActions() {
		this.drugsEle = new ConditionAndDiseasesElements();
		PageFactory.initElements(SetupDrivers.driver, drugsEle);
	}
	
	public void homePage() {
		SetupDrivers.driver.get("https://www.drugs.com/");
		SetupDrivers.driver.manage().window().maximize();				
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void deseaseAndCondition() {
		drugsEle.carouselIcon.click();
		drugsEle.deseaseAndCondition.click();
		
		
	}
	
	public void searchText() {
		
		drugsEle.searchText.sendKeys("Fever");
	}
	
	public void feverMsg() {
		drugsEle.feverMsg.isDisplayed();
	
	}

}
