import java.util.ArrayList;


public class Cat extends Pet implements Comparable{
	private boolean declawed;
	
	public Cat(double weight, String breed, String color, char gender, boolean hypoallergenic, boolean declawed)
	{
		super( weight,  breed,  color,  gender,  hypoallergenic);
		this.declawed=declawed;
	}
	
	//everything not specific to a cat must be constructed outside of super
	public Cat()
	{
		super(12,"Siamese","white and brown",'m',false);
		this.declawed = false;
	}
	
	public void meow()
	{
		System.out.println("Meowwwww....");
	}
	public void eat()
	{
		System.out.println("Yumm this fish is good");
	}
	//shared between cat and dog
	
	public void greet()
	{
		meow();
		System.out.println("Hi! Glad you're home!");
	}
	//overriding a method is replacing an inherited one
	//must use SUPER in order to call the Pet toString
	public String toString()
	{
		String result=super.toString();
		result+= declawed? "| Declawed":"| has claws";
		
//		if(declawed)
//		{
//			result+="declawed";
//		}
//		else
//		{
//			result+="has claws";
//		}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
		Dog d = new Dog(55, "German Sheperd", "blonde", 'f', false);
		Cat c = new Cat(15, "short-hair", "black", 'f', false, false);
		Pet p1 = new Dog(13, "Chalupa","red",'m',true);
		Pet p2 = new Cat(20, "Long-Haired","gray",'f',false, false);
		
		p1.greet();
		p2.greet();
		
		System.out.println(d);
		System.out.println(c);
		
		d.sleep();
		c.sleep();
		
		d.eat();
		c.eat();
		
		ArrayList<Pet> hotel = new ArrayList<Pet>();
		hotel.add(d);
		hotel.add(c);
		
		for(int i=0; i<hotel.size(); i++)
		{
			hotel.get(i).eat();
		}
	}

}
