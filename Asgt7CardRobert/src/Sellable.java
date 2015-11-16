
public interface Sellable 
{
	String getName();
	double getPrice();
	String getId();
	Sellable clone();
	String getPriceForDisplay();
	double getPriceForSorting();

}
