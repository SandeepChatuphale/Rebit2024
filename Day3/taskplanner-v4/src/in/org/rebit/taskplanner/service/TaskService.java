package in.org.rebit.taskplanner.service;

import in.org.rebit.taskplanner.entity.Task;

public interface TaskService {

	Task assignTask(Task taskToBeAssigned);
	
	//removeTask
	boolean removeTask(int id);
	
	//modifyTask
	Task modifyTask(Task taskToBeModified);
	
	//searchTask
	Task searchTaskById(int id);
}
