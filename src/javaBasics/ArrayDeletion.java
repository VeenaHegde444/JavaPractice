package javaBasics;

import java.util.Arrays;

public class ArrayDeletion {

	public static void main(String[] args) {
        int[] p = {1, 4, 5, 2, 3, 22, 31, 2};
        int numberToDelete = 31;  // Specify the number to delete

        // Step 1: Count the number of elements not equal to numberToDelete
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != numberToDelete) {
                count++;
            }
        }

        // Step 2: Create array 'a' with the correct length
        int[] a = new int[count];

        // Step 3: Copy elements not equal to numberToDelete from 'p' to 'a'
        int j = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != numberToDelete) {
                a[j] = p[i];
                j++;
            }
        }

        // Step 4: Print the array 'a'
        System.out.println(Arrays.toString(a));
    
	}

}
