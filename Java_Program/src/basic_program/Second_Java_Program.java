//Simple String Processing Program

package basic_program;

public class Second_Java_Program 
{
	public static void main(String[] args)
	{
		//declare identifier for storing some value related to Student
		 String fullName, firstName, lastName, space;
		 
		 fullName = new String("Bharat Sharma");
		 space = new String(" ");
		 
		 //getting first name from the fullname String by using substring() method and indexOf() method
		 firstName = fullName.substring(0, fullName.indexOf(space));
		 
		 //getting last name
		 lastName = fullName.substring(fullName.indexOf(space)+1, fullName.length());
		 
		 System.out.println("fullName: " +fullName);
		 System.out.println("firstName: " +firstName);
		 System.out.println("lastName: " +lastName);
		 System.out.println("Your last name has " +lastName.length()+ " characters");
		 
	}
}
