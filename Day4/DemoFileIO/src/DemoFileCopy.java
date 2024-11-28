import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileCopy {

	public static void main(String[] args) {
		try(
				FileReader fr = new FileReader("README.txt");
				FileWriter fw = new FileWriter("copy.txt");
			)
		{
			int data = fr.read();
			
			while(data != -1)
			{
				fw.write(data);
				data = fr.read();
			}
			System.out.println("File copied");
		}
		catch (IOException e) {
		}
	}

}
