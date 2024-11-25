
public class DemoIf {

	public static void main(String[] args) {

		int age = 10;
		
		//if(age)//error result MUST be boolean
		if(age >= 18) {
			System.out.println("Eligible for voting");
			int temp = 20;//local variable to if block
		}
		//NO Statement is allowed HERE
		//System.out.println("in between");//error
		else
		{
			System.out.println("NOT eligible");
		}
		//System.out.println(temp);//error scope is limited to if block
	}

}
