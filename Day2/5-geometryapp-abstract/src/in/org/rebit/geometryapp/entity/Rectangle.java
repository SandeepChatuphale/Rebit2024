package in.org.rebit.geometryapp.entity;

public class Rectangle extends Shape {
	
	public Rectangle(String color)
	{
		super(color);
	}
	
	@Override
	public void draw()
	{
		System.out.println("Drawing Rectangle with " + this.color);
	}
	
	public String calculateArea()
	{
		return "l * b";
	}
}
