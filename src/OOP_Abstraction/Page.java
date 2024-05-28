package OOP_Abstraction;


public abstract class Page {
	
	//This COnst.. will be called when you create an obj of the child class
	
	//Parent Class COnst 
	public Page() {   //here, always default const is called
		this(20);
		System.out.println("Page -- Constructor");
	}
	
	public Page(int i) {
		System.out.println("Page -- Constructor" +i);
	}
	
	//Abstract class: 
	//We cannot create an object of abstract class
	//We can have abstract and non-abstract methods
	//default method - Not allowed
	//Abs class can have ONLY non-ans methods
	//Constructor of Abs Class is possible
	
	//No abs methods - 0% abstraction
	//ONLY abs methods - 100% abstraction
	//abs + non-abs methods - partial abstraction
	//0 - 100% abstraction
	
	public abstract void title(); //mandatory to explicitly write 'abstract' for abstract methods
	
	public abstract void url();
	
	public void pageLoadingTime() {
		System.out.println("page -- loading time out - 20secs");
	}
	
	//common method - static
	public static void displayLogo() {
		System.out.println("page -- display logo");
	}

	//every child class can have their own final copy but they cannot override
	public final void footers() {
		System.out.println("page -- footers");
	}
	
	
}
