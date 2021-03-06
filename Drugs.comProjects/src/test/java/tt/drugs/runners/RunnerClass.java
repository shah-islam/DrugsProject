package tt.drugs.runners;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class RunnerClass {

	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
			features = {"/Drugs.comProjects/src/test/resource/Features" }, 
			glue = { "tt.drugs.stepDef" , "tt.utilities" },  monochrome = true)

	public class DrugsRunner extends AbstractTestNGCucumberTests {
		@AfterClass
		public  void writeExtentReport(){
			Reporter.loadXMLConfig(new File ("config/config.xml"));
		
		
		
	}
	
	}
	
}