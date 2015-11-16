
public class Customer {
	private String name;
	private Address mailAddress;
	
	public Customer clone() {
		Customer c = new Customer(this.name, this.mailAddress);
		return c;
	}
	
	public Customer(String name, Address theAddress) {
		setName(name);
		setAddress(theAddress);
	}
	
	public Customer() {
		setName(new String("N/A"));
		setAddress(new Address());
	}
	public void setAddress(Address theAddress) {
		this.mailAddress = theAddress;
	}
	public Address getMailAddress() {
		return this.mailAddress;
	}
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
		//come back here
		return this.name +"\n"+this.mailAddress;
	}
	public static void main(String[] args) {
		Customer one = new Customer();
		System.out.println(one.toString());
		
		one.setName("Demi");
		System.out.println(one.toString());
		
		one.setAddress(new Address("101","Railroad Ave.","Conway","SC","29528") );
		System.out.println(one.toString());
		
		Customer two = new Customer("Grayson", new Address("202","Main St.","Albakurkee", "NM","85764") );
		System.out.println(two);
	}
	
}
