import java.io.FileNotFoundException;

class A {
	void hi()throws Exception {}
}


class B extends A{
	void hi()throws FileNotFoundException {}
}

public class DemoThrows {

	public static void main(String[] args)throws Exception {
		display();
	}
	
	static void display()throws Exception
	{
		hi();
	}
	static void hi()throws Exception
	{
		
		throw new Exception();
	}
}
