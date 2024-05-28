package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launch Browser");
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdatesAvailable();
	}
	
	private void checkBrowserVersion() {
		System.out.println("Checking browser version");
	}
	
	private void checkOSCompatibility() {
		System.out.println("Checking OS Compatibility");
	}

	private void checkRAMSpace() {
		System.out.println("Checking RAM Space");
	}

	private void checkUpdatesAvailable() {
		System.out.println("Checking Updates Available");
	}
	
	//Examples of Encapsulation in Selenium
			//click(button xpath) --> isVisible(button) --> isClickabled(button)-->isHegiht(button)
			//public driver.get(url) --> urlisNull() --> https() --> accessUrl() --format()
			
			//*The internal calls and functioning of an application are declared as 'private' and the method the 
			//users need to access are declared a 'public'

}
