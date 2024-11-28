package in.org.rebit.taskplanner.view;

import java.util.Scanner;

public interface TaskView {

	void showMenu();
	void printMessage(String message);
	void printMessage(String message, int type);
	void showHeader();
	void showFooter();
	
	
	int acceptInt(Scanner sc);
	String acceptString(Scanner sc);
	
}
