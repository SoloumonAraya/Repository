package edu.clayton.csit.antlab.person;

Import java. util.Scanner;
/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
      public Person1(String pname) {
        name = pname;
    }

    /**
     * This method takes the input string and returns its characters rotated by 2 positions.
     * For example, given "gtg123b" it should return "g123bgt".
     * 
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        // Check if the input is not null and its length is greater than 2
        if (input != null && input.length() > 2) {
            // Rotate the string by 2 positions
            return input.substring(2) + input.substring(0, 2);
        }
        // If the input is too short to rotate, return it as is
        return input;
    }

    /**
     * Return a string representation of this object that varies with an input string
     * @param input the varying string
     * @return the string representing the object
     */
    public String toString(String input) {
        return name + ": " + calc(input);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Create a Person1 object with the user's name
        Person1 person = new Person1(name);

        // Prompt the user to enter a string to modify
        System.out.print("Enter a string to rotate by 2 positions: ");
        String input = scanner.nextLine();

        // Print the result
        System.out.println(person.toString(input));

        // Close the scanner
        scanner.close();
    }
}
