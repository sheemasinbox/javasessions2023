package Constructor_Assignments;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("Sheema", 35, 'F', 168);
		System.out.println(p1.name+" "+p1.age+" "+p1.gender+" "+p1.height);
		
		Person p2 = new Person("Farheen", 28);
		System.out.println(p2.name+" "+p2.age+" "+p2.gender+" "+p2.height);
		
		p1.name = "Hina";
		
		Person p3 = new Person("Dia");
		Person p4 = new Person("Harry", 'M');
		
		System.out.println(p1.name+" "+p1.age+" "+p1.gender+" "+p1.height);
		System.out.println(p3.name+" "+p3.age+" "+p3.gender+" "+p3.height);
		System.out.println(p4.name+" "+p4.age+" "+p4.gender+" "+p4.height);
		
//		p4 = null;
//		System.out.println(p4.name+" "+p4.age+" "+p4.gender+" "+p4.height);    //NullPointerException

	}

}
