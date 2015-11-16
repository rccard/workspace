
public class Coupon extends Product implements Sellable{

private double price;
	
	public Coupon(String name, double price)
	{
		super(name);
		this.price=price;
		this.id="Cou"+id;
	}
	
	public Coupon(String id, String name, double price)
	{
		super(id, name);
		this.price=price;
	}

	public double getPrice()
	{
		return this.price;
	}

	public String getPriceForDisplay()
	{
		return Double.toString(this.price);
	}

	public double getPriceForSorting()
	{
		return this.price;
	}
	
	public Sellable clone()
	{
		return new Coupon(this.id, this.name, this.price);
	}

}
