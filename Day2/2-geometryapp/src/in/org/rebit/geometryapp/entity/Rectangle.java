package in.org.rebit.geometryapp.entity;

public class Rectangle {

	private String color;
	
	public Rectangle(String color)
	{
		this.color = color;
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
