package in.org.rebit.taskplanner.dao.impl;

import java.sql.SQLException;

import in.org.rebit.taskplanner.dao.TaskDao;
import in.org.rebit.taskplanner.entity.Task;

public class TaskInmemoryDaoImpl implements TaskDao{

	//Create
	public Task save(Task taskTobeCreated){
		//responsible for saving task to data-store
		System.out.println("In save");
		Task createdTask = null;
		
		//send an email - call method which is sending email
		return createdTask;
	}
	
	//Read
	public Task findById(int id) {
		//responsible for retrieving task from data-store based on id
		System.out.println("In findById");
		Task foundTask = null;
		return foundTask;
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
	
	
	
	
	
	
	
	
	
}
