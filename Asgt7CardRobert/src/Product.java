
public class Product 
{
	protected String id;
	protected String name;
	
	private static int lastId=100;

	public Product(String name)
	{
		lastId++;
		this.name = name;
		this.id = Integer.toString(lastId);
	}
	public Product(String id, String name)
	{
		this.name=name;
		this.id=id;
	}
	public void setName()
	{
		this.name=name;
	}
	public void setId()
	{
		this.id=id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getId()
	{
		return this.id;
	}
	public String toString()
	{
		String result="";
		result +=name+"| "+id;
		return result;
	}
}