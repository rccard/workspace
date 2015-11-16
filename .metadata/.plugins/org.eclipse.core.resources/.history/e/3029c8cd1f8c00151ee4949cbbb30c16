
public abstract class Pet{

	private double weight;
	private String breed;
	private String color;
	private char gender;
	private boolean hypoallergenic;
	
	public Pet(double weight, String breed, String color, char gender, boolean hypoallergenic)
	{
		this.weight=weight;
		this.breed=breed;
		this.color=color;
		this.gender=gender;
		this.hypoallergenic=hypoallergenic;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public String getBreed()
	{
		return breed;
	}
	public String getColor()
	{
		return color;
	}
	public char getgender()
	{
		return gender;
	}
	public boolean getHypoallergenic()
	{
		return hypoallergenic;
	}
	public String toString()
	{
		String result="";
		result += breed+"|"+color+"|"+weight+"|"+gender;
		if(this.hypoallergenic)
		{
			result+="|hypoallergenic";
		}
		return result;
	}

	public int compareTo(Object o) 
	{
		if(this == o)
			return 0;
		try 
		{
		Pet otherPet = (Pet) o;
		return this.breed.compareTo(otherPet.breed);
		}
		catch(ClassCastException ce)
		{
			return -2;
		}
		
	}
	
	public void sleep()
	{
		System.out.println("Curling up...yawn...");
	}
	
	public abstract void eat();
	
	public abstract void greet();
	
	
	public static void main(String[] args) 
	{
	
	}
}
