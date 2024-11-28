import java.util.Scanner;

public class DemoARM {

	public static void main(String[] args) {
		Scanner sc = null;
		//Old approach
		try {
			sc = new Scanner(System.in);
		}
		finally {
			sc.close();
		}
		
		//new approach with try with resources
		try(Scanner s = new Scanner(System.in))
		{
			
		}
		
		
	}

}
