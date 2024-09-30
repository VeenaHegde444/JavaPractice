package dynamicArray_Practice;

import java.util.ArrayList;

/*ArrayList - is a class
 * List - is a Interface
 * 
 * class implements interface : ArrayList implements List
 * 
 * ArrayList maintains the order/index, insertion order is preserved.
 * 
 * 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//since ArrayList is a class we can create the object of class
		
		ArrayList ar = new ArrayList();//vc=10,pc=0
		//import from java.util package
		
		//here what we have created is of raw type, means we can store any data type in the list, thats why it is showing warning
		//to remove warnings, we need to specify the generic
		//generics means what kind of data we want to store in the ArrayList, it will not take primitive data types like int,short,char
		//It will accept only wrapper classes as generic ex: Integer, String, Character, Double etc
		
		//to know the size() of the ArrayList we should use .size() method
		//size() : it returns no. of elements in the list
		System.out.println(ar.size());//pc=0
		
		
		//In ArrayList, we have Virtual Capacity (vc) & Physical Capacity(pc)
		//By default, vc is set to 10 (10 virtual segments), before adding the any elements to ArrayList pc is 0
		// ar.size() will always check the physical capacity(pc)
		//no method is available in Java to check the virtual capacity
		//Java has provided virtual capacity for memory optimization
		
		//add elements to ArrayList : use .add() method
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//2
		//vc=8,pc=2, after adding 2 elements, vc:2 indexes are filled, so 8 left 
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		//vc=6,pc=4, after adding 4 elements, vc:4 indexes are filled, so 6 left
		
		//if we try to access ar.size(4), we will get IndexOut
		
		System.out.println(ar.lastIndexOf(ar));//-1
		
		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		ar.add(800);//7
		ar.add(900);//8
		ar.add(1000);//9
		
		System.out.println(ar.size());//10
		
		//now vc is completely filled, if we want to add any new element, 'Load Factor' will come into picture
		//Load Factor = Physical Capacity /2
		// now pc=10, so LF = 10/2 = 5
		// 5 more segments will be added
		// now total segments in the vc is 15
		//next time, when 15 segments are filled, again it will calculate the Load Factor, LF = 15/2 = 7.5 = 7, 7 more segments will be added
		
		
		ar.add(1100);//11
		System.out.println(ar.size());//11
		ar.add(1200);//12
		System.out.println(ar.size());//12
			
		
		//we can customize vc 
		ArrayList ar1 = new ArrayList(5);//vc=5, pc=0, here we are specifically telling vc is 5, otherwise by default it will be 10
		ArrayList ar2 = new ArrayList(50);//vc=50, pc=0		

	}

}
