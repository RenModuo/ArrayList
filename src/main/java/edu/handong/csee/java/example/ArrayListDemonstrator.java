package edu.handong.csee.java.example;
/**
 *	Demonstrating ArrayList, Creating a list with dynamic size through user input and displaying it in a list
 */
import java.util.ArrayList;		//for use of ArrayList and its method
import java.util.Scanner;		//For use of Scanner and its method
/*
 * Precondition: Input items into the array or list through user input
 * Postcondition: Output list of items from the list in order of input
 */
public class ArrayListDemonstrator {

	public static void main(String[] args) {
		
		//Creating new object
		ArrayListDemonstrator demonstrator = new ArrayListDemonstrator();
		
		//Calling method
		demonstrator.run();

	}

	private void run() {
		//Create an object of ArrayList Class, is a list that is similar to an array as it uses index
		ArrayList<String> toDoList = new ArrayList<String>();
        
		System.out.println ("Enter items for the list, when prompted.");
		
        //For loop condition
		boolean done = false;
		
        //For input
		Scanner keyboard = new Scanner (System.in); 
		
		//Loop for inputting elements into the list
		while (!done) {
			//Prompt user input
            System.out.println ("Type an entry:");
            
            //Catch user input and assign to a variable
            String entry = keyboard.nextLine();
            
            //Add user input via .add() method from ArrayList Class
            toDoList.add(entry);
            
            //Prompt continuation from user
            System.out.print ("More items for the list? ");
            String ans = keyboard.nextLine ();
            
            //If statement for breaking out of the loop
            if (!ans.equalsIgnoreCase ("yes"))
                done = true;	//Break condition
        }
		//Display
		System.out.println ("The list contains:");
        
		//Getting the size of the list
		int listSize = toDoList.size();
		
		//Looping to iterate through all items of the list and displaying them
        for (int position = 0 ; position < listSize ; position++)
            System.out.println (toDoList.get(position));	//Get the item in a specific index
        
        //Closes Scanner
        keyboard.close();
	}
}
