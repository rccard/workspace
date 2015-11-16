import java.util.ArrayList;
import java.util.Scanner;


public class Circle extends TwoDShape implements GeometricFigure
{
	private double radius;
	private static final double PI = 3.14;
	
	public Circle(String color, int x, int y, int radius)
	{
		super(color,x,y);
		this.radius=radius;
	}
	public Circle()
	{
		super("orangutang", .1, .1);
		this.radius=1;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius()
	{
		this.radius=radius;
	}
	//instance method
	//use when the method is related to and depends on a particular
	//object of the class(it has to access private data members of the class)
	public double getArea()
	{
		double area = PI * Math.pow(this.radius,2);
		return area;
	}
	public double getPerimeter()
	{
		double perimeter = 2*PI*this.radius;
		return perimeter;
	}
	public String toString()
	{
		return super.toString()+", "+radius;
	} 
		public static void main(String[] args)
		{
			ArrayList<GeometricFigure> list = new ArrayList<GeometricFigure>();
			
			Circle c1 = new Circle();
			Circle c2 = new Circle("Blue", 5, 6, 3);
			
			Rectangle r1 = new Rectangle();
			Rectangle r2 = new Rectangle("Red", 7, 8, 5, 5);
			
			TwoDShape TwoD1 = new Circle("New Circle", 9, 10, 3);
			TwoDShape TwoD2 = new Rectangle("New Rect", 11, 12, 6,6);
						
			System.out.println("======Circles=======");
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println("c1 area: "+c1.getArea());
			System.out.println("c2 area: "+c2.getArea());
			System.out.println("c1 perim: "+c1.getPerimeter());
			System.out.println("c2 perim: "+c2.getPerimeter());
			
			System.out.println("======Rectangles======");
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println("r1 area: "+r1.getArea());
			System.out.println("r2 area: "+r2.getArea());
			System.out.println("r1 perim: "+r1.getPerimeter());
			System.out.println("r2 perim: "+r2.getPerimeter());
			
			System.out.println("======Shapes======");
			
			System.out.println(TwoD1);
			System.out.println(TwoD2);
			System.out.println("TwoD1 area: "+TwoD1.getArea());
			System.out.println("TwoD2 area: "+TwoD2.getArea());
			System.out.println("TwoD1 perim: "+TwoD1.getPerimeter());
			System.out.println("TwoD2 perim: "+TwoD2.getPerimeter());
		}
}
