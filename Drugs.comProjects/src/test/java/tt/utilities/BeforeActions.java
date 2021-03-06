package tt.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import tt.utilities.SetupDrivers;

public class BeforeActions {
	
	@Before
	public void beforeActions(Scenario scen) {
		System.out.println(">>Initializing ChromeDriver<<");
		SetupDrivers.setupDriver();
		System.out.println( scen.getName());
		

}
}
