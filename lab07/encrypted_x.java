//Secret X
//Alex James
//10-9-15
//CSE2

import java.util.Scanner;
public class encrypted_x
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How big is the the square? (0 - 100)");
		int input = keyboard.nextInt();
		if(input < 0 || input > 100)
		{ // makes sure values are legitiment
			System.exit(-1);
		    
		}
		for(int i = 0; i<input; i++) // outer for loop (HEIGHT)
		{ 
			for(int j = 0; j<input; j++)
			{ // inner for loop (WIDTH)
				if(input - j == (i+1) ||  j == i)
				{ // produces the secret x
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
		System.out.println("");
		}
	}
    
}