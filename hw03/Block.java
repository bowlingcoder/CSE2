import java.util.Scanner; // allows for scanner class to be used
public class Block{ //class name
	public static void main(String[] args){ // main method
		Scanner keyboard = new Scanner(System.in); // creates scanner object
		System.out.print("Enter the length of the block: "); // prompts for length
		double length = keyboard.nextDouble(); // user inputs length
		System.out.print("Enter the width of the block: "); // prompts for width
		double width = keyboard.nextDouble(); // user inputs width
		System.out.print("Enter the height of the block: "); // prompts for height
		double height = keyboard.nextDouble(); // user inputs height
		double volume = length * width * height; // calculates volume
		System.out.println("The volume of the block dimensions " + length + " x " + width + " x " + height + " is " + volume); // prints out the volume
		double surfaceArea = 2*((width*length)+(height*length)+(height*width)); // calculate  surface area
		System.out.print("The surface area of the block is " + surfaceArea); // prints out surface area
	}
}