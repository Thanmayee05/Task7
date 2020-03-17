package epamTask.task731;
public class names implements container 
{
	public String name[]={"Rahul Kumar", "Shiva Ram","Rishi Kapoor","Hemant Mishra"};
	public iterator getIterator() 
	{  
        return new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements iterator
    {  
        int i;  
        public boolean hasNext() 
        {  
        	if (i<name.length)
            {  
                return true;
            }  
            return false;  
        }  
        public Object next() 
        {  
            if(this.hasNext())
            {  
                return name[i++];  
            }  
            return null;     
        }  
    }  
} 