import java.util.Scanner;// allows for scanner class to be used
public class Timer{//class name
	public static void main(String[] args){// main method
		Scanner keyboard = new Scanner(System.in);// creates scanner object
		System.out.print("Enter the current military time: ");// prompts for current military time
		int time = keyboard.nextInt(); // user inputs current time
		System.out.print("Enter the military time that you will be eating dinner: "); // prompts for time of dinner
		int dinner = keyboard.nextInt(); // user inputs dinner time
		int countdown = dinner - time; // calculate the difference in time
		int hour = countdown / 100; // calculates the hours between current and dinner
		int minute = (countdown%100); // calculates the minutes between current and dinner
		System.out.print("You have " + hour + " and " + minute + " minutes until dinner."); // prints out the hour and minutes until dinner
	}
}