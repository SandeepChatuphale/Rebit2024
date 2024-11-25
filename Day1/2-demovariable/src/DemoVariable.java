
public class DemoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		int num;
		
		//local variables MUST be initialized before aceessing
		//System.out.println(num);//error
		
		//initialization
		num = 20;
		
		
		int empId = 10;
		System.out.println(empId);
		
		boolean result = true;
		System.out.println(result);
		
		//empId = false;
		
		long l = 100;
		l = empId;/*implicit conversion*/
		
		empId =(int)l;//Explicit conversion(Typecast)
		float salary=78.8f;
		
	}

}
