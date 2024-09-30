package javaBasicsPractice;

public class StackOverflowError {
	
	public void m1() {
		System.out.println("Calling from m1");
		m2();
	}
	
	public void m2() {
		System.out.println("Calling from m2");
		m3();
	}
	
	public void m3() {
		System.out.println("Calling from m3");
		//if we try to call m1() method in m3() we will get StackOverflowError because it will become a full circle where methods will be calling each other
		//continuously till the stack gets completely filled
	}
	

	public static void main(String[] args) {
		//create object to call non-static methods
		
		StackOverflowError obj = new StackOverflowError();
		obj.m1();

	}

}

/* JVM will call the main() method, it will take some memory to call the main() method inside the stack.
 * Now m1() will call m2() & m2() will call m3() method. This is called allocation -> main(), m1(),m2(),m3() going upwards
 * Once m3() is executed it will go to line no 19, after that it will go to line no. 13, after that it will go to line no.8 after that it will go to line no. 28
 * it goes wherever closing bracket is available & at line no 28 program is over.
 * 
 * After that memory will be deallocated, m3() will be deleted first from the stack,then m2() & then m1() & finally main() method will be deleted from the stack.
 * This is called deallocation.
 * Stack - LIFO (Last In First Out)
 * This how memory allocation & deallocation happens in Stack.
 * Whenever a method is calling another method, we can make it a chain but not a circular chain.
 * 
 * Queue - FIFO(First In First Out)
 * Which memory algorithm is complex? Heap or Stack?
 * Ans: Heap
 */

