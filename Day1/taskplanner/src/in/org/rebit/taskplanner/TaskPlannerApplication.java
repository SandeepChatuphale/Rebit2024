package in.org.rebit.taskplanner;

import in.org.rebit.taskplanner.entity.Task;

public class TaskPlannerApplication {

	public static void main(String[] args) {

		//reference of type Task
		Task t;
		//System.out.println(t); //ERROR
		
		
		//System is class
		//out is a static variable of type PrintStream inside System
		//print() is method of printstream
		System.out.print("Number of Pending tasks are ");
		System.out.println(Task.getCount());
		
		
		//Object creation of Task class
		t = new Task(1,true,"Learn Java");
		
		//System.out.println(t);
		
		//invoking method using dot operator
		t.display();
		
		Task t1 = new Task(2, false, "Learn React");
		t1.display();
	}

}
