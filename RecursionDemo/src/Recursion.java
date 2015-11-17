import java.util.InputMismatchException;
import java.util.Scanner;


public class Recursion {
	
	public static boolean isPalindrome(String text)
	{
//		int stop = text.length()-1;
//		int half = (stop/2);
//		String firstHalf = text.substring(0, half);
//		String secondHalf = text.substring(half, stop);
		if(text.length() <=1)
		{
			return true;
		}
		int length = text.length();
		char first = Character.toLowerCase(text.charAt(0));
		char last = Character.toLowerCase(text.charAt(length-1));
		
		if(first ==last)
		{
			String text2= text.substring(1,length-1);
			return isPalindrome(text2);
		}
		else
		{
			return false;
		}
	}

    public static double getValidDouble(String prompt, double min, double max) {
                    Scanner in = new Scanner(System.in);
                    //System.out.println(prompt);
                    double num = 0;
           
                    double result= min-1;

                            try 
                            {
                                 System.out.println(prompt);
                                 num = in.nextDouble();
                            } 
                            catch (InputMismatchException ime) 
                            {
                                    String trash = in.nextLine();
                                    System.out.println(trash+" is invalid.");
                            }
                            if(num<min||num>max)
                            	return getValidDouble(prompt, min, max);
                            else
                            	return num;
           
            }


	public static void main(String[] args) 
	{
//		double x = getValidDouble("Enter number: ",1,10);
//		System.out.println("Got: "+x);

		isPalindrome("racecar");
	}

}
