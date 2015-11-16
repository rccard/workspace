
public class SavingsAccount implements Account {

	public SavingsAccount() {
		
	}
	public String toString() {
			
			return String.format("%-8d-%10s: %7.2f",getId(),getName(),getBalance());
			//return id+"-"+name+": "+balance;
		}
	
	public double getBalance() {
		return 30000;
	}
	public int getId() {
		return 200;
	}
	public String getName()
	{
		return "Clark";
	}
	
}
