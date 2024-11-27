package in.org.rebit.taskplanner.view.impl;

import java.util.Scanner;

import in.org.rebit.taskplanner.view.TaskView;

public class TaskViewImpl implements TaskView{

	@Override
	public void showMenu() {
//		printMessage(
//				"1. Create new Task\n" + "2. Find Task Task\n" + "3. Update Task\n" + "4. Delete Task\n" + "-1. Exit");

		// Text block - used for multi line String
		printMessage("""
		1.Create new Task
		2. Find Task
		3. Update
		4. Delete
		-1 Exit
				""");
	}

	@Override
	public void showHeader() {
		printMessage("Welome to TaskApp");
		
	}

	@Override
	public void showFooter() {
		printMessage("@2024; Rebit");
	}

	@Override
	public void printMessage(String message) {
		System.out.println(message);
		
	}
	
	@Override
	public void printMessage(String message,int type) {
		if(type == 1)
			printMessage(message);
		else
			System.err.println(message);
	}

	@Override
	public int acceptInt(Scanner sc) {
	
		int number = sc.nextInt();
		return number;
	}

	
}
