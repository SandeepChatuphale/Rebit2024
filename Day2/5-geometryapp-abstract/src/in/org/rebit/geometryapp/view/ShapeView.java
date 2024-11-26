package in.org.rebit.geometryapp.view;

import in.org.rebit.geometryapp.entity.Circle;
import in.org.rebit.geometryapp.entity.Rectangle;
import in.org.rebit.geometryapp.entity.Shape;

public class ShapeView {

		
	public static void drawShape(Shape  s)
	{
		s.draw();//dynamic polymorphism
					//execution of method is based on type of object at runtime
	}
	
	
	
}
