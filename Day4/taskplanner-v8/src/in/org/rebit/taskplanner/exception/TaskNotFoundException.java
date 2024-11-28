package in.org.rebit.taskplanner.exception;

public class TaskNotFoundException extends Exception{

	private int id;
	
	public TaskNotFoundException(int id,Exception e){
		super(e);//passing exception to super class
		this.id = id;
		
	}
	

		@Override
	public String toString()
	{
		return "Task with id " + id + " NOT FOUND";
	}
}
