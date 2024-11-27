package in.org.rebit.taskplanner.factory;

import in.org.rebit.taskplanner.dao.TaskDao;
import in.org.rebit.taskplanner.dao.impl.TaskInmemoryDaoImpl;
import in.org.rebit.taskplanner.service.TaskService;
import in.org.rebit.taskplanner.service.impl.TaskServiceImpl;
import in.org.rebit.taskplanner.view.TaskView;
import in.org.rebit.taskplanner.view.impl.TaskViewImpl;

public class BeanFactory {
	
	public TaskDao getTaskDao()
	{
		TaskInmemoryDaoImpl daoImpl = new TaskInmemoryDaoImpl();
		return daoImpl;
	}
	
	public TaskService getTaskService()
	{
		TaskServiceImpl service = new TaskServiceImpl();
		service.setDao(getTaskDao());
		return service;
	}
	
	
	public TaskView getTaskView()
	{
		TaskViewImpl view = new TaskViewImpl();
		return view;
	}
	
}
