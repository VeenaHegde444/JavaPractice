package mapConcept_Practice;

import java.util.HashMap;

public class MapConcept {

	public static void main(String[] args) {
		//Map- is also collection: <key,value> pair
		//HashMap is a class
		//Map is a Interface
		//HashMap implements Map
		//its non order based collection- no order
		//in HashMap only one 'null' key is allowed, multiple null values are allowed
		//in case of multiple null keys, it doesn't show any error, but always shows the latest record
		//<null,value> : it will be stored at first position
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		
		//to add values into the map use .put() method
		
		map.put("chrome", 101);
		map.put("firefox", 96);
		map.put("edge", 111);
		
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		map1.put(100, 1);
		
		
		HashMap<String,Object> data = new HashMap<String,Object>();
		data.put("name", "John");
		data.put("age", 35); 
		data.put("age", 30);//duplicate key
		data.put("designation", "SDET2");
		data.put("isPerm", true);
		data.put("gender", 'm');
		data.put(null, "Pune");
		data.put(null, "India");
	//	data.put("phone", null);
		data.put("city", null);
		data.put("", 32.33);
		data.put("age", 29);
		data.put(null, null);
		data.put("address", "");
		
		//to print all values of HashMap
		
		System.out.println(data); 
		//1. no order maintained
		//2. in case of multiple null keys, it will always print the latest record, so one null key is recommended
		//3.multiple null values are allowed, it will print null
		//4.null key will be always placed first, because only one null key is allowed

		
		//to get the particular data from the map use .get() method: 
		//in get() method we need to pass the keys, in case of duplicate keys it will return the latest value
		
		System.out.println(data.get("name")); // John
		System.out.println(data.get("age")); //29
		System.out.println(data.get("phone"));//null, if key is not present in the Map it will return null
		System.out.println(data.get(null));//null, it will return the latest value
		System.out.println(data.get("address"));//blank
		System.out.println(data.get(""));//32.33
		
		
		HashMap<String,Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 20);
		empMap.put("Veena", 30);
		empMap.put("Sunil", 35);
		empMap.put("Pradesh", 40);
		
		//add the breakpoint >> execute in Debug mode >> click on step into
	}

}
