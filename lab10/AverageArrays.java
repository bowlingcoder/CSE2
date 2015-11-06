//Alex James
//10-30-15
//CSE2

import java.util.Scanner; // allows for user input
public class AverageArrays{ // class name
	public static void main(String[] args){ //main method
		Scanner keyboard = new Scanner(System.in); // initalizes user input
		int[] randomArray; // intializes array
		System.out.print("How many array values do you want?");
		int n = keyboard.nextInt(); // user input;
		int i = 0; //initalize variables
		int j = 0;
		int k = 0;
		int l = 0;
		double sum = 0;
		randomArray = new int[n];
		while(i  < n){ // put values into array
		randomArray[i] = (int)(Math.random() * 100);
		i++;
		}
		System.out.print("The array values:");
		while(j < n){ // prints array values
			System.out.println(randomArray[j]+ " ");
			j++;}
		while(k < n){ // gets sum of array value
			sum = randomArray[k] + sum;
			k++;}
		System.out.println("The average is: " + sum/10.0); // prints average
		System.out.print("The values greater than the average: ");
		while(l < n){ // gets array values greater than average
			if(randomArray[l] > (sum/10.0)){
				System.out.print(randomArray[l] + " ");}
				l++;
		}}}