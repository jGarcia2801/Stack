/**
 * 
 * @author Jonah Garcia
 * Follows the first in last out principle for inserting and removing objects
 * Differs from java.util.Stack
 * 
 */
public interface Stack<E> {
	
	/**
	 * @return # of elements in the stack
	 */
	int size();
	
	/**
	 * Tests if the stack is empty
	 * @return True is the stack is empty, otherwise returns false
	 */
	boolean Empty();
	
	/**
	 * Adds an object to the top of the stack
	 * @param item to be inserted
	 */
	void push(E item);
	
	/**
	 * @return the object at the top of the stack, if stack is empty returns null
	 */
	E peek();
	
	/**
	 * Returns and removes the top of the stack
	 * @return the object at the top of the stack, if stack is empty returns null
	 */
	E pop();
}
