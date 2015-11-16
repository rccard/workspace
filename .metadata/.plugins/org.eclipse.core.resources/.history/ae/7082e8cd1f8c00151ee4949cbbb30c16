
public class DigitalProduct extends Product
{

	private double fileSize;
	

	public DigitalProduct()
	{
		super("empty2", 0.0);
		this.fileSize=0.0;
	}
	
	public DigitalProduct(String name, double price, double fileSize)
	{
		super( name, price);
		this.fileSize=fileSize;
	}
	
	public double getFileSize()
	{
		return this.fileSize;
	}
	public void setFileSize(double fileSize) 
	{
		this.fileSize=fileSize;
	}
	public String toString()
	{
		String result=super.toString();
		result+= this.fileSize;
		
		
		return result;
	}
	
	public boolean equals(DigitalProduct other) 
	{
		if(this.fileSize==other.fileSize)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public double putOnSale()
	{
		double p1= this.price;
		p1 = (this.price*.4);
		double newP = this.price-p1;
		return newP;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
