import java.util.Comparator;


public class DogWeightComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		try
		{
			Dog d1 = (Dog) o1;
			Dog d2 = (Dog) o2;
			
			return (int)(d1.getWeight() - d2.getWeight());
			
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
