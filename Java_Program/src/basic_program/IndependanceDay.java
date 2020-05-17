//Day of week the declaration of Independance was adopted
package basic_program;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.*;
public class IndependanceDay 
{
	public static void main(String[] args)
	{
		GregorianCalendar independanceDay = new GregorianCalendar(1776,Calendar.JULY,4);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		System.out.println("It was adopted on " +sdf.format(independanceDay.getTime()));
	}
}
