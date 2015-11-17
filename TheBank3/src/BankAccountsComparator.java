import java.util.Comparator;


public class BankAccountsComparator implements Comparator
{
	public int compare(Object o1, Object o2) 
	{
		try
		{
			Account a1 = (Account)o1;
			Account a2 = (Account)o2;
			
			if(a1.getName().compareTo(a2.getName() ) < 0)
				return -1;
			else if(a1.getName().compareTo(a2.getName() ) > 0)
				return 1;
			else
				return 0;
		}
		catch(ClassCastException ce)
		{
			return -2;
		}
	}
}