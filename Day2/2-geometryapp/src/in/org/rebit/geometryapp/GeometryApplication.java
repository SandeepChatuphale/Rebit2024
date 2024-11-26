package in.org.rebit.geometryapp;

import in.org.rebit.geometryapp.entity.Circle;
import in.org.rebit.geometryapp.entity.Rectangle;
import in.org.rebit.geometryapp.view.ShapeView;

public class GeometryApplication {

	public static void main(String[] args) {

		Circle c = new Circle("Green");
		//c.drawCircle();
		
		Rectangle r = new Rectangle("Red");
		//r.drawRectangle();
		ShapeView.drawShape(c);
		ShapeView.drawShape(r);
	}
	
	

}
