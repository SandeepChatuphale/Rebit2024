package in.org.rebit.taskplanner.exception;

import java.sql.SQLException;

public class TaskNotFoundException extends Exception{

	public TaskNotFoundException(SQLException e) {
		// TODO Auto-generated constructor stub
		super(e);
	}

}
