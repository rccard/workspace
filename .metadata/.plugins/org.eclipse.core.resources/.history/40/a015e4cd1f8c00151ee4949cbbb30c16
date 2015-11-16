import java.util.ArrayList;


public class Transaction
{
	private double subtotal;
	private static final double TAX_RATE = .08;
	
	private ArrayList<Sellable> tList;
	
	public Transaction()
	{
		tList = new ArrayList<Sellable>();
		subtotal = 0.0;
	}
	public void add(Sellable s)
	{
		subtotal += s.getPrice();
		tList.add(s);
	}
	public void remove(Sellable s)
	{
		//subtotal = subtotal - s.getPrice();
		
		tList.remove(s);
	}
	public double getSubtotal()
	{
		return this.subtotal;
		
//		double sum = 0;
//		
//		for(Sellable b : tList)
//		{
//		  sum += b.getPrice();
//		}
//		return sum;
	}
	public double getTotal()
	{
		double sum = 0;
		double tax = 0;
		
		for(Sellable b : tList)
		{
		  sum += b.getPrice();
		}
		tax = sum*TAX_RATE;
		sum = tax+sum;
		
		
		return sum;
	}
	public double getTax()
	{
		double sum = 0;
		double tax = 0;
		
		for(Sellable b : tList)
		{
		  sum += b.getPrice();
		}
		tax = sum*TAX_RATE;
		
		return tax;
	}
	public void printItems()
	{
		for(Sellable a:tList)
		{
			System.out.println(a);
		}
	}
	public Sellable getProductAt(int index)
	{
		return tList.get(index);
	}
	public int getNumItems()
	{
		int size=tList.size();
		return size;
	}

	public static void main(String[] args) 
	{
		Transaction trans = new Transaction();
		
		trans.printItems();
	}
}
