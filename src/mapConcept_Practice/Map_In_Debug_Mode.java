package mapConcept_Practice;

import java.util.HashMap;

public class Map_In_Debug_Mode {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> data = new HashMap<String,Integer>();
		
		data.put("Tom", 20);
		data.put("Robert", 30);
		data.put("John", 35);
		data.put("Peter", 40);
		data.put(null, 50);
		
		System.out.println(data);
	}

}
