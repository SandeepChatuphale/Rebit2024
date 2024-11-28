package in.org.rebit.taskplanner;

import java.util.Scanner;

import in.org.rebit.taskplanner.entity.Task;
import in.org.rebit.taskplanner.exception.TaskNotFoundException;
import in.org.rebit.taskplanner.factory.BeanFactory;
import in.org.rebit.taskplanner.service.TaskService;
import in.org.rebit.taskplanner.util.Logger;
import in.org.rebit.taskplanner.view.TaskView;

public class TaskPlannerApplication {

	public static void main(String[] args) {

		BeanFactory factory = new BeanFactory();
		Logger logger = factory.getLogger();

		// "coding to interfaces" - NEEDED for loose coupling
		// creating resources (objects)
		// make sure ONLY one object created for each resource
		TaskView view = factory.getTaskView();
		TaskService service = factory.getTaskService();
		Scanner sc = new Scanner(System.in);

		try {

			int option = 0;

			do {
				view.showHeader();
				view.showMenu();
				view.printMessage("Enter your choice");
				option = view.acceptInt(sc);

				switch (option) {
				case 1:
					view.printMessage("Enter Task");
					String name = view.acceptString(sc);
					Task taskToBecreated = new Task(false, name);
					Task createdTask = service.assignTask(taskToBecreated);
					view.printMessage("Your task is assigned with ID " + createdTask.getId());
					break;

				case 2:
					view.printMessage("Enter Id");
					int id = view.acceptInt(sc);
					Task foundTask;
					try 
					{
						foundTask = service.searchTaskById(id);
						System.out.println(foundTask);
					}
					catch (TaskNotFoundException e) {
						logger.writeLog("ERROR", "searchTaskById", "Task with id " + id + " NOT FOUND");
						e.printStackTrace(); //this is for developer for debugging purpose
						view.printMessage("Task with id " + id + " NOT FOUND", 0);//end USER
						
					}

					break;

				case 3:
					view.printMessage("Enter Id");
					id = view.acceptInt(sc);
					Task taskToBeUpdated;
					try 
					{
						taskToBeUpdated = service.searchTaskById(id);
						taskToBeUpdated.setStatus(true);
						service.modifyTask(taskToBeUpdated);
					}
					catch (TaskNotFoundException e) 
					{
						e.printStackTrace();
					}
					

					break;

				case 4:
					view.printMessage("Enter Id");
					id = view.acceptInt(sc);
					boolean isDeleted = service.removeTask(id);

					if (isDeleted)
						view.printMessage("Task deleted with id " + id);
					else
						view.printMessage("Task deleted with id " + id + " NOT deleted", 0);

				default:
					break;
				}

			} while (option != -1);
		} 
		finally {
			sc.close();// closing resource is MUST to avoid any resource leakage
		}
	}

}
