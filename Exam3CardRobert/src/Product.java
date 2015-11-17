
public  abstract class Product 
{
	private String name;
	protected double price;
	
	public Product()
	{
		this.name="Empty";
		this.price=0.00;
	}
	
	public Product(String name, double price)
	{
		this.name=name;
		this.price=price;
	}

	public String getName()
	{
		return this.name;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setName(String name) 
	{
		if(this.name.length()>1 && this.name.length()<50)
		{
		this.name = name;
		}
		else
		{
			this.name = "empty1";
		}
	}
	public void setPrice(double price) 
	{
		if(this.price>=0)
		{
		this.price = price;
		}
		else
		{
			this.price=0;
		}
	}
	public String toString() {
		//come back here
		return this.name +" "+this.price;
	}
	public boolean equals(Product other) 
	{
		if(this.price==other.price && this.name.equals(other.name))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	public abstract double putOnSale();
//	{
//		double p1= this.price;
//		p1 = (this.price*.2);
//		return p1;
//	}
	

	
	public static void main(String[] args) 
	{
		

	}

}
