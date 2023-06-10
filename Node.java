package LinkedListProject2;

/**
 * @author alvinanto
 *The generic Nose<E> class is created that can be instantiated to create a node containing an element of any reference type.
 */
public class Node<E> 
{
	//the variable of generic type E, item, which stores the data in the Node object
	private E item;
	
	//the Node<E> next which keeps track of the next node in the list
	private Node<E> next;
	
	//the Node<E> previous which keeps track of the previous node in the list.
	private Node<E> previous;
	 

	/**
	 * The empty constructor that sets the item, previous and next to null
	 */
	public Node() 
	{
		this.item = null;
		this.previous = null;
		this.next = null;
	}
	
	/**
	 * The overloading constructor with the parameter item of generic data type E, sets the value of item to the argument passed and the previous and next to null.
	 * @param item
	 */
	public Node(E item) 
	{
		this.item = item;
		this.previous = null;
		this.next = null;
	}
	
	/**
	 * The overloading constructor with three parameters item, next and previous, sets the value of item to the item argument, next to the next argument and previous to the previous arguments passed.
	 * @param item
	 * @param next
	 * @param previous
	 */
	public Node(E item, Node<E> next, Node<E> previous) 
	{
		this.item = null;
		this.next = next;
		this.previous = previous;
	}
	
	/**
	 * The void method setNext() sets the Node next to the node passed in as the argument.
	 * @param node
	 */
	public void setNext(Node<E> node)
	{
		next = node;
	}
	
	/**
	 * The void method setPrevious() sets the Node previous to the node passed in as the argument.
	 * @param node
	 */
	public void setPrevious(Node<E> node)
	{
		previous = node;
	}
	
	/**
	 * The getData() method of generic data type E, returns the data that is in the node.
	 * @return item, the data that is in the node
	 */
	public E getData()
	{
		return item;
	}
	
	/**
	 * The Node<E> getNext() method returns the next node to this node.
	 * @return
	 */
	public Node<E> getNext()
	{
		return next;
	}
	
	/**
	 * The Node<E> getPrevious() method returns the previous node to this node.
	 * @return
	 */
	public Node<E> getPrevious()
	{
		return previous;
	}
	
	

}
