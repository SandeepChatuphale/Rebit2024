
public class Developer extends Employee{

	//co-variant return type hence return type can be changed
	@Override
	public String getValue()
	{
		return "";
	}


	//ERROR - incompatible return type with super class method return type
	/*@Override
	public int getValue()
	{
		return 9;
	}*/
}
