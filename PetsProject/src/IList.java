//extends comparable doesnt work for any data type only comparable data types
public interface IList <T extends Comparable>
{
	//replace all objects with capital 'T'
	//called a generic type
	int size();
	T get(int i);
	void set(int i, T o);
}
