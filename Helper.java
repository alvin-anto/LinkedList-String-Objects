package LinkedListProject2;

//importing java.io.* package for using IOException
import java.io.*;

//importing java,util.* package
import java.util.*;


/**
 * The helper class 
 * @author alvinanto
 */
public class Helper 
{
	static ArrayList<LinkedString> linkedStringArrayList;

	/**
	 * The static void method start() creates an empty array list that can be used to store a list of LinkedString objects.
	 * This method also calls create()m method with a reference to the array list, which adds a list of LinkedString objects into the array list
	 * and displayAndMore() method with a reference to the array list, which displays the list of objects and tests other methods and operations.
	 * @throws IOException 
	 */
	public static void start() throws IOException
	{
		linkedStringArrayList = new ArrayList<LinkedString>();
		create(linkedStringArrayList);
		displayAndMore(linkedStringArrayList);
	}
	
	/**
	 * The static void method creat(ArrayList<LinkedString> arrayList) takes in lines from the text file and stores it as characters in noded in the LinkedString object.
	 * @param arrayList
	 * @throws IOException
	 */
	public static void create(ArrayList<LinkedString> arrayList) throws IOException
	{
		//creating a new FileReader object with "names.txt".
		FileReader file1 = new FileReader("names.txt");
		
		//creating BufferedReader object with file1.
		BufferedReader file2 = new BufferedReader(file1);
		
		//reads the first line from the text file.
		String line = file2.readLine();
		
		//using the constructor with the character array as the argument to test the program.
		arrayList.add(new LinkedString(line.toCharArray()));
		
		//reads the next line
		line = file2.readLine();
		
		//the loop is ran till there is no other lines in the text file and the item on each line is added as a LinkedString objects, which are then added to the array list.
		while (line != null)
		{
			arrayList.add(new LinkedString(line));
			line = file2.readLine();
		}
		
		//close the files used for taking input from the text file.
		file2.close();
		file1.close();
	}
	
	/**
	 * The displayAndMore(ArrayList<LinkedString> arrayList) diplays the objects in the array list and performs many operations on the linkedString objects in the array list and the array list itself.
	 * @param arrayList
	 * @throws IndexOutOfBoundsException
	 */
	public static void displayAndMore(ArrayList<LinkedString> arrayList) throws IndexOutOfBoundsException
	{
		for (int i = 0; i < arrayList.size(); i++)
		{
			for (int n = 0; n < arrayList.get(i).length(); n++)
			{
				System.out.print(arrayList.get(i).charAt(n));
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(arrayList.isEmpty());
		System.out.println();
		
		for (int i = 0; i < arrayList.size(); i++)
		{
			System.out.print(arrayList.get(i).length());
			System.out.println();
			System.out.print(arrayList.get(i).charAt(0));
			System.out.println();
			for (int n = 0; n < arrayList.get(i).substring(0,1).length(); n++)
			{
				System.out.print(arrayList.get(i).substring(0,1).charAt(n));
			}
			System.out.println();
			if (i == arrayList.size()-1)
			{
				continue;
			}
			for (int n = 0; n < arrayList.get(i).concat(arrayList.get(i+1)).length(); n++)
			{
				System.out.print(arrayList.get(i).concat(arrayList.get(i+1)).charAt(n));
			}
			System.out.println();
		}
		System.out.println();

	}

}
