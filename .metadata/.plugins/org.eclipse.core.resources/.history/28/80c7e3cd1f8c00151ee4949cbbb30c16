import java.util.Comparator;


public class SellablePriceComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		try
		{
			Sellable d1 = (Sellable) o1;
			Sellable d2 = (Sellable) o2;
//			
//			return (int)(d1.getPriceForSorting() - d2.getPriceForSorting());
			
			if(d1.getPriceForSorting() < d2.getPriceForSorting())
				return -1;
			else if(d1.getPriceForSorting() > d2.getPriceForSorting())
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