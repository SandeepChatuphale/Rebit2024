
public class DemoWhile {

	public static void main(String[] args) {

		int number = 54;
		int count = 2;
		boolean flag = false;
		while(count < number)
		{
			if(number % count == 0)
			{
				flag = true;
				break;//break the loop
			}
			count++;
		}
		
		if(!flag)
		{
			System.out.println("It is Prime");
		}
		else
		{
			System.out.println("NOT Prime");
		}
		
	}

}
