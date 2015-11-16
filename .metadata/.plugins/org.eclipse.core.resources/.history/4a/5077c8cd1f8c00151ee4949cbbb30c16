
public class Utilities 
{
	//replace "Objects" with "Comparable"
	public static void sort(IList list)
	{
		for(int i=0; i<list.size()-1; i++)
		{
			int smInd = i;
			
			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(j).compareTo(list.get(smInd)) < 0)
					smInd=j;
			}
			Comparable o = list.get(i);
			list.set(i, list.get(smInd));
			list.set(smInd, o);
		}
	}
	
	public static void main(String[] args) 
	{
		
	}

}
