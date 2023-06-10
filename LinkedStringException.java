package LinkedListProject2;

/**
 * The exception class handles the error when there is a run time error.
 * creates a LinkedStringException class, that prints an exception message, that extends RuntimeException
 * @author alvinanto
 */
public class LinkedStringException extends RuntimeException
{

	public LinkedStringException(String message) 
	{
		super(message);
	}

}