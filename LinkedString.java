/**
 * This program creates LinkedString objects which contains character Nodes which are linked using doubly linked list.
 */
package LinkedListProject2;

/**
 * @author alvinanto
 * 03/08/2022
 * ICSI Project 2
 */

/**
 * creating the LinkedString class, which implements the LinkedStringInterface, that stores the characters of the items as nodes in the doubly linked list.
 */
public class LinkedString implements LinkedStringInterface
{
	//creating a Node with reference type Character, 'head' and making it private so that other classes cannot access or modify it.
	private Node<Character> head;
	//crating an int variable count to store the length of the doubly linked list and it is intialized to 0.
	private int count = 0;

	/**
	 * the empty constructor that allocates a new character linked list which contains the sequence of 0 characters. 
	 * This constructor invokes the overloading constructor.
	 */
	public LinkedString() 
	{
		this(new char[0]);
	}
	
	/**
	 * The overloading constructor with the char array parameter, allocates a new character linked list which represents 
	 * the sequence of characters currently contained in the char[] argument.
	 * @param charArray
	 */
	public LinkedString(char[] charArray)
	{
		//if there is no elements
		if (head == null)
		{
			//makes the first character in the array the head of the node and then, adding each of the next characters in the linked list 
			//using another node and a pointer node which keeps track of the previous and next nodes.
			int arraySize = charArray.length;
			Node<Character> newNode = new Node<>(charArray[0]);
			this.head = newNode;
			Node<Character> pointer = head;
			count++;
			for (int i = 1; i < arraySize; i++)
			{
				newNode = new Node<>(charArray[i]);
				pointer.setNext(newNode);
				newNode.setPrevious(pointer);
				count++;
				pointer = newNode;
			}
		}
		//if the linked list is not empty
		else
		{
			//adding the first character in the array to the node connected to the last node with element and adding the remaining 
			//characters to the list and then using another node and pointer node to keep track of the previous and next nodes
			Node<Character> pointer = head;
			while(!(pointer == null))
			{
				pointer = pointer.getNext();
			}
			int arraySize = charArray.length;
			Node<Character> newNode = new Node<>(charArray[0]);
			pointer.setNext(newNode);
			newNode.setPrevious(pointer);
			count++;
			pointer = newNode;
			for (int i = 1; i < arraySize; i++)
			{
				Node<Character> nextNode = new Node<>(charArray[i]);
				pointer.setNext(nextNode);
				nextNode.setPrevious(pointer);
				count++;
				pointer = nextNode;
			}
		}
	}
	
	/**
	 * The overloading constructor with the String parameter, which converts the String to an array of characters and 
	 * then calling the second overloading constructor with the array as the argument.
	 * @param word
	 */
	public LinkedString(String word)
	{
		this(word.toCharArray());
	}
	
	/**
	 * This method checks if the linked list is empty or not.
	 * @return true if the list is empty, and false if it is not.
	 */
	public boolean isEmpty()
	{
		//if there is no elements
		if (count == 0)
		{
			return true;
		}
		//if there are elements in the linked list
		else
			return false;
	}
	
	/**
	 * This method returns the length of the linked list
	 * @return count the number of nodes or elements in the doubly linked list
	 */
	public int length()
	{
		return count; 
	} 
	
	/**
	 * The charAt() method collects the linked list characters and converts it into a string and then returns the character at the index number given.
	 * @param index
	 * @return the character at the index given
	 * @throws LinkedStringException
	 */
	public char charAt(int index) throws LinkedStringException
	{
		//if there is no element
		if (count == 0)
		{
			//throws exception
			throw new LinkedStringException("The linked list is empty");
		}
		//if the list is not empty
		else
		{
			String collectionString = "";
			Node<Character> pointer = head;
			while(!(pointer == null))
			{
				collectionString += pointer.getData();
				pointer = pointer.getNext();
			}
			return collectionString.charAt(index);
		}
		
	}
	
	/**
	 * The substring() method collects the characters of the linked list and converts it to a string and then find the substring within 
	 * the given index values and then converts it back to a LinkedString object and then returns it
	 * @param index1, index2
	 * @return the LinkedString list which contains the substring within the index values given.
	 * @throws LinkedStringException
	 */
	public LinkedString substring(int index1, int index2) throws LinkedStringException
	{
		//if the list is empty
		if (count == 0)
		{
			//throws exception
			throw new LinkedStringException("The linked list is empty");
		}
		//if the list is not empty
		else
		{
			String collectionString = "";
			Node<Character> pointer = head;
			while(!(pointer == null))
			{
				collectionString += pointer.getData();
				pointer = pointer.getNext();
			}
			String newString = collectionString.substring(index1, index2);
			LinkedString newLinkedList = new LinkedString(newString);
			return newLinkedList;
		}
	}
	
	/**
	 * The method concat() converts, the characters of both LinkedString list that the method is called from and the LinkedString list
	 * passed as the argument, into String objects which are combined together and then re-converted back to a LinkedString object which is returned.
	 * @param secondLinkedList
	 * @return the LinkedString list which combines the characters of the LinkedString list and the linked list passed as the argument
	 */
	public LinkedString concat(LinkedString secondLinkedList)
	{
		String collectionString = "";
		Node<Character> pointer = head;
		while(!(pointer == null))
		{
			collectionString += pointer.getData();
			pointer = pointer.getNext();
		}
		Node<Character> pointer2 = secondLinkedList.head;
		while (!(pointer2 == null))
		{
			collectionString += pointer2.getData();
			pointer2 = pointer2.getNext();
		}
		LinkedString newList = new LinkedString(collectionString);
		return newList;
	}
}
