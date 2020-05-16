//This is the first java Program that display a window on the screen 
//title of window:MY FIRST JAVA PROGRAM
//width of window:700px and height of window:500


package basic_program;
import javax.swing.*;

public class First_Java_Program {

	public static void main(String[] args) 
	{
		//declare object of JFrame class
		JFrame myWindow;
		
		//create object of JFrame class with the help new operator
		myWindow = new JFrame();
		
		//sending the message to myWindow object for setting the window width and height
		myWindow.setSize(700,500);
		
		//sending the message to myWindow object for setting the title of Window
		myWindow.setTitle("My FIRST JAVA PROGRAM");
		
		//sending the message(true) to myWindow object for visibility of Window on the screen
		myWindow.setVisible(true);
		
		//sending the message to myWindow object to closing the Window when user click on toolbar(close) button 
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
