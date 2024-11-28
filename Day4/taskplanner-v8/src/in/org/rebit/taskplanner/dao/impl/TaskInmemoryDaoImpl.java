package in.org.rebit.taskplanner.dao.impl;

import java.util.ArrayList;
import java.util.List;

import in.org.rebit.taskplanner.dao.TaskDao;
import in.org.rebit.taskplanner.entity.Task;
import in.org.rebit.taskplanner.exception.dao.NoRecordFoundException;

public class TaskInmemoryDaoImpl implements TaskDao{
	
	private List<Task> tasks;
	
	public TaskInmemoryDaoImpl() {
		this.tasks = new ArrayList<>();
	}

	//Create
	public Task save(Task taskTobeCreated){
		//responsible for saving task to data-store
		System.out.println("In save");
		tasks.add(taskTobeCreated);
		return taskTobeCreated;
	}
	
	//Read
	public Task findById(int id) throws NoRecordFoundException {
		//responsible for retrieving task from data-store based on id
		System.out.println("In findById");
		
		for (Task task : tasks) 
		{
			if(task.getId() == id)
				return task;
		}		
		throw new NoRecordFoundException();
	}
	
	
	//Update
	public Task update(Task taskToBeUpdated)
	{
		Task updatedTask = null;
		System.out.println("In update");
		return updatedTask;
	}
	
	//Delete 
	public boolean deleteById(int id)
	{
		System.out.println("Deleting task");
		return false;
	}

	@Override
	public List<Task> findAll() {
		return this.tasks;
	}
	

	
}
