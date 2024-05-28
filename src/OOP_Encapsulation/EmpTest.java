package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		//POST - reg form
		Employee e1 = new Employee("Sheema", 25, 10, true);
		
		//GET - get the user info
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive());
		
		//PUT - update the info
		e1.setName("Farheen");
		
		//GET - get the user info
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive());
		
		
		//Object e2
		Employee e2 = new Employee("Imran", 40);
		System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.isActive());
		e2.setSalary(50);
		e2.setActive(true);
		System.out.println(e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.isActive());
		
		
		//Calling Browser Class
		Browser br1 = new Browser();
		
		br1.launchBrowser();
		
		//Examples of Encapsulation in Selenium
		//click(button xpath) --> isVisible(button) --> isClickabled(button)-->isHegiht(button)
		//public driver.get(url) --> urlisNull() --> https() --> accessUrl() --format()
		
		//*The internal calls and functioning of an application are declared as 'private' and the method the 
		//users need to access are declared a 'public'
		
		

	}

}
