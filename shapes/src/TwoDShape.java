
public abstract class TwoDShape 
{

	private String color;
	private double x;
	private double y;
	
	public TwoDShape()
	{
		this.color="orangutang";
		this.x=0;
		this.y=0;
	}
	public TwoDShape(String color, double x, double y)
	{
		this.color=color;
		this.x=x;
		this.y=y;
	}
	public String getColor()
	{
		return this.color;
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public String toString()
	{
		String result="";
		result +=color+", "+x+", "+y;
		return result;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
