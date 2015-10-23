//Alex James
//10-23-15
//CSE2
//Coin Flipping

import java.util.Scanner; //allows user input
public class CoinFlipping{ //class name
	public static String flip(){ //simulates coin flip
		String b = "";
		if(Math.random() > .5){
			b = "tail 1  head 0";}
		else{
			b = "tail 0  head 1";}
		return b;}
	public static String flip(int n){ //simulates multiple coin flips and counts the amount of head and tails
		int i = 1;
		int x = 0;
		int y = 0;
		String b = "";
		String c = "";
		while(i <= n){ //repeats flips
			i++;
			b = flip();
			if(b.equals("tail 1  head 0")){
				x++;}
			else
				y++;}
		c = "tail :" + x + "  head :" + y;
		return c;}
	public static void main(String[] args){ //main method
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many times do you want to flip the coin? (0-100)");
		int a = keyboard.nextInt(); //user input
		if(a == 0){
			System.out.println(flip());} //calls flip() method
		else if(a > 0 && a <= 100){
			System.out.println(flip(a));} //calls flip(int n) method
		else{
			System.exit(-1);} //exit code
			}}