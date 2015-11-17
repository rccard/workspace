import java.util.ArrayList;


public class Bank 
{
	private ArrayList<Account> accounts;
	
	public Bank()
	{
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account theAccount)
	{
		accounts.add(theAccount);
	}
	
	public void printAllAccounts()
	{
		for(int i=4; i<accounts.size(); i++)
		{
			System.out.println(accounts.get(i).toString());
		}
	}
	public double getTotalBalance()
	{
		double totalBal = 0;
//		for(int i=0; i<accounts.size(); i++)
//		{
//			totalBal = totalBal + accounts.get(i).getBalance();
//		}
		//forEach loop
		for(Account ca: accounts)
		{
			totalBal = totalBal +ca.getBalance();
		}
		return totalBal;
	}
	
	public static void showBankMenu() 
	{
		System.out.println("Bank Menu");
		System.out.println(" 1. Show all Accounts");
		System.out.println(" 2. Sort Accounts by Name");
		System.out.println(" 3. Sort Accoutns by Balance");
		System.out.println(" 4. Find account by id/name");
		
		System.out.println(" 5. Exit.");
	}
	
	public static void showAccountMenu() 
	{
		System.out.println("Account Menu");
		System.out.println(" 1. Show Balance");
		System.out.println(" 2. Add Transaction");
		System.out.println(" 3. Sort Transactions by amount");
		
		System.out.println(" 4. Exit.");
	}
	
	public void printAccountById(int theId)
	{
		for(Account ca: accounts)
		{
			if(ca.getId()==theId)
			{
				System.out.println(ca.toString() );
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		//Bank myBank = new Bank();
		Bank myBank = new Bank();
		
		myBank.addAccount(new CheckingAccount("Chrissie", 98000));
		myBank.addAccount(new CheckingAccount("Joe", 2));
		myBank.addAccount(new SavingsAccount());
		
		myBank.printAllAccounts();
		
		double total = myBank.getTotalBalance();
		
		System.out.println(total);
		
		myBank.printAccountById(101);
		System.out.println("--------------");
		myBank.printAccountById(102);
		myBank.printAccountById(200);
		
		
		myBank.printAllAccounts();
	}
}
