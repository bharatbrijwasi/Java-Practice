//Estimate the height of pole
package basic_program;
import java.text.DecimalFormat;
import java.util.*;
public class Math_Program 
{

	public static void main(String[] args) 
	{
		 double height;
		 double distance;
		 double alpha;
		 double beta;
		 double alphaRad;
		 double betaRad;
		 
		 Scanner sc = new Scanner(System.in);
		 //get three value
		 System.out.println("Angle Aplha(in degree)");
		 alpha = sc.nextDouble();
		 
		 System.out.println("Angle beta(in degree)");
		 beta = sc.nextDouble();
		 
		 System.out.println("Distance between point A and B(ft)");
		 distance = sc.nextDouble();
		 
		 //compute the height of tower in Radians according to the formula
		 alphaRad = Math.toRadians(alpha);
		 betaRad = Math.toRadians(beta);
		 
		 height = (distance*Math.sin(alphaRad)*Math.sin(betaRad))/
				 Math.sqrt(Math.sin(alphaRad+betaRad)*Math.sin(alphaRad-betaRad));
		 DecimalFormat df = new DecimalFormat("0.000"); 
		 System.out.println("Height of tower: " +df.format(height));
	}

}
