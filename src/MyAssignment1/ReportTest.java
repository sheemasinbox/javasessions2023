package MyAssignment1;

public class ReportTest {

	public static void main(String[] args) {
		
		EOQuarter eq = new EOQuarter("Harry", 24, 30, "bloodtest");
		eq.fetchDetails("Harry", 24);
		eq.sendDetails("12/12/2023", "01/24/2024");
		System.out.println("--------------------------------------------");
		
		EOMonth eom = new EOMonth();
		eom.fetchDetails("Sally", 56);
		eom.testList(6);
		eom.customerData("Sally", 56, 40, "XRay");
		System.out.println("--------------------------------------------");
		
		EODay eod = new EODay();
		eod.fetchDetails("Meenu", 40);
		eod.customerData("Meenu", 40, 25, "ultrsound");
		eod.eodAmount(5, 0);
		eod.sendDetails("01/10/2022", "10/10/2022");
		eod.messages();
		System.out.println("--------------------------------------------");
		
	
	}

}
