package epamTask.task712;
public class singleton 
{
	private static singleton s = new singleton();
	private singleton()
	{
		
	}
	public static singleton getObj()
	{
	   return s;
	}
	public void show()
	{
	   System.out.println("It's a singleton pattern type");
	}
}
