package in.org.rebit.taskplanner;

import java.util.Scanner;

import in.org.rebit.taskplanner.dao.TaskDao;
import in.org.rebit.taskplanner.dao.impl.TaskInmemoryDaoImpl;
import in.org.rebit.taskplanner.entity.Task;

public class TaskPlannerApplication {

	public static void main(String[] args) {

		// System is class
		// out is a static variable of type PrintStream inside System
		// print() is method of printstream
		System.out.print("Number of Pending tasks are ");
		System.out.println(Task.getCount());
		Scanner sc = new Scanner(System.in);
		
		//creating object of TaskInmemoryDaoImpl leads to tight coupling
		//TO-DO need to remove
		//"coding to interfaces" - NEEDED for loose coupling
		TaskDao dao = new TaskInmemoryDaoImpl();
		int option = 0;

		do {
			System.out.println("Welome to TaskApp");
			showMenu();
			System.out.println("Enter your choice");
			option = sc.nextInt();
			
			
			switch (option) 
			{
			case 1 :
				Task taskToBecreated = new Task(1, false, "Learn Java");
				dao.save(taskToBecreated);
				break;
				
			case 2:
				System.out.println("Enter Id");
				int id = sc.nextInt();
				Task foundTask = dao.findById(id);
				
				if(foundTask != null)
				{
					System.out.println(foundTask);
				}
				else
				{
					System.err.println("Task with id " + id + " NOT FOUND");
				}
				
				break;
			
			case 3:
				System.out.println("Enter Id");
				id = sc.nextInt();
				Task taskToBeUpdated = dao.findById(id);
				taskToBeUpdated.setStatus(true);
				dao.update(taskToBeUpdated);
			
				break;
				
			case 4:
				System.out.println("Enter Id");
				id = sc.nextInt();
				boolean isDeleted = dao.deleteById(id);
				
				if(isDeleted)
					System.out.println("Task deleted with id " + id);
				else
					System.err.println("Task deleted with id " + id + " NOT deleted");
				
			default:
				break;
			}
			
		} while (option != -1);
	}
	
	//helper method
	private static void showMenu()
	{
		/*
		System.out.println("1. Create new Task\n"+
						   "2. Find Task Task\n"+
							"3. Update Task\n"+
							"4. Delete Task\n"+
							"-1. Exit");*/
		
		//Text block - used for multi line String
		System.out.println("""
					
				""");
	}
}
