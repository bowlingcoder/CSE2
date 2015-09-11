//Alex James
//9-11-2015
//CSE 002
import java.util.Scanner; // enables scanner class
public class Check // Class name
{
	public static void main(String[] args) // main method
	{
	    Scanner myScanner = new Scanner(System.in); // object of Scanner Class
	    System.out.print("Enter the original cost of the check in the form xx.xx: "); // Prompts user for cost of meal without tip
	    double checkCost = myScanner.nextDouble(); // user inputs cost of check
	    System.out.println("Enter the percentage tip that you wish to pay as a whole number");
	    System.out.print("	(in the form xx): "); // Prompts user for perecrnt tip
	    double tipPercent = myScanner.nextDouble(); // user inputs tip percents in whole number
	    tipPercent /= 100;// makes tip percent in decimal
	    System.out.print("Enter the number of people who went out to dinner: "); // Prompt user for amount of people paying
	    int numPeople = myScanner.nextInt(); // user inputs amount of people
	    double totalCost; // total amount of check with tip
	    double costPerPerson; // cost of each indivual person
	    int dollars, //whole dollar amount of cost
	    dimes, pennies; //for storing digits
	    //to the right of the decimal point
	    //for the cost$
	    totalCost = checkCost * (1 + tipPercent); //calculates total cost
	    costPerPerson = totalCost / numPeople; // total cost for individual
	    //get the whole amount, dropping decimal fraction
	    dollars=(int)costPerPerson; // breaks the cost per person into the dollar component
	    //get dimes amount, e.g.,
	    // (int)(6.73 * 10) % 10 ­> 67 % 10 ­> 7
	    // where the % (mod) operator returns the remainder
	    // after the division: 583%100 ­> 83, 27%5 ­> 2
	    dimes=(int)(costPerPerson * 10) % 10; // breaks the cost per person into the dimes component
	    pennies=(int)(costPerPerson * 100) % 10; // breaks the cost per person into the pennies component
	    System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies); // prints the amount due per person
	}
}