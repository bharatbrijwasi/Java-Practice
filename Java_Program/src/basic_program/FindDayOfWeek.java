//find the day of week of a given Date
package basic_program;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.*;
public class FindDayOfWeek 
{
	public static void main(String[] args) 
	{		 
		int year, month, day;
		GregorianCalendar cal;
		SimpleDateFormat sdf;
		
		Scanner scanner = new Scanner(System.in);
 		
		System.out.println("Enter Year(yyyy):");
		year = scanner.nextInt();
		
		System.out.println("Enter Month(1-12):");
		month = scanner.nextInt();
		
		System.out.println("Enter Day(1-31):");
		day = scanner.nextInt();
		
		cal = new GregorianCalendar(year, month-1, day);
		sdf = new SimpleDateFormat("EEEE");
		
		System.out.println(" ");
		System.out.println("Day of Week: " +sdf.format(cal.getTime()));
	}

}
