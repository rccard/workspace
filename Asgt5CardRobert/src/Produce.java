import java.util.Scanner;


public class Produce extends Product implements Sellable
{
	private double weight;
	private double unitPrice;
	
	public Produce(String name, double weight, double unitPrice)
	{
		super(name);
		this.weight=weight;
		this.unitPrice=unitPrice;
		this.id="Pro"+id;
	}
	public Produce(String id, String name, double weight, double unitPrice)
	{
		super("Pro"+id, name);
		this.weight=weight;
		this.unitPrice=unitPrice;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getUnitPrice()
	{
		return this.unitPrice;
	}
	public void setWeight()
	{
		this.weight=weight;
	}
	public void setUnitPrice()
	{
		this.unitPrice=unitPrice;
	}
	public double getPrice()
	{
		if(weight!=1)
		{
			return this.unitPrice*this.weight;
		}
		else
		{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a Weight for "+this.name+" at $"+unitPrice+" per Unit :");
		weight = in.nextDouble();
		double total = weight * unitPrice;
		return total;
		}
		
	}
	public double getPriceForSorting()
	{
		return this.unitPrice;
	}
	public String getPriceForDisplay()
	{
		return Double.toString(this.unitPrice)+" per pound";
	}
	public String toString()
	{
		return super.toString()+"| "+weight+"| "+unitPrice;
	} 
	//COME BACK TO MEEEEEEE
	public Sellable clone()
	{
		return new Produce(this.id, this.name, this.weight, this.unitPrice);
	}
}
