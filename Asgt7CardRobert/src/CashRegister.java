import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CashRegister
{
	private double registerBal;
	private boolean loggedIn;
	private int numTrans;
	Inventory inv;
	Transaction currentTrans;
	private ArrayList<Employee> aList;
	
	public CashRegister()
	{
		registerBal = 0.0;
		inv = new Inventory();
		currentTrans = null;
		numTrans = -5;
		loggedIn = false;
		aList = new ArrayList<Employee>();
		
		//////////////////////////////
		
			//read the file
			Scanner infile = null;
			try {
				String nm, pword;
				
				infile = new Scanner(new File("emp.txt"));
				infile.useDelimiter("[\t]");
				
				while(infile.hasNext())
				{

					try
					{

						nm = infile.next();
						
						String Name = nm;
						//System.out.println("name: "+nm);
						
						pword = infile.next();
						String Password = pword;
						//System.out.println("Password "+pword);
						
								
						Employee e = new Employee(Name, Password);
						//System.out.println(aList);
						aList.add(e);
						
//						System.out.println(m[count]);
						
						//System.out.println(aList);
					}
					catch(InputMismatchException e)
					{
						System.out.println("Could not load data for ");
						
								//+name[count]);
						infile.nextLine();
					
					}
					catch(ArrayIndexOutOfBoundsException a)
					{
					System.out.println("No movies outside of those bounds");
					}
					
				}//end while
				
			}//end try
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.print("Could not find file");
				e.printStackTrace();
			}
			finally 
			{infile.close();}
			
		
		
		/////////////////////////
	}
	
	public void printMenu()
	{
		System.out.println("Welcome to Grocery Store");
		System.out.println(" 1. List all products(from the inventory).");
		System.out.println(" 2. List product sorted by name");
		System.out.println(" 3. List products sorted by price");
		System.out.println(" 4. Start transaction");
		System.out.println(" 5. Calculate total");
		System.out.println(" 6. Finalize transaction");
		System.out.println(" 7. Cancel transaction");
		System.out.println(" 8. Employee Menu");
		System.out.println(" 9. Log In");
		System.out.println(" 10. Exit");
	}
	
	public void printMenuEmp()
	{
		System.out.println("Employee Menu");
		System.out.println(" 1. Add Item");
		System.out.println(" 2. Remove Item");
		System.out.println(" 11. quit");
	}
	
	public void runMenuEmp()
	{
		{
			final int QUIT = 11;
			int choice = 0;
			do {

				printMenuEmp();
				Scanner keyboard = new Scanner(System.in);
				choice = keyboard.nextInt();
				System.out.println("You chose option: "+choice);

				switch(choice) {
					case 1: System.out.println("Add Item");
						System.out.println("Please enter the item type (1 for Snack, 2 for Produce)");
						int choice2 = keyboard.nextInt();
						if(choice2 == 1)
						{
							System.out.println("Please enter a name for the Snack");
							String name = keyboard.next();
							System.out.println("Please enter a price for "+name);
							double price = keyboard.nextDouble();
							System.out.println("Please enter an amount for "+name);
							int amount = keyboard.nextInt();
							Snack s = new Snack(name, price);
							inv.add(s);
							int x = 2;
							while(x <= amount)
							{
								inv.incrementStock(s);
								x++;
							}
						}
						else if(choice2 == 2)
						{
							System.out.println("Please enter a name for the Produce");
							String name = keyboard.next();
							System.out.println("Please enter a weight for:"+name);
							double weight = keyboard.nextDouble();
							System.out.println("Please enter a unit price for:"+name);
							double unitPrice = keyboard.nextDouble();
							System.out.println("Please enter an amount for "+name);
							int amount = keyboard.nextInt();
							Produce s = new Produce(name, weight, unitPrice);
							inv.add(s);
							int x = 2;
							while(x <= amount)
							{
								inv.incrementStock(s);
								x++;
							}
						}
						break;
					case 2: System.out.println("Remove Item");
							System.out.println("Please enter the item ID");
							String Id = keyboard.next();
							System.out.println("Removed :"+inv.findById(Id));
							inv.remove(inv.findById(Id));
							
							
						break;
					case 3:	System.out.println("List products sorted by price");
							
						break;
					default: System.out.println("Not a valid option.");
				}
			}while(choice != 11);
		}
		
	}
	public void runMenu()
	{
		{
			final int QUIT = 15;
			int choice = 0;
			do {

				printMenu();
				Scanner keyboard = new Scanner(System.in);
				choice = keyboard.nextInt();
				System.out.println("You chose option: "+choice);

				switch(choice) {
					case 1: System.out.println("List all products(from the inventory).");
							inv.printAll();
						break;
					case 2: System.out.println("List product sorted by name");
							inv.sortByName();
							inv.printAll();
						break;
					case 3:	System.out.println("List products sorted by price");
							inv.sortByPrice();
							inv.printAll();
						break;
					case 4: System.out.println("Start transaction");
							if(currentTrans == null)
							{
								currentTrans = new Transaction();
							}
								String itemId = "";
								System.out.println("Please Scan an item(enter item ID) or 'q' to quit");
								
								itemId = keyboard.next();
								while(!itemId.equalsIgnoreCase("q"))
								{
								Sellable s = inv.findById(itemId);
								
								
								if(s == null)
								{
									System.out.println("No Such Item");
								}
								else
								{
									//inv.decrementStock(s);
									currentTrans.add(s);
									currentTrans.printItems();
								}
									System.out.println("Please Scan an item(enter item ID) or 'q' to quit");
								
									itemId = keyboard.next();
								}
						break;
					case 5: System.out.println("Calculate total");
						if(currentTrans == null)
						{
							System.out.println("Start a transaction first");
						}
						else
						{
							System.out.println("Subtotal : "+formatCurrency(currentTrans.getSubtotal()));
							System.out.println("Tax : "+formatCurrency(currentTrans.getTax()));
							System.out.println("=======================");
							System.out.println("Total : "+formatCurrency(currentTrans.getTotal()));
						}
						break;
					case 6: System.out.println("Finalize transaction");
							if(currentTrans == null || currentTrans.getTotal()<=0)
							{
								System.out.println("Transaction not started or balance is less than zero");
								System.out.println("Please start a transaction or add items");
							}
							else
							{
							System.out.println("========Total=======");
							System.out.println("Total : "+formatCurrency(currentTrans.getTotal()));
							System.out.println("====================");
								if(numTrans%5==0 && numTrans>=0)
								{
									System.out.println("!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!");
									System.out.println("CONGRATS 5th Customer!");
									System.out.println("Would you like to redeem your $5 voucher?('1' for yes, any other int for no");
									System.out.println("!*!*!*!*!*!*!*!*!*!*!*!*!*!*!*!");
									int custChoice = keyboard.nextInt();
									if(custChoice == 1)
									{
										
										System.out.println("========Total=======");
										System.out.println("Total : "+formatCurrency(currentTrans.getTotal()-5));
										System.out.println("====================");
										
										if((currentTrans.getTotal()-5) > 0)
										{
											System.out.println("===Please Enter Amount Paid===");
											double dollaBills = keyboard.nextDouble();
											while(dollaBills <currentTrans.getTotal()-5)
											{
												System.out.println("You entered: "+formatCurrency(dollaBills));
												System.out.println("Your bill is"+ formatCurrency(currentTrans.getTotal()-5));
												System.out.println("Please provide more money");
												double moDollas = keyboard.nextDouble();
												dollaBills = dollaBills + moDollas;
											}
										
										registerBal = dollaBills + registerBal;
										}
										else
										{
											registerBal = 0;
										}
										
										System.out.println(registerBal);
										
										System.out.println("Thank you for your purchase");
										
										for(int i=0; i<currentTrans.getNumItems();i++)
										{
											Sellable s = currentTrans.getProductAt(i);
											inv.decrementStock(s);
										}	
										numTrans ++;
										//System.out.println(numTrans);
										currentTrans=null;
										break;
									}
								}

									System.out.println("===Please Enter Amount Paid===");
									double dollaBills = keyboard.nextDouble();
									while(dollaBills <currentTrans.getTotal())
									{
										System.out.println("You entered: "+formatCurrency(dollaBills));
										System.out.println("Your bill is"+ formatCurrency(currentTrans.getTotal()));
										System.out.println("Please provide more money");
										double moDollas = keyboard.nextDouble();
										dollaBills = dollaBills + moDollas;
									}
									
									registerBal = dollaBills + registerBal;
									
									System.out.println(registerBal);
									
									System.out.println("Thank you for your purchase");
									
									for(int i=0; i<currentTrans.getNumItems();i++)
									{
										Sellable s = currentTrans.getProductAt(i);
										inv.decrementStock(s);
									}	
									numTrans ++;
									System.out.println(numTrans);
									currentTrans=null;
								
							
							
							}
						break;
					case 7: System.out.println("Cancel transaction");
							currentTrans=null;
						break;
					case 8: System.out.println("Employee Menu");
						if(loggedIn==true)
						{
							runMenuEmp();
						}
						else
						{
							System.out.println("Please log in to access this menu");
						}
						break;
					case 9: System.out.println("Log In");
						logIn();
						break;
					default: System.out.println("Not a valid option.");
				}
			}while(choice != 10);
		}
	}
	public void logIn()
	{
		Scanner in = new Scanner(System.in);
		String inputName;
		String inputPass;
		
		System.out.println("Please enter your user name");
		inputName = in.nextLine();
		System.out.println(inputName);
		System.out.println("Please  enter your password");
		inputPass = in.nextLine();
		System.out.println(inputPass);
		
		boolean flag = false;
		int i=0;
		
		while(flag != true && i<=aList.size()-1)
		{
			if(aList.get(i).getName().equals(inputName) && aList.get(i).getPassword().equals(inputPass))
			{
				flag = true;
				loggedIn = true;
				System.out.println("Login successful");
			}
			else
			{
				
				i++;
				System.out.println(i);
			}
		}
	}
	public String formatCurrency(double a)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(a);
		return moneyString;
	}
	public static void main(String[] args) 
	{
		CashRegister cash = new CashRegister();
		
		
		
		cash.runMenu();
	}
}
