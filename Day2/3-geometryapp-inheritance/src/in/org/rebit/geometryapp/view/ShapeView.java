package in.org.rebit.geometryapp.view;

import in.org.rebit.geometryapp.entity.Circle;
import in.org.rebit.geometryapp.entity.Rectangle;
import in.org.rebit.geometryapp.entity.Shape;

public class ShapeView {

	//method capable of drawing any shape passed to it
//	public static void drawShape(Circle c)
//	{
//		c.drawCircle();
//	}
//
//	//method capable of drawing any shape passed to it
//	public static void drawShape(Rectangle r)
//	{
//		r.drawRectangle();
//	}
	
	public static void drawShape(Shape  s)
	{
		s.drawCircle();//dynamic polymorphism
					//execution of method is based on type of object at runtime
		
		
	}
	
	
	
}
