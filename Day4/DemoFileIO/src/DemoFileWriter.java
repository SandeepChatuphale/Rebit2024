import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("data.txt",true))
		{
			fw.write("Hello using FileWriter");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
