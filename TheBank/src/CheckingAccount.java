import java.util.ArrayList;


public class CheckingAccount implements Account {
	
	//data
	private int id;
	private String name;
	private double balance;
	private ArrayList<Transaction> transactions;
	//private Transaction[] transactions //this is an array, above is an array list
	
	private static int lastId=100;
	
	public CheckingAccount(double bal) {
		lastId++;
		setBalance(bal);
		this.name = "No name";
		this.id = lastId;
		
		//everything must be initialized in all constructors
		transactions = new ArrayList<Transaction>(200);
		//transactions = new Transaction[200];
	}
	//method
	public CheckingAccount( String name, double bal) {
		//best to use setters with validation
		
		lastId++;
		this.id = lastId;
		this.name = name;
		setBalance(bal);
		
		transactions = new ArrayList<Transaction>(200);
	}
	public void withdraw(double amt, String descr) 
	{
		if(amt > 0 && amt <= this.balance) 
		{
			setBalance(this.balance - amt);
			//this.balance = this.balance - amt;
			//should always be a 2 for withdraw
			Transaction t = new Transaction(amt, descr ,Transaction.WITHDRAWAL);
			transactions.add(t);
			//array would have been like so
			//transactions[size] = t;
		}
		else 
		{
			System.out.println("Not enough to cover withdraw");
		}
	}
	//overloading (having two methods with the same name but different parameter lists)
	public void withdraw(double amt)
	{
		withdraw(amt, "Withdrawal - no descr available");
	}
	public void deposit(double amt)
	{
		deposit(amt, "Deposit - no descr available");
	}
	public void deposit(double amt, String descr) 
	{
		if(amt > 0 ) 
		{
			setBalance(this.balance + amt);
			Transaction t = new Transaction(amt, descr ,Transaction.DEPOSIT);
			transactions.add(t);
		}
	}
	private void setBalance(double bal) {
		if(bal >= 0) {
			this.balance = bal;
		}
		else
			this.balance = 0;
	}
	
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
	
	
	public void setName(String name) {
	   if(name != null && name.length() >1) {
		   this.name = name;
	   }
	   else
		   this.name = "No name";
	}
	public String toString() {
		
		return String.format("%-8d-%10s: %7.2f",id,name,balance);
		//return id+"-"+name+": "+balance;
	}
	//overloading
	public int getId() {
		return this.id;
	}
	public ArrayList<Transaction> getTransactions()
	{
		return (ArrayList<Transaction>)transactions.clone();
	}
	
	public static void main(String[] args)
	{
		CheckingAccount ca = new CheckingAccount("Bob", 1000);
		ca.withdraw(300, "Dentist appt");
		System.out.println(ca);
		
		ArrayList<Transaction> theList = ca.getTransactions();
		for(int i=0; i<theList.size(); i++)
		{
			System.out.println(theList.get(i));
			//System.out.println(theList[i];
		}
		theList.set(0, new Transaction(200, "some descr", Transaction.WITHDRAWAL));
		
		
		
		ArrayList<Transaction> theList2 = ca.getTransactions();
		for(int i=0; i<theList2.size(); i++)
		{
			System.out.println(theList2.get(i));
			//System.out.println(theList[i];
		}
		theList.set(0, new Transaction(200, "some descr", Transaction.WITHDRAWAL));
		
		ca.deposit(500, "tax refund");
		
		System.out.println(ca);
		
		ArrayList<Transaction> theList3 = ca.getTransactions();
		for(int i=0; i<theList.size(); i++)
		{
			System.out.println(theList3.get(i));
			//System.out.println(theList[i];
		}
	}

}
