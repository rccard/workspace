import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class DataStructuresDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		//
		//ARRAY LIST
		//
		ArrayList<Dog> aList = new ArrayList<Dog>();
		
		aList.add(new Dog(55, "German Sheperd", "blonde", 'f', false));
		aList.add(new Dog(55, "Cerberos", "black", 'f', true));
		aList.add(new Dog(55, "Chalupa", "blonde", 'm', true));
		
//		for(int i=0; i<aList.size(); i++)
//		{
//			System.out.println(aList.get(i));
//		}
		
		//
		//LINKED LIST
		//
		LinkedList<Dog> llist = new LinkedList<Dog>();
		
		llist.add(new Dog(55, "German Sheperd", "blonde", 'f', false));
		llist.add(new Dog(55, "Cerberos", "black", 'f', true));
		llist.add(new Dog(55, "Chalupa", "blonde", 'm', true));
		
//		for(int i=0; i<llist.size(); i++)
//		{
//			System.out.println(llist.get(i));
//		}
		
		//the more efficient way to traverse a linked list
		//the iterator
//		System.out.println("---Forwards---");
//		ListIterator iter = llist.listIterator();
//		while(iter.hasNext())
//		{
//			System.out.println( iter.next() );
//		}
//		
//		System.out.println("---Backwards---");
//		//going backwards
//		ListIterator iterB = llist.listIterator(llist.size());
//		while(iterB.hasPrevious())
//		{
//			System.out.println(iterB.previous());
//		}
		
		//
		//HashMap
		//Must use the wrapper class for the primitive types, lets you treat a primitive as an object
		//
		
		HashMap<String, Integer> hmap = new HashMap<String,Integer>();
		//tells you how many of each object you have
		hmap.put("Chalupa", 5);
		hmap.put("Cerberos", 7);
		hmap.put("German Sheperd", 3);
		
		//Prints out the amount of Cerberos there are
		System.out.println(hmap.get("Cerberos"));
	}

}
