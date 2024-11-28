package in.org.rebit.taskplanner.util;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

	private String fileName;
	
	public Logger(String fileName) {
		this.fileName = fileName;
	}
	
	public void writeLog(String logLevel,String method,String description)
	{
		String log = logLevel+"  "+method +"  "+description;
		
		try(FileWriter fw = new FileWriter(this.fileName, true))
		{
			fw.write(log+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
