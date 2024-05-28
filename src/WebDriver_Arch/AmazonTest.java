package WebDriver_Arch;

import ExceptionHandling.MyException;

public class AmazonTest {

//	public static WebDriver driver;   //class vars need not be initialized
	
	public static void main(String[] args) {
		
	//	ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
		
		//Top Casting:
		//Advantage: Parallel execution of TC's
		String browser = "ie";  //user input/xml/excel
		
		//default value of obj ref is null
		WebDriver driver = null;        //local vars should be initialized
		
		//cross browser logic -- with Top Casting --switch case/if else
		//initiate driver only once
		//parallel run
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			//default value of driver is null, so driver.get() will throw NullPointerException as null.any method() will give NPE
			System.out.println("PLz pass right browser");
			throw new MyException("WrongBrowserException"); //Custom Exception created
	//		break;
		}
		
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("Title is: " +title);
		
		if (title.equals("amazon")) {
			System.out.println("title is pass");
		}
		else {
			System.out.println("title is fail");
		}
		
		String url = driver.getURL();
		System.out.println(url);
		
		driver.findElement("logo");
		
		driver.sendKeys("username", "sheema.farheen@gmail.com");
		driver.sendKeys("password", "Sheema@123");
		driver.click("loginbutton");
		
		driver.close();
		
		
	}

}
