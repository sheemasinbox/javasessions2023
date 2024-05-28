package InterfaceConcept;

public interface USMedical extends WHO{
	
	//No Method body is allowed -- Abstract Methods
	//Only Method declaration
	//Only Method prototype
	
	//Cannot create object of Interface only CLass object is allowed
	//Selenium ex: WebDriver is an interface, so
	// WebDriver dr = new WebDriver(); is not allowed
	
	//public abstract void physioServices(); -- 'abstract' keyword is optional
	//By default all Interface methods are abstract
	
	int min_fee = 10; //by default interface variables are STATIC & FINAL
	                  //if non-static they cannot be called, as obj cannot be created
	
	//100% abstraction
	public void physioServices();
	
	public void oncologyServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
//	private void nephrologyServices(); -- abstract methods Cannot be private, as private methods cannot be overridden
	
	
	
	//after jdk1.8, two major changes
	//1. we can have static method with method body. (Static cannot be overridden)
	public static void billing() {
		System.out.println("USM -- billing");
	}
	
	//2.we can have a default method with method body
	default void medicalInsurance() {
		System.out.println("USM -- medicalInsurance");
	}

}
