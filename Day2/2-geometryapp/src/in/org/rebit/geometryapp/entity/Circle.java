package in.org.rebit.geometryapp.entity;

public class Circle {

	private String color;
	
	public Circle(String color) {
		this.color = color;
	}

	public void drawCircle() {
		System.out.println("Circle drawn using " + this.color);
	}
	
	public String calculateArea()
	{
		return "PT * r * r";
	}
}
