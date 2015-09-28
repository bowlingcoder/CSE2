//Average Grade Calculator
//Alex James
//CSE002
//9/26/15
import java.util.Scanner;
public class averageGrade{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double sum = 0;
		double grade = 0;
		int count = 0;
		System.out.println("Enter first grade");
		grade = keyboard.nextDouble();
		while(grade != 999){
			if(grade >= 0 && grade <= 100){
				sum += grade;
				count++;}
			else
				System.out.println("Invalid grade has been entered.");
			System.out.println("Enter next grade (enter 999 to stop adding grades)");
			grade = keyboard.nextDouble();}
		System.out.println("The average of " + count +" grades are: " + sum/count );}
}