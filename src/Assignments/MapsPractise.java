package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsPractise {

	public static void main(String[] args) {
		
		//HashMap -- UnOrdered Collection -- //Maintains order in case of Integer key
		HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
		hash1.put(101, "Sheema");
		hash1.put(102, "Farheen");
		hash1.put(110, "Afzal");
		hash1.put(108, "Imran");
		hash1.put(104, "Mohammed");
		
		System.out.println(hash1);
		System.out.println("-----------------------------------------");
		
		HashMap<Integer, String> hash2 = new HashMap<Integer, String>();
		hash2.put(105, "Umar");
		hash2.put(103, "Tasneem");
		hash2.putAll(hash1);
		System.out.println(hash2);
		System.out.println("-----------------------------------------");
		
		System.out.println(hash2.get(102));
		System.out.println("-----------------------------------------");
		
		for(Map.Entry<Integer, String> m : hash2.entrySet()) {
			if(m.getKey() != 110) {
			System.out.println(m.getKey()+ " : " +m.getValue());
			}
			else {
				System.out.println(hash2.remove(m.getKey(), m.getValue()));
				System.out.println(hash2);
			}
		}
		System.out.println("-----------------------------------------");
		
		hash2.put(111, "Afzal");
		System.out.println(hash2);
		System.out.println("-----------------------------------------");
		

		
		//LinkedHashMap -- Maintains insertion Order while fetching data
		LinkedHashMap<Integer, String> lhash1 = new LinkedHashMap<Integer, String>();
		lhash1.put(101, "Sheema");
		lhash1.put(102, "Farheen");
		lhash1.put(110, "Afzal");
		lhash1.put(108, "Imran");
		lhash1.put(104, "Mohammed");
		
		System.out.println(lhash1);
		System.out.println("-----------------------------------------");
		
		LinkedHashMap<String, String> lhash2 = new LinkedHashMap<String, String>();
		lhash2.put("Owner", null);
		lhash2.put("Partner", "Farheen");
		lhash2.put("Co-Founder", "Afzal");
		System.out.println(lhash2);
		System.out.println("-----------------------------------------");
		System.out.println(lhash2.putIfAbsent("Owner", "Sheema"));     //returns null
		System.out.println(lhash2.putIfAbsent("Owner", "Farheen"));    //returns Sheema -- existing value
		System.out.println(lhash2);
		System.out.println(lhash2.containsKey("Co-Founder"));
		
		LinkedHashMap<String, String> lhash3 = new LinkedHashMap<String, String>();
		lhash3.put("Owner", "Sheema");
		lhash3.put("Partner", "Hi");
		lhash3.put("Co-Founder", "Bye");
		System.out.println(lhash3);
		System.out.println("-----------------------------------------");
		
		//Merging lhash2 into lhash3; if the keys have same value then print once, if they have 2 different values print both the values
		lhash2.forEach((key,value) -> 
							lhash3.merge(key,value, 
									(v1,v2) 
										-> v1.equalsIgnoreCase(v2)
											? v1 
												: v1+ " + " +v2));
		
//		lhash3.forEach((k,v) -> System.out.println(k +" : " +v));
		System.out.println("New HashMap lhash3: " +lhash3);
		System.out.println("-----------------------------------------");
		
		
		
		
		//TreeMap -- Maintains sorted order while fetching data
		TreeMap<String, Double> tree1 = new TreeMap<String, Double>();
		tree1.put("Laptop", (double)67000);
		tree1.put("Camera", (double)43000);
		tree1.put("Mobile", (double)25000);
		tree1.put("Charger", (double)400.50);
		tree1.put("HeadPhones", (double)15000);
		tree1.put("Earbuds", null);
		
		tree1.putIfAbsent("Earbuds", (double) 2800);
		
		tree1.forEach((key,value) -> System.out.println(key+ " - " +value));
		
//		System.out.println(tree1);
		System.out.println("-----------------------------------------");
		
		//using ArrayList as Value
		ArrayList<String> lis = new ArrayList<String>(Arrays.asList("Books","Pens","Pencils","Tags","Envelopes"));
		
		TreeMap<String, ArrayList<String>> tree2 = new TreeMap<String, ArrayList<String>>();
		tree2.put("Items", lis);
		System.out.println(tree2);
		
		
	}

}
