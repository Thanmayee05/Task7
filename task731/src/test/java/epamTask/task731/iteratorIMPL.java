package epamTask.task731;
public class iteratorIMPL 
{
	public static void main(String[] args) 
	{  
        names cmpnyRepository = new names();  
        for(iterator iter = cmpnyRepository.getIterator(); iter.hasNext();)
        {  
            String name = (String)iter.next();  
            System.out.println("Name : " + name); 
        }      
	}  

}
