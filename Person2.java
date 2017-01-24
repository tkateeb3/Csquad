package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 * A simple class for person 2 returns their name and a modified string
 *
 * @author Diana
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name, Diana */
    private String name;

    /**
     * The constructor, takes in the persons name
     * 
     * @param pname
     * the person's real name
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
	  //Person 2 put your implementation here
	    StringBuilder randomize = new StringBuilder(input);

	    for (int i = randomize.length() - 1; i > 0; i--) {
	      int index = new Random().nextInt( i + 1 );

	      //swap
	      char temp = randomize.charAt(i);
	      randomize.setCharAt(i, randomize.charAt(temp));
	      randomize.setCharAt(index, temp);
	    }

	    return randomize.toString();

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
