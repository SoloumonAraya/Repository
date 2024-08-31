package edu.clayton.csit.antlab.person;
import java.util.*;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Qu
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	 //converts the inputted string in to charachters
	  char[] random_input = input.toCharArray();
	
	  char shift;
	  String random_output = null;
	  
	  Random a = new Random(); 

	if( input != null){
	//this follows up with shuffling the character randomly	
        for (int b = random_input.length - 1; b > 0; b--) {  
            
            int c = a.nextInt(b + 1);
            
            shift = random_input[b];  
            
            random_input[b] = random_input[c];  
            
            random_input[c] = shift;

		//conversts the shuffled characters back to string
            random_output = String.valueOf(shift);
        }
        //prints the user name after it has been shuffled
        System.out.println("The name of the user is" + random_output);

	}

	else
	{
		System.out.println("input value is null");
	}
	  
	  return null;
	}  
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
	
	
}
