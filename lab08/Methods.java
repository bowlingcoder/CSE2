//Alex James
//CSE2
//Methods

import java.util.Scanner; //allows for user input
public class Methods{ // class
	public static double mean(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j){ //method to solve mean
		double mean = (a + b + c + d + e + f + g + h + i + j)/10.0;
		return mean;}
	public static double median(double a,double b,double c,double d,double e,double f,double g,double h,double i,double j){ //method to solve median
		double median = (e + f)/2;
		return median;
		}
	public static void main(String[] args){ //main method
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 10 numbers"); //calls for user input
		double a = keyboard.nextInt();
		double b = keyboard.nextInt();
		double c = keyboard.nextInt();
		double d = keyboard.nextInt();
		double e = keyboard.nextInt();
		double f = keyboard.nextInt();
		double g = keyboard.nextInt();
		double h = keyboard.nextInt();
		double i = keyboard.nextInt();
		double j = keyboard.nextInt();
		double k = mean(a,b,c,d,e,f,g,h,i,j); //runs mean method
		double l = median(a,b,c,d,e,f,g,h,i,j); //runs median method
		System.out.println("The mean is:" + k); //prints mean
		System.out.println("The median is:" + l); //prints median
		}
	}