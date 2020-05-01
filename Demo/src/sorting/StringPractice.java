// wap to count number of vowel in a given string
package sorting;
import java.util.Scanner;
public class StringPractice 
{
	public static void main(String[] args) 
	{   
		final char BLANK = ' ';
		int wordcount = 0;
		String str = "I am a new java programmer";
		int index = 0;
		int stringLength = str.length();
	
		while(index < stringLength)
		{
			while(index < stringLength && str.charAt(index) == BLANK)
			{
				index++;
			}
			int startingIndex = index;
			while(index < stringLength && str.charAt(index) != BLANK)
			{
				index++;
			}
			int endIndex = index;
			wordcount++;
			if(startingIndex < endIndex)
			{
				System.out.println(str.substring(startingIndex, endIndex));
			}
		}
		System.out.println(wordcount);
	}
}
