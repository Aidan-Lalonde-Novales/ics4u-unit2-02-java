/*
* This file pushes to and prints a stack.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-10-10
*/

import java.util.ArrayList;

/**
 * Stack Class.
 */
public class Stack {
    /**
     * Creates an Array Stack.
     */
    private ArrayList<Number> stack = new ArrayList<Number>();

    /**
     * This function pushes a number to the stack.
     *
     * @param userNum - number to be pushed to the stack.
     */
    public void push(float userNum) {
        stack.add(userNum);
    }

    /**
     * This function prints the stack.
     */
    public void showStack() {
        System.out.println(stack);
    }
}
