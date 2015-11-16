
public class Address {
	private String streetNum;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String streetNum, String street, String city, String state, String zip) {
		setStreetNum(streetNum);
		setStreet(street);
		setCity(city);
		setState(state);
		setZip(zip);
	}
	public Address() {
		setStreetNum("N/A");
		setStreet("N/A");
		setCity("N/A");
		setState("N/A");
		setZip("N/A");
	}
	public void setStreetNum(String streetNum) {
		//add validation
		this.streetNum = streetNum;
	}
	public void setStreet(String street) {
		//add validation
		this.street = street;
	}
	public void setCity(String city) {
		//add validation
		this.city = city;
	}
	public void setState(String state) {
		//add validation
		this.state = state;
	}
	public void setZip(String zip) {
		//add validation
		this.zip = zip;
	}
	public String getStreetNum() {
		return streetNum;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String toString() {
		String result="";
		result+= streetNum + " " +street +", "+city+", "+state+" "+zip;
		return result;
	}
	
	public static void main(String[] args) {
		Address a1 = new Address("555", "Main St.", "Conway", "SC","29528");
		System.out.println(a1);
	}
	
}
