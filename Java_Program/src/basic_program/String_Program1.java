/*
 * Reads a person's name and display a greeting
 */

package basic_program;
import java.util.Scanner;
public class String_Program1 
{
	public static void main(String[] args)
	{
		String firstName;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		firstName = in.next(); //accept the characters up to, but not including, the first space
		System.out.println("Hi, " +firstName+ ". Nice to meet you!");
	}
}
