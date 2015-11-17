
public class Snack extends Product implements Sellable 
{
	private double price;
	
	public Snack(String name, double price)
	{
		super(name);
		this.price=price;
		this.id="Sna"+id;
	}
	public Snack(String id, String name, double price)
	{
		super(id, name);
		this.price=price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice()
	{
		this.price=price;
	}
	public double getPriceForSorting()
	{
		return this.price;
	}
	public String getPriceForDisplay()
	{
		return Double.toString(this.price);
	}
	public String toString()
	{
		return super.toString()+"| "+price;
	} 
	
	public Sellable clone()
	{
		return new Snack(this.id, this.name, this.price);
	}
}
