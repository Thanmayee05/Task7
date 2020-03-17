package epamTask.Task722;

public class qformat extends qManager
{
	public qformat(String catalog)
	{  
		super(catalog);  
	}  
    public void displayAll() 
    {  
        System.out.println("\n----------------------------------------------");  
        super.displayAll();  
        System.out.println("------------------------------------------------");  
    }  
}
