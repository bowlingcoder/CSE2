//Alex James
//9-02-2015
//CSE002
public class Cyclometer{
   // main method required for every Java program
    public static void main (String[] args) {
       
       // create variables
        int secsTrip1=480; // The amount of seconds it takes for trip 1
        int secsTrip2=3220; // The amount of seconds it takes for trip 2
        int countsTrip1=1561; // The amount of counts in trip 1
        int countsTrip2=9037; // The amount of counts in trip 2
        double wheelDiameter=27.0; // The diameter of the wheel of the cycle
        double PI = 3.14159; // The value of PI
        double feetPerMile = 5280; // The amount of feet in a mile
        double inchesPerFoot = 12; // The amount of inches in a foot
        double secondsPerMinute = 60; // The amount of seconds in a minute
        double distanceTrip1; // The distance taken in Trip 1
        double distanceTrip2; // The distance taken in Trip 2
        double totalDistance; // The total distance between Trip 1 and Trip 2
        
       // Print out the minutes and count of each trip 
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute) + " minutes and had "+
        countsTrip1+" counts."); // Prints out the amount of minutes and counts it takes for Trip 1
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute) + " minutes and had "+
        countsTrip2+" counts."); //Prints out the amount of minutes and counts it takes for Trip 2
        
       // Calculates distance of each trip and total distance
        distanceTrip1=countsTrip1 * wheelDiameter*PI; // Above gives distance in inches 
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot * feetPerMile; // Gives distance in miles for Trip 1
        distanceTrip2=countsTrip2 * wheelDiameter * PI/inchesPerFoot/feetPerMile; // Gives distance in miles for Trip 2
        totalDistance = distanceTrip1 + distanceTrip2; // Gives total distance in miles
        
       // Prints out the distance traveled for each trip and the total trip 
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); // Prints out the distance traveled in Trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); // Prints out the distance traveled in Trip 2
        System.out.println("The total distance was "+ totalDistance +" miles"); //Prints out the total distance Traveled
    
        
    }//end of main method
}//end of class