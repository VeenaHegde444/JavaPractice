package javaBasicsPractice;

import java.util.Arrays;

public class StaticArrayConcept_Practice {

	public static void main(String[] args) {
		//int array
	int arr[] = new int[4];
	System.out.println(Arrays.toString(arr));
	//default value of byte,int,short,long is 0
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	
	//System.out.println(arr);
//when we just print 'arr', it will print the memory address
	
	//System.out.println(Arrays.toString(arr));
//when we use Arrays.toString method then we will get the actual array elements
	
	//for loop
	for(int i=0;i<arr.length;i++) {
	
		if(arr[i] == 20) {
			System.out.println(arr[i]);
			break;
		}
	}	
		//for each loop
		
		for(int e:arr) {
			System.out.println(e);
		}
		
		System.out.println("************************");
		
		//print array elements from bottom to top
		
		for( int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	
	//arr.length-1 gives the highest index which is 3
	
	
	//float array
		float fArray[] = new float[3];
		System.out.println(Arrays.toString(fArray));
		
		//default value of float & double is 0.0
		
		fArray[0]=12.33f;
		fArray[1]=10.66f;
		fArray[2]=9.06f;
		
		//print array elements
		//for loop
		
	/*	for(float f=0;f<fArray.length;f++) {
			System.out.println(fArray[f]);
		}
	*/	
		
		for(float f:fArray) {
			System.out.println(f);
		}
	System.out.println("***********************");
	//double array
		double d[] = new double[2];
		d[0]=10.11;
		d[1]=20.22;
		
	/*	for (double i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	*/
	
	for(double e:d) {
		System.out.println(e);
	}
	
	System.out.println("********************");
	//short array
	short s[] = new short[2];
	s[0]=50;
	s[1]=100;
	
	for(short i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
	
	System.out.println("*******************");
	//char array
	
	char ch[] = new char[4];
	
	System.out.println(Arrays.toString(ch));
	//default value of char is 'space'
	ch[0]='a';
	ch[1]='A';
	ch[2]='$';
	ch[3]='4';
	
	System.out.println(ch);
	//for loop
	for(char i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
	}
	
	System.out.println("******************");
	//for each loop
	
	for(char e:ch) {
		System.out.println(e);
	}
	
	//String array
	
	String str[] = new String[4];
	System.out.println(Arrays.toString(str));
	str[0]="Veena";
	str[1]="Advit";
	str[2]="Akshar";
	str[3]="Home";
	
	//for loop
	
	for(int i=0;i<str.length;i++) {
		System.out.println(str[i]);
	}
	
	System.out.println("**********************");
	//for each loop
	
	for(String e: str) {
		System.out.println(e);
		if(e.equals("Advit")) {
			System.out.println("Hello Advit!");
			break;
		}
	}
	
	//Object array
	Object obj[] = new Object[5];
	System.out.println(Arrays.toString(obj));
	//default value is null
	
	obj[0]="Veena";
	obj[1]=30;
	obj[2]='F';
	obj[3]=25000.25;
	obj[4]=true;
	
	//for each loop
	for(Object e:obj) {
		System.out.println(e);
	}
	
	System.out.println("*******************");
	
	//for loop
	
	for(int i=0;i<obj.length;i++) {
		System.out.println(obj[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }

}
