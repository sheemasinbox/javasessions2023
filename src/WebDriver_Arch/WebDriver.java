package WebDriver_Arch;

public interface WebDriver extends SearchContext{

	public void get(String url);
	
	public String getTitle();   //return String
	
	public String getURL();
	
	public void click(String eleName);
	
	public void sendKeys(String eleName, String value);
	
	public void close();
	
	//SearchContext Interface methods
	@Override
	public void findElement(String eleName);
	
	@Override
	public void findElements();
	
}
