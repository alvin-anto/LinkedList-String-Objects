package LinkedListProject2;


/**
 * The interface of the LinkedString class which specifies all the methods needed in the class.
 * @author alvinanto
 */
public interface LinkedStringInterface
{
	//returns the char value at the specified index
	public char charAt(int index) throws LinkedStringException;
	
	//concatenate a specified linked string to the end of this linked string
	public LinkedString concat(LinkedString secondLinkedList);
	
	//returns true if and only if the length of this linked list is 0
	public boolean isEmpty();
	
	//returns the length of this linked string
	public int length();
	
	//returns a new linked string that is a substring of this linked string
	public LinkedString substring(int index1, int index2) throws LinkedStringException;
}
