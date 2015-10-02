 //Time Sheets
 //Alex James
 //10-2-15
 import java.util.Scanner;
 public class timeSheets{
	 public static void main(String[] args){
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("How many employee timesheets are being read");
		 int employees = keyboard.nextInt();
		 int i = 1;
		 int coins = 0;
		 int hours = 0;
		 double pay = 0;
		 double total = 0;
		 while(i <= employees){
			  System.out.println("What is employee's pay per hour in cents");
			  coins = keyboard.nextInt();
			  System.out.println("How many hours do they work during Monday");
			  hours = keyboard.nextInt();
     		  System.out.println("How many hours do they work during Tuesday");
     		  hours += keyboard.nextInt();
     		  System.out.println("How many hours do they work during Wednesday");
     		  hours += keyboard.nextInt();
     		  System.out.println("How many hours do they work during Thursday");
     		  hours += keyboard.nextInt();
     		  System.out.println("How many hours do they work during Friday");
     		  hours += keyboard.nextInt();
     		  pay = (int)((coins/100) * hours) * 100.00;
     		  total += pay;
     		  hours *= 0;
     		  i++;}
     	   System.out.println("This is the total payrool in cents per hour $" + total);}}
