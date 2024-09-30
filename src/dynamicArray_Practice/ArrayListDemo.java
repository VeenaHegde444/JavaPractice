package dynamicArray_Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//List -Interface
		//ArrayList - class
		
		
		//top casting- child class object can refer to parent class reference variable
		List<String> browserList = new ArrayList<String>();
		
		//we can access both List & ArrayList methods
		
		System.out.println(browserList.hashCode());

	}

}
