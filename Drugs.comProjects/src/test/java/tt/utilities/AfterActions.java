package tt.utilities;

import cucumber.api.java.After;
import tt.utilities.SetupDrivers;

public class AfterActions {
	
	@After
	public void afterActions(){
		SetupDrivers.tearDownDriver();
		System.out.println("-------Test Complited");
	}

}
