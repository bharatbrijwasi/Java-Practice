//program of Date and SimpleDateFormat class
//we are using Date class it's define in JDK 1.1 version to indeed used to manipulate year,month and day of current time
//with new version of java we use the GregorianCalender class
package basic_program;
import java.util.Date;
public class Third_Java_Program 
{

	public static void main(String[] args) 
	{
		//making the object of Date class
		 Date today;
		 //initialized with Date default Constructor that initi 
		 today = new Date();
		 System.out.println(today.toString());
		 
	}

}
