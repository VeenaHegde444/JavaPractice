package dynamicArray_Practice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();//vc=10,pc=0
		System.out.println(ar.size());//0
		
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());//4
		//print all elements of ArrayList
		System.out.println(ar);
		
		
		//remove elements from ArrayList
		//in case of remove, it will completely remove the index as well
		//later elements will be shifted, so ArrayList size will be shrinked
		
		ar.remove(2);//300 will be removed
		//in remove() method we should pass the index of the element to be removed
		
		System.out.println(ar.size());//3, here it will shift the element
		
		//to print all elements of ArrayList
		
		System.out.println(ar);
		
		//to get the element at particular index: use .get() method
		
		System.out.println(ar.get(0));//100
		System.out.println(ar.get(1));//200
		System.out.println(ar.get(2));//400
	//	System.out.println(ar.get(3));//IndexOutOfBoundsException
		//can't go beyond physical capacity
		
		//print all the values of ArrayList using for loop: index loop
		
		for(int i=0;i<ar.size();i++) { // index starts from 0, 
			//if i<=ar.size() -  will get IndexOutOfBoundsException
			//so i<ar.size()
			System.out.println(ar.get(i));//100 200 400
		}
		
		
		//to update values we should use .set() method
		
		ArrayList arr = new ArrayList();
		
		arr.add(10);//0
		arr.add(20);//1
		arr.add(30);//2
		arr.add(40);//3
		
		System.out.println(arr);
		
		//update the value at index 3
		
		arr.set(3, 50);
		System.out.println(arr);

	}

}
