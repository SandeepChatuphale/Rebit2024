package in.org.rebit.taskplanner.service.impl;

import java.sql.SQLException;

import in.org.rebit.taskplanner.dao.TaskDao;
import in.org.rebit.taskplanner.entity.Task;
import in.org.rebit.taskplanner.exception.TaskNotFoundException;
import in.org.rebit.taskplanner.exception.dao.NoRecordFoundException;
import in.org.rebit.taskplanner.service.TaskService;

//responsible for handling/dealing with business logic
public class TaskServiceImpl implements TaskService {

	// this leads to tight coupling
	// private TaskDao dao = new TaskDatabaseDaoImpl();

	private TaskDao dao;

	// dependency injection using constructor
	// public TaskServiceImpl(TaskDao dao) {
	// this.dao = dao;
	// }

	// dependency injection - setter
	public void setDao(TaskDao dao) {
		this.dao = dao;
	}

	public Task assignTask(Task taskToBeAssigned) {
		// BeanFactory factory = new BeanFactory();
		// dao = factory.getTaskDao();

		System.out.println("Task assigned");

		// save to DB
		return this.dao.save(taskToBeAssigned);
	}

	@Override
	public boolean removeTask(int id) {
		return this.dao.deleteById(id);
	}

	@Override
	public Task modifyTask(Task taskToBeModified) {
		return this.dao.update(taskToBeModified);
	}

	@Override
	public Task searchTaskById(int id) throws TaskNotFoundException {
		Task searchedTask;
		try
		{
			searchedTask = this.dao.findById(id);
			return searchedTask;
		}
		catch (NoRecordFoundException e) {
			throw new TaskNotFoundException(id,e);
		}
		
	}
}
