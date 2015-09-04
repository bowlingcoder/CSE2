import java.util.Scanner;
public class Area{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int width;
		int height;
		System.out.println("Enter Value for width");
		width = keyboard.nextInt();
		System.out.println("Enter Value for height");
		height= keyboard.nextInt();
		int area = width * height;
		System.out.println("This is the area" + area);}}