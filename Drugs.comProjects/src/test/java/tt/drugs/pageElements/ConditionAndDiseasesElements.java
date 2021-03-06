package tt.drugs.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConditionAndDiseasesElements {
	

	@FindBy(xpath = "//body/div[@id='wrap']/div[@id='inner-wrap']/div[2]/div[1]/button[2]/*[1]")
	public WebElement carouselIcon;
	
	@FindBy(xpath = "//*[@id=\"inner-wrap\"]/div[2]/div/ul/li[5]/a/img")
	public WebElement deseaseAndCondition;
	
	
	@FindBy(xpath = "//*[@id=\"livesearch-condition-docs\"]")
	public WebElement searchText;
	
	
	@FindBy(xpath = "//h1[contains(text(),'Fever')]")
	public WebElement feverMsg;
     
	

}
