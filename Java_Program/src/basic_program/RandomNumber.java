// selecting the winning number using the random class
 

package basic_program;
import java.util.*;
public class RandomNumber 
{
	public static void main(String[] args) 
	{
		int count; //no of party goers
		int startingNumber; //determine the value of M or starting number
		int min, max;
		int winningNumber;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of M:");
		startingNumber = scan.nextInt();
		
		System.out.println("Enter the Number of party goers:");
		count = scan.nextInt();
		
		min = startingNumber+1;
		max = startingNumber+count;
		
		winningNumber = random.nextInt(max-min+1) + min;
		System.out.println("The winning number is: " +winningNumber);
	}

}
