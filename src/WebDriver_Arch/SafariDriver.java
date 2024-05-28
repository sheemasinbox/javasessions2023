package WebDriver_Arch;

public class SafariDriver implements WebDriver {

	//Constructor
	public SafariDriver() {
		System.out.println("Safari is launched");
	}
	
	@Override
	public void get(String url) {
		System.out.println("launch url: " +url);
		
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public String getURL() {
		return "https://www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("Click on element: "+eleName);
		
	}

	@Override
	public void sendKeys(String eleName, String value) {
		System.out.println("Entering value in: "+eleName+" Value "+value);
		
	}

	@Override
	public void close() {
		System.out.println("Browser is closed");
		
	}

	@Override
	public void findElement(String eleName) {
		System.out.println("Find Element: "+eleName);
		
	}

	@Override
	public void findElements() {
		System.out.println("Find Elements on the page: ");
		
	}

	
	
}
