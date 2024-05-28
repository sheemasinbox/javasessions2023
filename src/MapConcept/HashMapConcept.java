package MapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

//	HashMap<String, Integer> empMap;  --static use directly/ nonstatic use obj
	
	public static void main(String[] args) {
		
//		HashMapConcept obj = new HashMapConcept();
	
		//key, value
//		obj.empMap = new HashMap<String, Integer>();
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		empMap.put("Tom", 101);
		empMap.put("Lisa", 200);
		
		System.out.println(empMap.size());
		
		System.out.println(empMap.get("Tom"));
		
		empMap.put("Lisa", 300);
		
		//non order based collection
		HashMap<String, String> empData = new HashMap<String, String>();
		
		empData.put("Tom", "SDET1");     //key-value pair set -->entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4" );
		empData.put("Naveen", "SDET4");
		empData.put("Afzal", "Dev");
//		empData.put(null, "SDET Manager");
//		empData.put(null, "SDET Director");
//		empData.put(null, null);
//		empData.put("Prateek", null);
//		empData.put("Usha", null);
		
		empData.remove("Naveen");
		empData.remove("Lisa", "SDET4");
		boolean flag = empData.containsKey("Naveen");
		System.out.println(flag);
		
//		System.out.println(empData.get(null));
//		System.out.println(empData.get("test"));
//		
//		System.out.println(empData);
		System.out.println("------------------");
		
		//using for loop with Map.Entry
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() +" : "+entry.getValue());
		}
		System.out.println("----------------");
		
		
		//foreach method
		empData.forEach((k,v) -> System.out.println(k+" : "+v));    // -> Lamda expression
		System.out.println("----------------");
		
		
		
		
		//null keys allowed in HashMap = 1
		//null values = multiple
		//If key = null, then it will always go to the index=0
		//
		
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		
		map.put("Tom", list);
		System.out.println(map.get("Tom"));
		System.out.println(map);
		
		
		
		

	}

}
