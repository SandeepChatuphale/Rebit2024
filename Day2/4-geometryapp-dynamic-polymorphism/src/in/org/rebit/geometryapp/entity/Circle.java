package in.org.rebit.geometryapp.entity;

public class Circle extends Shape {
	
	public Circle(String color) {
		super(color);//invokes immediate super class constructor accepting string
	}

	@Override
	public void draw() {
		System.out.println("Circle drawn using " + this.color);
	}
	
	public String calculateArea()
	{
		return "PT * r * r";
	}
}