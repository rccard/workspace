import java.util.Comparator;


public class DogColorComparator implements Comparator 
{
	public int compare(Object o1, Object o2) 
	{
		try
		{
			Dog d1 = (Dog)o1;
			Dog d2 = (Dog)o2;
			
			if(d1.getColor().compareTo(d2.getColor() ) < 0)
				return -1;
			else if(d1.getColor().compareTo(d2.getColor() ) > 0)
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
