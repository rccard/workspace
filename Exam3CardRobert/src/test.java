import java.util.ArrayList;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

//		Product p = new DigitalProduct();
//		System.out.println(p.toString());
		
		DigitalProduct dp = new DigitalProduct("Half Life 3", 599.0, 10);
		PhysicalProduct pp = new PhysicalProduct("A Table", 8.0);
		Product p1 = new DigitalProduct("TF2", 2, 15);
		Product p2 = new PhysicalProduct("A Chair", 2);
		
		System.out.println(dp);
		System.out.println(pp);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(dp.equals(pp));
		System.out.println(dp.equals(dp));
		
		System.out.println(pp.equals(pp));
		
		System.out.println(pp.putOnSale());
		System.out.println(dp.putOnSale());
	}

}
