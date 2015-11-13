import java.util.Scanner; //imports Scanner class
public class move_array // main class
{
	public static void main(String[] args) //main method
	{
		Scanner keyboard = new Scanner(System.in); // allows for user input
		
		int n; //initialize variable
		int m = 0; //initialize variable
		int temp; //initialize variable
		int[] array = null; //initialize variable
		
		System.out.println("How big is your array");

		try{ // check to make sure array size is valid
			n = keyboard.nextInt();
			int y = 1/n;
			array = new int[n];}
		catch(Exception e){ //catches the error
			System.out.println("The number is not above 0.");
			System.exit(0);}

		for(int i = 0; i < array.length; i++){ // adds values to array
		array[i] = (int)(Math.random()*100);
		System.out.print(array[i] + "  ");}
        
        System.out.println("");
        System.out.println("What index do you want to move?");
		try{ //checks to make sure index is valid
			m = keyboard.nextInt();
			temp = array[m];}
		catch(Exception f){ //catches error of out of bounds
			System.out.println("The number is out of array bounds.");
			System.exit(0);}

		for(int j = m; j < array.length-1; j++){ //sorts array to have index value chosen become last value
			temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;}
			
		for(int k = 0; k < array.length; k++){ //prints out sorted array
		System.out.print(array[k] + "  ");}
	}
}