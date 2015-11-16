
public class Dog extends Pet implements Comparable
{
	
	
	public Dog(double weight, String breed, String color, char gender, boolean hypoallergenic)
	{
		super( weight,  breed,  color,  gender,  hypoallergenic);
	}
	public Dog()
	{
		this(10.0, "Pomeranian", "no", 'm', false);
	}
	
	
	//specific to dog
	public void bark()
	{
		System.out.println("Fuffff..ffff");
	}
	public void eat()
	{
		System.out.println("Yumm this bone is good");
	}
	//shared between cat and dog
	
	public void greet()
	{
		bark();
		System.out.println("Hi! Glad you're home!");
	}
}
