package in.org.rebit.taskplanner.entity;

//import java.lang.*;//this is automatically imported even if not written
				//nobody writes this

/**
 * 
 */
public class Task {

	//static OR class variable
	//single copy exists (irrespective of number of instances)
	private static int count;
	
	//instance variables
	private int id;
	private boolean status;
	private String name;
		
	//constructor
	//syntax:- access_specifier name_of_the_class(args if any){}
	//constructor overloading
	public Task() {
		System.out.println("In Task()");
	}
	public Task(int id,boolean status,String name)
	{
			this.id = id;
			this.name = name;
			this.status = status;
			System.out.println("In parameterized construtor");
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public static int getCount()
	{
		return count;
	}
	
	public void setStatus(boolean s)
	{
		status = s;
	}
	
	public boolean isStatus()
	{
		return this.status;
	}
	
	//syntax:- access_specifier return_type name_of_method(args if any){}
	
	//instance method
	public void display()
	{
		System.out.println(this.id);
		System.out.println(this.status);
		System.out.println(this.name);
	}


}




