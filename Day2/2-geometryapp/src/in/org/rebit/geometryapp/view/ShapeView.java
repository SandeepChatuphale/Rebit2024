package in.org.rebit.geometryapp.view;

import in.org.rebit.geometryapp.entity.Circle;
import in.org.rebit.geometryapp.entity.Rectangle;

public class ShapeView {

	//method capable of drawing any shape passed to it
	public static void drawShape(Circle c)
	{
		c.drawCircle();
	}
	
	//method capable of drawing any shape passed to it
		public static void drawShape(Rectangle r)
		{
			r.drawRectangle();
		}
}
