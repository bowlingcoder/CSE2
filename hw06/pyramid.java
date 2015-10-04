//Pyramid
//Alex James
//10/6/15
import java.util.Scanner;
public class pyramid
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//initializing variables
		System.out.print("What size pyramid?");
		int row = keyboard.nextInt();
		int i = 0;
		int j = 1;
		int k = 1;

		// sets up the structure of the pyramid
		while(i < row)
		{
			//sets up the spaces before the *
			while(k < (row - i))
			{
				System.out.print(" ");
				k++;
			}
			//sets up the components of the variable
			while(j <= ((2*i)+1))
			{
				System.out.print("*");
				j++;
			}
			//resets variables
			k = 1;
			j = 1;
			System.out.println("");
			System.out.println("");
			i++;
		}
	}
}