package in.org.rebit.geometryapp.entity;

abstract public class Shape extends Object {

	protected String color;

	public Shape(String color) {
		super();
		this.color = color;
	}
	
	abstract public void draw() ;
	
	

}
