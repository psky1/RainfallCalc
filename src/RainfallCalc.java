import java.util.Scanner;
public class RainfallCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	    int inchesRoofLength;
	    int gallonsRainfall;
		Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Enter the roof width: ");
	    int roofWidth = scan.nextInt();
	    
	    System.out.print("Enter the roof length: ");
	    int roofLength = scan.nextInt();
	    
	    System.out.print("Enter the inches of rainfall: ");
	    int inchesRainfall = scan.nextInt();
	    gallonsRainfall = calculateRainfall(roofWidth, roofLength, inchesRainfall);
	    
        System.out.print("Gallons of rainfall is: " + gallonsRainfall);
	}
	    
	    
	 public static int calculateRainfall(int roofWidth, int roofLength, int inchesRainfall){
		 int areaRoofInches;
		 int gallonsRainfall;
		 int rainfall;

	    //Multiply roof width by 12 and multiply roof length by 12
	    //Multiply the roof dimensions by the number of inches of rainfall.
	    areaRoofInches = (roofWidth * 12) * (roofLength * 12);
        rainfall = (areaRoofInches * inchesRainfall);


         //Determine no. of gallons of rainfall by dividing 231
        gallonsRainfall = rainfall/231;
            
        return gallonsRainfall;
        
	}

}
