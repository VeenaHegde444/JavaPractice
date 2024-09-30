package dynamicArray_Practice;

import java.util.ArrayList;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
		ArrayList ls = new ArrayList();
		//it is a raw type, can add any type of data
		ls.add(100);
		ls.add(12.33);
		ls.add("testing");
		ls.add(true);
		ls.add('a');
		
		System.out.println(ls);
		
		//ArrayList with Generics:
		//generics means what type of data we want to store in ArrayList, to restrict the data type in ArrayList
		//primitive data types like int,double,char are not allowed as generics
		//It has to be a Wrapper class like Integer, Character, Double
		
		ArrayList<Integer> numList = new ArrayList<Integer>();//vc=10,pc=0
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		
		//print all elements using for loop
		
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
		
		System.out.println("*******************");
		//print all elements using for each loop
		
		for(Integer e :numList ) {
			System.out.println(e);
		}
		
		System.out.println("***************");
		
		//without using any loop
		System.out.println(numList);
		
		
		ArrayList<Character> ch = new ArrayList<Character>();
		ch.add('a');//0
		ch.add('b');//1
		ch.add('c');//2
		
		System.out.println(ch.get(2));//c
		
		ArrayList<Double> marksList = new ArrayList<Double>();//vc=10,pc=0
		marksList.add(10.33);
		marksList.add(200.00);
		
		
		ArrayList<String> browserList = new ArrayList<String>();//vc=10,pc=0
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		
		// real case scenario: find all the footer links and click on some link, then break it
		for(String e: browserList) {
			if(e.equals("firefox")) {
				System.out.println("enter url");
				break;
			}
		}
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");
		empDataList.add(30);
		empDataList.add(12.33);
		empDataList.add('m');
		empDataList.add(true);
		
	//	System.out.println(empDataList);
		
		for(Object e : empDataList) {
			System.out.println(e);
		}
		
		//can we store duplicate values in ArrayList? 
		//Ans: Yes
		//Can we store null values in ArrayList?, can we store multiple null values in ArrayList?
		//Ans: Yes
		
		ArrayList<String> studentList = new ArrayList<String>();//vc=10,pc=0
		studentList.add(null);//0
		studentList.add("Dev");//1
		studentList.add("John");//2
		studentList.add("Peter");//3
		studentList.add("Dev");//4
		studentList.add("Rahul");//5
		studentList.add(null);//6
		
		System.out.println(studentList);
		System.out.println(studentList.size());//7
		
		studentList.set(0, "Josh");
		System.out.println(studentList);
		
		studentList.remove(4);
		System.out.println(studentList);
		System.out.println(studentList.size());//6
		
		//find the all footer links & click on a particular link
		
		ArrayList<String> footerLinks = new ArrayList<String>();//vc=10,pc=0
		footerLinks.add("Getting Started");//0
		footerLinks.add("Contact Us");
		footerLinks.add("Get Expert Help");
		footerLinks.add("Knowledge Center");
		footerLinks.add("Blogs");
		footerLinks.add("Press Releases");
		footerLinks.add("Legal");
		
		System.out.println(footerLinks.size());//7
		
		//can we add element at index 9?
		//Ans: No, we can't add, because ArrayList will store the values in sequential order
		//if we try to add at index p, we will get IndexOutOfBoundsException
		
	//	footerLinks.add(9, "Help"); //ndexOutOfBoundsException
		
		
		//update the value at index 2
		footerLinks.set(2, "Help");
		System.out.println(footerLinks);
		
		//if we try to add at 0 index, it will shift the elements
		footerLinks.add(0, "What's New");
		System.out.println(footerLinks);
		
		for(String e: footerLinks) {
			System.out.println(e);
			if(e.equals("Knowledge Center")) {
				System.out.println("click on it");
				break;
			}
		}
		
		//footerLinks.ensureCapacity(0);
		
	}

}
