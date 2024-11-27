package in.org.rebit.taskplanner;

import java.util.Scanner;

import in.org.rebit.taskplanner.entity.Task;
import in.org.rebit.taskplanner.factory.BeanFactory;
import in.org.rebit.taskplanner.service.TaskService;
import in.org.rebit.taskplanner.view.TaskView;

public class TaskPlannerApplication {


	public static void main(String[] args) {

		
		
		BeanFactory factory = new BeanFactory();

		//"coding to interfaces" - NEEDED for loose coupling
		//creating resources (objects)
		//make sure ONLY one object created for each resource
		TaskView view = factory.getTaskView();
		TaskService service = factory.getTaskService();
		Scanner sc = new Scanner(System.in);
		
		int option = 0;

		do 
		{
			view.showHeader();
			view.showMenu();
			view.printMessage("Enter your choice");
			option = view.acceptInt(sc);
			
			
			switch (option) 
			{
			case 1 :
				Task taskToBecreated = new Task(1, false, "Learn Java");
				service.assignTask(taskToBecreated);
				break;
				
			case 2:
				view.printMessage("Enter Id");
				int id = view.acceptInt(sc);
				Task foundTask = service.searchTaskById(id);
				
				if(foundTask != null)
				{
					System.out.println(foundTask);
				}
				else
				{
					view.printMessage("Task with id " + id + " NOT FOUND",0);
				}
				
				break;
			
			case 3:
				view.printMessage("Enter Id");
				id = view.acceptInt(sc);
				Task taskToBeUpdated = service.searchTaskById(id);
				taskToBeUpdated.setStatus(true);
				service.modifyTask(taskToBeUpdated);
			
				break;
				
			case 4:
				view.printMessage("Enter Id");
				id = view.acceptInt(sc);
				boolean isDeleted = service.removeTask(id);
				
				if(isDeleted)
					view.printMessage("Task deleted with id " + id);
				else
					view.printMessage("Task deleted with id " + id + " NOT deleted",0);
				
			default:
				break;
			}
			
		} while (option != -1);
		
		sc.close();//closing resource is MUST to avoid any resource leakage
	}
	
	
}
