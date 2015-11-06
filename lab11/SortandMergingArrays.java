//Alex James
//11-06-15
//CSE2

import java.util.Scanner; // allows for user input
public class SortandMergingArrays { // class name
	public static void Sort(int[] nums){ //method to sort arrays
		int a,b,c,temp;
		for (a = 0; a < nums.length - 1; a++)
        {
            b = a;
            for (c = a + 1; c < nums.length; c++)
                if (nums[c] < nums[b])
                    b = c;

            temp = nums[b];
            nums[b] = nums[a];
            nums[a] = temp;
        }}
	public static void main(String[] args){ //main method
		Scanner keyboard = new Scanner(System.in); // initalizes user input
		int[] array1, array2, array3;// intializes array
		array1 = new int[20];
		array2 = new int[10];
		array3 = new int[30];
		int i, j, k, l;//initalize variables
		double sum = 0;
		for (i = 0; i < array1.length; i++) { // put values into array
		array1[i] = (int)(Math.random() * 100);
		}
		Sort(array1);
		System.out.print("Array 1: ");
		for (i = 0; i < array1.length; i++) {
		   System.out.print(array1[i] + " ");
		   }
		System.out.println("");
		for (j = 0; j < array2.length; j++) { // put values into array
		array2[j] = (int)(Math.random() * 100);
		}
		Sort(array2);
		System.out.print("Array 2: ");
		for (j = 0; j < array2.length; j++) {
			System.out.print(array2[j] + " ");
		   }
		System.out.println("");
		for (l = 0; l < array1.length; l++) { // put values into array
			int n = array1[l];
			array3[l] = n;
		}
		for (l = 20; l < array2.length + 20; l++) { // put values into array
			int n = array2[l-20];
			array3[l] = n;
		}
		Sort(array3);
		System.out.print("Array 3: ");
		for (k = 0; k < array3.length; k++) {
					System.out.print(array3[k] + " ");
		   }
		}}