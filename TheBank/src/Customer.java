
public class Customer {
	private String name;
	private Address mailAddress;
	
	public Customer(String name, Address theAddress) {
		setName(name);
		setAddress(theAddress);
	}
	
	//just call the object constructor to initialize a data member
	public Customer() {
		setName("N/A");
		setAddress(new Address());
		//setDate(new Date());
		
	}
	public Customer clone()
	{
		Customer c= new Customer(this.name, this.mailAddress);
		return c;
	}
	public void setAddress(Address theAddress)
	{
		this.mailAddress = theAddress;
	}
	public Address getMailAdress()
	{
		return mailAddress;
	}
	//data validation for empty string and null
	public void setName(String name) {
		if(name != null && name.length() >0)
			this.name = name;
		else if (this.name != null && this.name.length() >0) {
			System.out.println("Error setting new name. Keeping original value.");
		}
		else {
			this.name = "N/A";
			System.out.println("Error setting new name. Setting to default N/A");
		}
	}
	
	public String getName() {
		return name;
	}
	public String toString() {
		return this.name +"\n"+ this.mailAddress;
	}
	
	public static void main(String[] args)
	{
		Customer one = new Customer();
		System.out.println(one);
		
		one.setName("Demi");
		one.setAddress( new Address("101","Railroad Ave","Conway","SC","29585"));
		System.out.println(one);
		
		Customer two = new Customer("Grayson", new Address("202","Main st.","Alberkee","NM","85764"));
		System.out.println(two);
		
		
	}
}
