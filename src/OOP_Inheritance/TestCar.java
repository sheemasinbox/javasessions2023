package OOP_Inheritance;

//Caller Class - Main()
//Physics -> Science -> Mechanical -> Automobile -> Vehicle -> Car -> BMW & Audi
//															-> Truck

public class TestCar {

	public static void main(String[] args) {
		
		System.out.println("-------------BMW-----------");
		BMW b = new BMW();
		System.out.println(b.maxSpeed);
		//start() is from Car class(parent)
		b.start();   //Overridden     
		b.stop();    //inherited
		b.refuel();  //inherited
		b.autoParking();   //BMW- individual
		b.engine();  //inherited
		b.billing(); //Overridden from Car Class(Parent)
		b.design();  //inherited 
		b.bluePrint();  //inherited 
		
		//final var and methods
		b.runFourWheels();
		System.out.println(b.minSpeed);
		
		System.out.println("---------Car---------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine(); //inherited method
		c.horsePower(); //inherited Overridden method from Automobile
		Car.carDisplay(); //calls static method from Car
		BMW.carDisplay(); //calls static method from BMW
						//But if this static method is not there in BMW, then it will call the method from Car class
		System.out.println(Car.price);  //Static variable
		System.out.println(BMW.price);  //Static variable
		c.showCar(); //access private method via a public layer
		
		
		System.out.println("-----------Audi--------------");
		Audi au = new Audi();
		System.out.println(au.maxSpeed);
		au.start();     //inherited 
		au.stop();      //inherited 
		au.refuel();    //inherited 
		au.theftSafety();    //Audi- individual method
		au.engine(); //Overridden method from Vehicle(Grandparent)
		au.billing();  //Inherited 
	
		
		System.out.println("-----------Truck--------------");
		Truck tr = new Truck();
		tr.engine();    //Inherited 
		tr.heavyLoading();   //Individual 
		
		System.out.println("-----------Vehicle-------------");
		Vehicle v = new Vehicle();
		System.out.println(v.maxSpeed);
		v.billing();      //Individual 
		v.engine();       //Individual 
		v.design();       //Inherited
		v.bluePrint();    //Inherited
		v.horsePower();   //Inherited
		v.thermoDynamics();    //Inherited 
		
		System.out.println("-----------Automobile-------------");
		Automobile am = new Automobile();
		am.design();        //Individual 
		am.bluePrint();    //Inherited 
		am.horsePower();   //Inherited 
		am.thermoDynamics();    //Inherited
		
		System.out.println("-----------Mechanical-------------");
		Mechanical m = new Mechanical();
		m.bluePrint();    //Individual 
		m.horsePower();   //Inherited 
		m.thermoDynamics();    //Inherited 
		
		System.out.println("-----------Science-------------");
		Science s = new Science();
		s.horsePower();    //Individual 
		s.thermoDynamics();    //Inherited 
		
		System.out.println("-----------Physics-------------");
		Physics ph = new Physics();
		ph.thermoDynamics();    //Individual 
		
		Honda h = new Honda();
		h.start();     //Overridden
		h.fuelEff();   //individual
		h.start();     //inherited
		h.parking();   //Sibling feature - Composition
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.runFourWheels();    //Static method
		
		System.out.println("-----------------------");
		//Child class object can be referred by Parent class reference variable
		//Top Casting or Up Casting
		//Selenium ex: WebDriver driver = new ChromeDriver();
		
		Car cr = new Honda();    //Every Honda IS-A car (IS - A relationship)
		cr.start();     //Car can now access the overridden start() from Honda
		cr.stop();      //inherited
		cr.refuel();    //inherited
//		cr.fuelEff();   //not allowed as it is an individual method of child
						//Reference Type Check failed
		
		Vehicle v1 = new Honda();   //GrandParent - GrandCHild
		v1.engine();
		v1.billing();
		
		//Down Casting -- NOT ALLOWED 
		//Parent class object can be referred by Child Class ref variable
//		Honda h1 = (Honda) new Car();    //Every Car is Honda (X)
		                                 //ClassCastException
		
		//Sibling Casting
//		Honda h2 = new BMW();   -- NOT ALLOWED
		
		
	}

}
