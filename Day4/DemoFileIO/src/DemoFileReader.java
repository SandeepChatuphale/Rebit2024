import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {

		FileReader fr = null;
		
		try {
			fr = new FileReader("D:\\training\\Day4\\DemoFileIO\\README.txt");
			int data = fr.read();
			
			while(data != -1)//till end of has not reached
			{
				System.out.print((char)data);
				data = fr.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
