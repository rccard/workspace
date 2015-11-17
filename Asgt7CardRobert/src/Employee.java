
public class Employee {

	private String Name;
	private String Password;
	
	public Employee()
    {
        this.Name = "No Genre";
        this.Password = "No Password";
    }
	
	public Employee(String Name, String Password)
	{
		this.Name = Name;
		this.Password = Password;
	}
    public String getName()
    {
    	return Name;
    }
    public String getPassword()
    {
    	return Password;
    }
    public String toString()
	{
		String result="";
		
		result += this.Name +", "+this.Password;
		
		return result;
	}//End toString

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
