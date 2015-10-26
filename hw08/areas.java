//Areas 
//Alex James
//CSE2
//10-27-15

import java.util.Scanner; //allows user input
public class areas{ // name of class
	public static double area(double radius){ //method to get area of circle
		double area = Math.PI*Math.pow(radius,2);
		return area;}
	public static double area(double length, double width){ //method to get area of rectangle
		double area = length * width;
		return area;}
	public static double area(double base1, double base2, double height){ // method to get area of trapezid
		double area = (base1 + base2)/2*height;
		return area;}
	public static void main(String[] args){ //main method
		Scanner keyboard = new Scanner(System.in); // user input
		System.out.println("Circle - 1"); //options for user
		System.out.println("Rectangle - 2");
		System.out.println("Square - 3");
		System.out.println("Exit program - 0");
		System.out.println("Please pick a shape");
		int b = keyboard.nextInt();
		while(b != 1 && b != 2 && b != 3){ //check to see if user choice is valid
			if(b == 0){
				System.exit(-1);} // exit code
			else{
				System.out.println("Incorrect shape, please try again");
				b = keyboard.nextInt();}
				}
		if(b == 1){ // calls circle area()
			System.out.println("Please enter radius");
			double c = keyboard.nextDouble();
			double d = area(c);
			System.out.println("The Area of the circle:" + d);}
		else if(b == 2){ // calls rectangle area()
			System.out.println("Please enter lehgth");
			double e = keyboard.nextDouble();
			System.out.println("Please enter width");
			double f = keyboard.nextDouble();
			double g = area(e, f);
			System.out.println("The Area of the rectangle:" + g);}
		else if(b == 3){ // calls trapizoid area()
			System.out.println("Please enter base1");
			double h = keyboard.nextDouble();
			System.out.println("Please enter base2");
			double i = keyboard.nextDouble();
			System.out.println("Please enter height");
			double j = keyboard.nextDouble();
			double k = area(h,i,j);
			System.out.println("The Area of the trapizoid:" + k);}
			}}