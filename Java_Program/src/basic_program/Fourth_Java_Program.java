package basic_program;
import java.util.*;
import java.text.*;
public class Fourth_Java_Program 
{
	public static void main(String[] args) 
	{
		 //demo to Date class
		Date today;
		SimpleDateFormat sdf1,sdf2;
		today = new Date();
		sdf1 = new SimpleDateFormat( );
		sdf2 = new SimpleDateFormat("EEEE MMMM dd, yyyy");
		
		//default short format display
		System.out.println("Today is " +sdf1.format(today));
		
		//Programmed-designated long format display
		System.out.println("Today is " +sdf2.format(today));
	}

}
