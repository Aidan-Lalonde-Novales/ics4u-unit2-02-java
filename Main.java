/*
* This program finds the length of a board foot
* given width and height
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-10-10
*/

import java.util.Scanner;

/**
 * This is a board foot length calculator.
*/

final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner numObj = new Scanner(System.in);
        final Stack stack = new Stack();

        // Input
        System.out.println("Enter a number to add to a stack: ");

        // Process & Output
        try {
            final float userNum = numObj.nextFloat();
            stack.push(userNum);
            System.out.println("");
            stack.showStack();
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input.");
        }

        System.out.println("\nDone.");
    }
}
