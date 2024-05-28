package Inheritance_Assignments;

//WEO -> University -> MIT & IIM & Medical
//    -> Institutes

public class EducationTest {

	public static void main(String[] args) {
		
		System.out.println("---------------World Education Services--------------------");
		WorldEducationServices wes = new WorldEducationServices();
		wes.implementHierarchy();        //individual
		
		System.out.println("---------------Univesity--------------------");
		University un = new University();
		un.implementHierarchy();        //Overridden
		un.universityCourses();         //Individual
		System.out.println(un.marks);
		
		System.out.println("--------------MIT--------------");
		MIT mit = new MIT();
		mit.implementHierarchy();            //Inherited --Overridden
		mit.universityCourses();             //Inherited
		mit.chemicalEngineering();           //Individual
		mit.electricalEngineering();         //Individual
		mit.mechanicalEngineering();         //Individual
		System.out.println(mit.marks);
		
		System.out.println("---------------IIT-------------");
		IIM iim = new IIM();
		iim.implementHierarchy();            //Inherited --Overridden
		iim.universityCourses();             //Inherited
		iim.businessManagement();            //Individual
		iim.financeManagement();             //Individual
		iim.strategicManagement();           //Individual
		System.out.println(iim.marks);
		
		System.out.println("----------------Medical----------");
		Medical med =  new Medical();
		med.implementHierarchy();            //Inherited --Overridden
		med.universityCourses();             //Inherited
		med.mbbs();                          //Individual
		med.dental();                        //Individual
		System.out.println(med.marks);
	}

}
