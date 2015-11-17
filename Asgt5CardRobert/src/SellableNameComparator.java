import java.util.Comparator;


public class SellableNameComparator implements Comparator 
{
	public int compare(Object o1, Object o2) 
	{
		try
		{
			Sellable d1 = (Sellable)o1;
			Sellable d2 = (Sellable)o2;
			
			if(d1.getName().compareTo(d2.getName() ) < 0)
				return -1;
			else if(d1.getName().compareTo(d2.getName() ) > 0)
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
