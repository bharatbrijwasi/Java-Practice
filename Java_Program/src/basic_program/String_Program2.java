/*
 * Sample program to display monogram
 */
package basic_program;
import java.util.*;
public class String_Program2 
{
	public static void main(String[] args) 
	{
		String name;
		Scanner scanner = new Scanner(System.in);
		//scanner.useDelimiter(System.getProperty("line.seperator"));
		System.out.println("Enter your full name(first name, last name):");
		name = scanner.nextLine();
		System.out.println(name+ "\n--------------------");
		
		System.out.println(name.substring(0, name.indexOf(" ")));
		System.out.println(name.substring(name.indexOf(" ")+1, name.length()));

	}

}
