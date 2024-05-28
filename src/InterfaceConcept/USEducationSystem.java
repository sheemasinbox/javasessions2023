package InterfaceConcept;

//Interface extends Interface
public interface USEducationSystem extends EducationServices {
	
	public void aeb();
	
	public void highSchool();
	
	public void fbise();
	
	@Override                     //overridden method from parent EducationServices Interface
	public void curriculum();
	
	public static void course() {
		System.out.println("US List of Courses");
	}
	
	

}
