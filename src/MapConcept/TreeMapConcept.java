package MapConcept;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	
	public static void printData(String k, String v) {
		System.out.println(k+" : "+v);
	}

	public static void main(String[] args) {
		
		//It Maintains sorted order starting with Capital letters and then small letters
		//Order - special characters, numeric, Capital letters, small letters
		//key = null is not allowed here unlike HasMap and LinkedHashMap
		
//		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());
		TreeMap<String, String> empData = new TreeMap<String, String>();
		
		empData.put("Tom", "SDET1");     //key-value pair set -->entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4" );
		empData.put("Naveen", "SDET4");
		empData.put("Amit", "SDET5");
		empData.put("arpit", "SDET6");
		empData.put("ravi", "SDET4");
		empData.put("1", "SDET7");
		empData.put("2", "SDET4");
		empData.put("$", "SDET4");
//		empData.put(null, "SDET Manager");  //NullPointerException
		empData.put("selenium", "null");

		
		System.out.println(empData.get("Amit"));
		System.out.println("----------------");
		
		System.out.println(empData);
		System.out.println("----------------");
		
		//using for loop with Map.Entry -- for loop does not use indexing as the Maps are not indexed
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry);
//			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("----------------");
				
				
		//foreach method
		
//		empData.forEach((k,v) -> System.out.println(k+" : "+v));
		empData.forEach((k,v) -> printData(k,v));    // -> Lamda expression
	
				

	}

}
