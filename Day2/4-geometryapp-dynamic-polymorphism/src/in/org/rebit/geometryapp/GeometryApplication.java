package in.org.rebit.geometryapp;

import in.org.rebit.geometryapp.entity.Circle;
import in.org.rebit.geometryapp.entity.Rectangle;
import in.org.rebit.geometryapp.entity.Triangle;
import in.org.rebit.geometryapp.view.ShapeView;

public class GeometryApplication {

	public static void main(String[] args) {

		Circle c = new Circle("Green");
		//c.drawCircle();
		
		Rectangle r = new Rectangle("Red");
		Triangle t = new Triangle("Yellow");
		//r.drawRectangle();
		ShapeView.drawShape(c);//passing circle
		ShapeView.drawShape(r);//passing rectangle
		ShapeView.drawShape(t);//passing rectangle
	}
	
	

}
