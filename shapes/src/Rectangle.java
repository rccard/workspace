
public class Rectangle extends TwoDShape implements GeometricFigure
{
	private double length;
	private double width;
	
	public Rectangle(String color, int x, int y, int length, int width)
	{
		super(color,x,y);
		this.length=length;
		this.width=width;
	}
	public Rectangle()
	{
		super("orangutang", .2, .2);
		this.length=1;
		this.width=1;
	}
	public void setLength()
	{
		this.length=length;
	}
	public void setWidth()
	{
		this.width=width;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getArea() 
	{
		double area = this.length*this.width;
		return area;
	}
	public double getPerimeter() 
	{
		double perimeter = (2*this.length) + (2*this.width);
		return perimeter;
	}
	public String toString()
	{
		return super.toString()+", "+length+", "+width;
	} 
	
}
