package in.org.rebit.geometryapp.entity;

public class Rectangle extends Shape {
	
	public Rectangle(String color)
	{
		super(color);
	}
	
	public void drawRectangle()
	{
		System.out.println("Drawing Rectangle with " + this.color);
	}
	
	public String calculateArea()
	{
		return "l * b";
	}
}
