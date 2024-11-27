
public class NeedofExceptionHandling {

	public static void main(String[] args) {

		String s = null;
		try {
			// doubtful statements
			System.out.println(args[0]);
			System.out.println(s.length());
			System.out.println(10 / 0);
			System.out.println("After");
		}
		// statement

		catch (ArithmeticException e) {
			// handle the exception
			// print user friendly message to user
			System.out.println("Can not divide by zero");
		} catch (NullPointerException e) {
			System.out.println("null");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
		System.out.println("Thank you");
		}
	}

}
