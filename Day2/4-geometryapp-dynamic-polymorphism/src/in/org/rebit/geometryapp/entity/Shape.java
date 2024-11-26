package in.org.rebit.geometryapp.entity;

public class Shape extends Object {

	protected String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	//though we have written this method
	//BAD DESIGN
	//this is specific to circle -
	//THIS MUST BE AVOIDED
	public void draw() {
		System.out.println("in draw of Shape");
	}
	
	

}
