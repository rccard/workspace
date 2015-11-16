
public class Transaction 
{
	private double amount;
	private String descr;
	private int type;
	
	//static means there is only one copy of this variable
	
	public static final int WITHDRAWAL = 2;
	public static final int DEPOSIT = 1;
	public static final int TRANSFER = 3;
	public static final int OTHER = 4;
			
	public Transaction(double amt, String descr, int type)
	{
		this.amount = amt;
		this.descr = descr;
		this.type = type;
	}
	public String getStringtype()
	{
		switch(this.type)
		{
		case Transaction.DEPOSIT: return "Deposit";
		case Transaction.WITHDRAWAL: return "Withdrawel";
		case Transaction.TRANSFER: return "Transfer";
		default: return "Undefined";
		}
	}
	//cannot be static because it must have the object to pull
	public String toString()
	{
		return this.getStringtype()+" $"+this.amount+" "+this.descr;
	}
	
	
	public static void main(String[] args)
	{
		Transaction t1 = new Transaction(300, "Dentist appt", 2);
		System.out.println(t1);
		Transaction t2 = new Transaction(200, "gift", 1);
		System.out.println(t2);
	}
}
