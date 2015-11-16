import java.util.Comparator;

public class BankAccountsComparatorBalance implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		try
		{
			Account d1 = (Account) o1;
			Account d2 = (Account) o2;
			
			return (int)(d1.getBalance() - d2.getBalance());
			
//			if(d1.getWeight() < d2.getWeight())
//				return -1;
//			else if(d1.getWeight() > d2.getWeight())
//				return 1;
//			else
//				return 0;
		}
		catch(ClassCastException ce)
		{
			return -2;
		}
	}

}
