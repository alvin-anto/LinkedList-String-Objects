package LinkedListProject2;

/**
 * The exception class handles the error when an invalid or out of bounds index number is used.
 * creates a LinkedListArrayListIndexOutOfBoundsException class, that prints the exception message, that extends IndexOutOfBoundsException
 * @author alvinanto
 */
public class LinkedListArrayListIndexOutOfBoundsException extends IndexOutOfBoundsException
{

	public LinkedListArrayListIndexOutOfBoundsException(String message) 
	{
		super(message);
	}

}
