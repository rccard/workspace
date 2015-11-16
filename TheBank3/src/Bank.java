import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Bank {

	private ArrayList<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account theAccount) {
		accounts.add(theAccount);
	}
	public void printAllAccounts() {
		for(int i=0; i<accounts.size(); i++) {
			System.out.println(accounts.get(i).toString() );
		}
	}
	public double getTotalBalance() {
		double totalBal = 0;
		/*
		for(int i = 0; i< accounts.size(); i++) {
			totalBal = totalBal + accounts.get(i).getBalance();
		}
		*/
		for(Account ca : accounts) {
			totalBal = totalBal + ca.getBalance();
		}
		return totalBal;
	}
	
	public void printAccountById(int theId) {
		for(Account ca : accounts) {
			if(ca.getId() == theId) {
				System.out.println(ca.toString() );
				break;
			}
		}
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
	
public static int getValidInt(String prompt, int min, int max)
	
	{				
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean valid = false;
		do{
			System.out.println(prompt);
			try{				
					num = in.nextInt();
					if(num >= min && num <= max)		
						{
							valid = true;
						}
					else
						{
						System.out.println("The number must be in the range "+min+" to "+max);
						}
					System.out.println("you guessed "+num);				
				}
			catch(InputMismatchException ime)
				{
				System.out.println("Error. Please only enter an integer between "+min+" and "+max+" (inclusive)");
				in.next();
				}
			}
			while(!valid);
			return num;
	}


	
	public void runMenu() {
		final int QUIT = 5;
		int choice = 0;
		do {
			//Show menu
			showBankMenu();
			

			Scanner keyboard = new Scanner(System.in);
			
			choice = getValidInt("Please choose an option from the menu: ",1, QUIT);
			System.out.println("You chose option: "+choice);
			//Processing
			switch(choice) {
				case 1: System.out.println("Show all accounts");
				printAllAccounts();
					break;
				case 2: System.out.println("Sort Accounts by Name");
					Collections.sort(accounts, new BankAccountsComparator()); 
					printAllAccounts();
					break;
				case 3: System.out.println("Sort Accounts by Balance");
					Collections.sort(accounts, new BankAccountsComparatorBalance()); 
					printAllAccounts();
					break;
				case 4: System.out.println("Find account by id/name");
					String targetN = keyboard.next();
					
					
				
					
					
					break;
//				case 5:
//					System.out.println("Please Enter A Title(Linear)");
//					String targetStringL = keyboard.nextLine();
//					int indexL = findMovieByTitleLinear(movs, targetStringL);
//					printMovieByIndex(movs, indexL);
//					break;

				default: System.out.println("Not a valid option.");
			}
		}while(choice != QUIT);
	}
	
	public static int findAccount(ArrayList<Account> accounts, String targetString)
	{
//		System.out.println(movs[1].getMovieName());
//		System.out.println(targetString);

		//replace actual size with .size()
		for(int i = 0; i<accounts.size(); i++)
		{
			//String movieName = movs[i].getMovieName();
			//System.out.println(movieName);
			if (accounts.get(i).getName().equals(targetString))
			{
				return i;
			}
		}
		System.out.println("Not Found");
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank myBank = new Bank();
		
		myBank.addAccount(new CheckingAccount("xhrissie",98000));
		myBank.addAccount(new CheckingAccount("Joe",2));
		myBank.addAccount(new SavingsAccount());
		
		myBank.printAllAccounts();
		
		double total = myBank.getTotalBalance();
//		System.out.println(total);
//		
//		myBank.printAccountById(101);
//		System.out.println("----------");
//		myBank.printAccountById(102);
	
		myBank.runMenu();
	}

}
