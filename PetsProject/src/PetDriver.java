import java.util.ArrayList;
import java.util.Collections;


public class PetDriver 
{
	public static void printList(ArrayList<Dog> list)
	{
		for(Dog d: list)
		{
			System.out.println(d);
		}
		System.out.println("---------------------------------------");
	}
	public static void main(String[] args)
	{
		ArrayList<Dog> petStore = new ArrayList<Dog>();
		
		petStore.add(new Dog(55, "German Sheperd", "blonde", 'f', false));
		petStore.add(new Dog(55, "Cerberos", "black", 'f', true));
		petStore.add(new Dog(55, "Chalupa", "blonde", 'm', true));
		petStore.add(new Dog(100, "Lab", "yellow", 'm', false));
		petStore.add(new Dog(30, "Lab", "white", 'm', false));
		
		//System.out.println(petStore.toString());
		
		//test sorting
		printList(petStore);
		Collections.sort(petStore);
		printList(petStore);
		Collections.sort(petStore, new DogColorComparator());
		printList(petStore);
		Collections.sort(petStore, new DogWeightComparator());
		printList(petStore);
		
		//now we keep dogs and cats

	}
}
