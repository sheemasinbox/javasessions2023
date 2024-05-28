package BuilderPattern;

public class Registration {
	
	String name;
	String tel;
	String pwd;
	
	public void userReg(String name, String tel, String pwd) {
		System.out.println("Enter user name: "+name);  //sana
		System.out.println("enter phone: "+tel);   //121212
		System.out.println("enter pwd: "+pwd);   //sana@123
		
		this.name = name;  //this.classvariable = local variable
		this.tel = tel;
		this.pwd = pwd;
	}
	
	public void getUserInfo() {
		System.out.println(name+" "+tel+" "+pwd);   //if this.name is not used in above method then it will give null
	}

	public static void main(String[] args) {
		
		Registration reg = new Registration();
		reg.userReg("Sana", "121212", "sana@123");
		reg.getUserInfo();
		
		//this keyword:
		//1. Const + this
		//2. const.. calling
		//3. method + this
		//4. builder pattern  --> return this

	}

}
