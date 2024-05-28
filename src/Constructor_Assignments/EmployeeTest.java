package Constructor_Assignments;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Sally", 24.38);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		System.out.println("------------------------");
		e1.setSalary(e1.getSalary());
		System.out.println("The package after raise is: "+e1.getSalary());

	}

}
