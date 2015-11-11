//Alex James
//CSE 002
//11-10-2015

import java.util.Scanner; //enables Scanner class
public class MineSweeper // class name
{
	public static void main(String[] args) // main method
	{
		Scanner keyboard = new Scanner(System.in); //user input
		System.out.println("How big is the minesweeper gameboard");
		int count = 0; //variable for how many mines nearb
		char mine = 'M'; // variable for mines
		int N = keyboard.nextInt(); //size of board
		char [][] gameboard = new char[N][N];
		System.out.println("How many bombs?");
		int nBombs = keyboard.nextInt(); // amount of bombs
		while(nBombs > (N*N) || nBombs < 1) //check to make sure user input is right
		{
			System.out.println("Please try again");
			nBombs = keyboard.nextInt();
		}
		int i = 0;
		while(i < nBombs) //randomly places bomb
		{
		   int r1 = (int)(Math.random()*N);
		   int r2 = (int)(Math.random()*N);
		   if(gameboard[r1][r2] != mine){
			  gameboard[r1][r2] = mine;
			  i++;}
   		}
   		for (int r=0; r<gameboard.length; r++) //check to see how many mines adjacent to spot
   		{
		     for (int c=0; c<gameboard[r].length; c++)
		     {
		         if(r != 0 && gameboard[r-1][c]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(r != N-1 && gameboard[r+1][c]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(c != N-1 && gameboard[r][c+1]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(c != 0 && gameboard[r][c-1]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(r != N-1 && c != N-1 && gameboard[r+1][c+1]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(r != N-1 && c != 0 && gameboard[r+1][c-1]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(r != 0 && c != N-1 && gameboard[r-1][c+1]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(r != 0 && c != 0 && gameboard[r-1][c-1]== mine && gameboard[r][c] != mine){
					 count++;}
				 if(count > 0){
				 gameboard[r][c] = Character.forDigit(count, 10);}
				 count = 0;
		     }
 		}
		for (int d=0; d<gameboard.length; d++) //prints out board
		{
		     for (int b=0; b<gameboard[d].length; b++)
		     {
		         System.out.print(gameboard[d][b] + " ");
		     }
		     System.out.println("");
 		}
	}
}